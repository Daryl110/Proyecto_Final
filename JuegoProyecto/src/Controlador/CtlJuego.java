/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Juego;
import Modelo.Puntuacion;
<<<<<<< HEAD
import Vista.Login.pnlIniciarSesion;
import Vista.Login.pnlRegistro;
=======
>>>>>>> a1887d1fb4dab20b0b9326af7b15655504c1c03b
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

<<<<<<< HEAD
=======
    public ArrayList<String> getListaCedulas() {
        return listaCedulas;
    }

    public DefaultTableModel listarPuntuacion(int cedula) {

        String[] nombreColumnas = {"Nombre del juego", "Puntuación"};
        
        ArrayList<String> puntua = new ArrayList<>();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet resultado = dao.traerBuscar("resultado", "cedula", cedula + "");
        
        try {
            while (resultado.next()) {
                model.addRow(new Object[]{traerDato(resultado.getString("idJuego")),resultado.getString("puntaje")});
            }
        } catch (Exception e) {
        }
        
//        int[] puntuaciones = new int[10];
//        int contador = 0;
//        
//        for (int i = 0; i < puntua.size(); i++) {
//            for (int j = 0; j < 20; j++) {
//                if (j % 2 == 0) {
//                    puntuaciones[contador] += Integer.parseInt(puntua.get(j));
//                }
//            }
//            contador++;
//        }
        
        return model;
    }

    public void limpiarLista() {
        listaCedulas = new ArrayList<>();
    }

>>>>>>> a1887d1fb4dab20b0b9326af7b15655504c1c03b
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
            System.out.println(sentenciaSQL);
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
                System.out.println(e);
            }
            punta = new Puntuacion(pnlIniciarSesion.listaCedulas.get(i), suma, dao.traerDato("usuario", "nombreUsu", "cedula", pnlIniciarSesion.listaCedulas.get(i) + ""));
            listaPuntuacio.add(punta);
        }
//
//        ArrayList<Puntuacion> listaPuntuacio2 = new ArrayList<>();
//
//        int max = 0;
//        while (!listaPuntuacio.isEmpty()) {
//            for (int i = 0; i < listaPuntuacio.size(); i++) {
//                if (listaPuntuacio.get(i).getPuntuacion() > max) {
//                    max = listaPuntuacio.get(i).getPuntuacion();
//                    punta = listaPuntuacio.get(i);
//
//                }
//
//            }
//            for (int j = 0; j < listaPuntuacio.size(); j++) {
//                if (listaPuntuacio.get(j).getPuntuacion() == max) {
//                    listaPuntuacio.remove(j+1);
//                }
//            }
//
//            listaPuntuacio2.add(punta);
//    }
        for (int i = 0; i < listaPuntuacio.size(); i++) {
            model.addRow(new Object[]{listaPuntuacio.get(i).getCedula(), listaPuntuacio.get(i).getNombreUsuario(), listaPuntuacio.get(i).getPuntuacion()});
        }
        return model;
    }

}
