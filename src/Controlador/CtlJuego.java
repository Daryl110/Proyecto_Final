/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Juego;
import Modelo.Puntuacion;
import Vista.Login.pnlIniciarSesion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PCSHOP
 */
public class CtlJuego {

    private final DAO dao;
    private final CtlDAO controladorDAO;
    Puntuacion punta = new Puntuacion();

    public CtlJuego() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }

    public boolean validarJugador(String cedula, String idJuego) {
        ResultSet rb = dao.traerListar("resultado");
        try {
            while (rb.next()) {
                if (rb.getString("cedula").equals(cedula) && rb.getString("idJuego").equals(idJuego)) {
                    return false;
                }
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public void eliminarUltimoJuego() {
        String ultimoId = controladorDAO.getUltimoId("juego", "idJuego");
        dao.eliminar("juego", "idJuego", ultimoId);
    }

    public DefaultTableModel listarPuntuacion(int cedula) {

        String[] nombreColumnas = {"Nombre del juego", "Puntuación", "Fecha de juego"};

        ArrayList<String> puntua = new ArrayList<>();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet resultado = dao.traerBuscar("resultado", "cedula", cedula + "");

        try {
            while (resultado.next()) {
                puntua.add(traerNombreJuego(resultado.getString("idJuego")));
                puntua.add(resultado.getString("puntaje"));
                puntua.add(traerDato(resultado.getString("idJuego"), "fechaJuego"));
            }
        } catch (SQLException e) {

        }

        int gdeveinte = 0, contador = 0;
        for (String puntua1 : puntua) {
            if (contador == 29) {
                gdeveinte++;
                contador = -1;
            }
            contador++;
        }

        int suma = 0;
        contador = 0;
        int contador1 = 30;
        int aux = 0;

        for (int i = 0; i < gdeveinte; i++) {
            for (int j = contador; j < contador1; j++) {
                if (j == 1 || aux == j - 3) {
                    aux = j;
                    suma += Integer.parseInt(puntua.get(j));
                }
                if (j == contador1 - 2) {
                    model.addRow(new Object[]{puntua.get(contador1 - 3), (suma * 10) + "%", puntua.get(contador1 - 1)});
                }
            }
            suma = 0;
            contador += 30;
            contador1 += 30;
        }

        return model;
    }

    public boolean solicitudRegistro(int numeroJugadores, String nombreJuego, String fecha) {

        if (dao.validarCampo(nombreJuego, "nombreJuego", "juego")) {
            return false;
        }

        Juego juego = new Juego(numeroJugadores, nombreJuego, fecha);

        return controladorDAO.solicitudRegistro(juego, "juego");
    }

    public String traerIdJuego(String nombreJuego) {
        return dao.traerDato("juego", "idJuego", "nombreJuego", nombreJuego);
    }

    public String traerNombreJuego(String idJuego) {
        return dao.traerDato("juego", "nombreJuego", "idJuego", idJuego);
    }

    public String traerDato(String idJuego, String columna) {
        return dao.traerDato("juego", columna, "idJuego", idJuego);
    }

    public boolean registrarPreguntasJuego(int[] idPreguntas, int[] puntajes, int idJuego, int cedula) {
        for (int i = 0; i < 10; i++) {
            String sentenciaSQL = "INSERT INTO resultado(idPregunta,puntaje,cedula,idJuego) VALUES(" + idPreguntas[i] + "," + puntajes[i] + "," + cedula + "," + idJuego + ");";

            if (!dao.registrarYModificar(sentenciaSQL)) {
                return false;
            }
        }
        return true;

    }

    public DefaultTableModel listarPuntuacion(String nombreJuego) {

        String[] nombreColumnas = {"Cedula", "Nombre Usuario", "Puntaje"};

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        Puntuacion[] lista = new Puntuacion[pnlIniciarSesion.listaCedulas.size()];

        for (int i = 0; i < pnlIniciarSesion.listaCedulas.size(); i++) {
            ResultSet resultado = dao.traerBuscarAvanzado("resultado", "idJuego", dao.traerDato("juego", "idJuego", "nombreJuego", nombreJuego), "cedula", pnlIniciarSesion.listaCedulas.get(i));
            int suma = 0;
            try {
                while (resultado.next()) {
                    suma = suma + resultado.getInt("puntaje");
                }
            } catch (SQLException e) {
            }
            punta = new Puntuacion(pnlIniciarSesion.listaCedulas.get(i), suma, dao.traerDato("usuario", "nombreUsu", "cedula", pnlIniciarSesion.listaCedulas.get(i) + ""));
            lista[i] = punta;
        }

        for (int i = 0; i < lista.length ; i++) {
            int max = i;

            for (int j = i + 1; j < lista.length ; j++) {
                if (lista[j].getPuntuacion() > lista[max].getPuntuacion()) {
                    max = j;
                }
            }

            if (i != max) {
                Puntuacion aux = lista[i];
                lista[i] = lista[max];
                lista[max] = aux;
            }
        }

        for (Puntuacion lista1 : lista) {
            model.addRow(new Object[]{lista1.getCedula(), lista1.getNombreUsuario(), (lista1.getPuntuacion()*10)+"%"});
        }
        pnlIniciarSesion.listaCedulas = new ArrayList<>();
        return model;

    }

    public DefaultTableModel listaEstadistica() throws SQLException {
        String[] nombreColumnas = {"Nombre Usuario", "Puntaje", "Nombre de juego"};
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        int contador = 0;
        Puntuacion[] lista = new Puntuacion[controladorDAO.getNumeroRegistros("resultado") / 10];
        try {
            ResultSet resultado = dao.traerListar("resultado");
            if (resultado.next()) {
                int cedula = resultado.getInt("cedula");
                int idJuego = resultado.getInt("idJuego");
                int suma = resultado.getInt("puntaje");
                while (resultado.next()) {
                    if (idJuego == resultado.getInt("idJuego") && cedula == resultado.getInt("cedula")) {
                        suma = suma + resultado.getInt("puntaje");
                    } else {
                        punta = new Puntuacion(cedula + "", suma, idJuego + "");
                        lista[contador] = punta;
                        cedula = resultado.getInt("cedula");
                        idJuego = resultado.getInt("idJuego");
                        suma = resultado.getInt("puntaje");
                        contador++;
                    }
                }
                punta = new Puntuacion(cedula + "", suma, idJuego + "");
                lista[contador] = punta;

                for (int i = 0; i < lista.length; i++) {
                    int max = i;

                    for (int j = i + 1; j < lista.length; j++) {
                        if (lista[j].getPuntuacion() > lista[max].getPuntuacion()) {
                            max = j;
                        }
                    }

                    if (i != max) {
                        Puntuacion aux = lista[i];
                        lista[i] = lista[max];
                        lista[max] = aux;
                    }
                }
            }
            dao.eliminarTodo("reporteresultados");

            for (int i = 0; i < lista.length; i++) {
                model.addRow(new Object[]{dao.traerDato("usuario", "nombreUsu", "cedula", lista[i].getCedula()), (lista[i].getPuntuacion() * 10) + "%",
                     dao.traerDato("juego", "nombreJuego", "idJuego", lista[i].getNombreUsuario())
                });
                String sentencia = "insert into reporteresultados (cedula,nombreUsuario,resultado,nombreJuego) values('" + lista[i].getCedula() + "',"
                        + "'" + dao.traerDato("usuario", "nombreUsu", "cedula", lista[i].getCedula()) + "','" + (lista[i].getPuntuacion() * 10) + "%" + "',"
                        + "'" + dao.traerDato("juego", "nombreJuego", "idJuego", lista[i].getNombreUsuario()) + "')";

                dao.registrarYModificar(sentencia);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return model;
    }

}
