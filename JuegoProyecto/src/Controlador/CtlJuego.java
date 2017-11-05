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
import Vista.Login.pnlRegistro;
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
    ArrayList<Puntuacion> listaPuntuacio = new ArrayList<>();
    Puntuacion punta = new Puntuacion();

    public CtlJuego() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }

    public DefaultTableModel listarPuntuacion(int cedula) {

        String[] nombreColumnas = {"Nombre del juego", "Puntuación"};

        ArrayList<String> puntua = new ArrayList<>();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet resultado = dao.traerBuscar("resultado", "cedula", cedula + "");

        try {
            while (resultado.next()) {
                puntua.add(traerDato(resultado.getString("idJuego")));
                puntua.add(resultado.getString("puntaje"));
            }
        } catch (Exception e) {
        }

        int gdeveinte = 0, contador = 0;
            for (int i = 0; i < puntua.size(); i++) {
                if (contador == 19) {
                    gdeveinte++;
                    contador = -1;
                }
                contador++;
            }
            int suma = 0;
            contador = 0;
            int contador1 = 20;

            for (int i = 0; i < gdeveinte; i++) {
                for (int j = contador; j < contador1; j++) {
                    if (j % 2 != 0) {
                        suma += Integer.parseInt(puntua.get(j));
                    }
                    if (j == contador1 - 2) {
                        if (model.getRowCount() == 0) {
                            model.addRow(new Object[]{puntua.get(contador1 - 2), suma});
                        } else {
                            int posicion = -1;
                            for (int k = 0; k < model.getRowCount(); k++) {
                                if ((int) model.getValueAt(k, 1) < suma) {
                                    posicion = k;
                                    break;
                                }
                            }
                            if (posicion != -1) {
                                model.insertRow(posicion, new Object[]{puntua.get(contador1 - 2), suma});
                            } else {
                                model.addRow(new Object[]{puntua.get(contador1 - 2), suma});
                            }
                        }
                        suma = 0;
                    }
                }
                contador += 20;
                contador1 += 20;
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

    public String traerDato(String idJuego) {
        return dao.traerDato("juego", "nombreJuego", "idJuego", idJuego);
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
            listaPuntuacio.add(punta);
        }

        for (int x = 0; x < listaPuntuacio.size(); x++) {
            model.addRow(new Object[]{listaPuntuacio.get(x).getCedula(), listaPuntuacio.get(x).getNombreUsuario(), listaPuntuacio.get(x).getPuntuacion()});
        }
        pnlIniciarSesion.listaCedulas = new ArrayList<>();
        return model;

    }
}
