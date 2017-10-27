/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Juego;
import Modelo.Puntuacion;
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
    ArrayList<String> listaCedulas = new ArrayList<>();
    ArrayList<Puntuacion> listaPuntuacio = new ArrayList<>();
    Puntuacion punta = new Puntuacion();

    public CtlJuego() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }

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

        for (int i = 0; i < listaCedulas.size(); i++) {
            ResultSet resultado = dao.traerBuscarAvanzado("resultado", "idJuego", dao.traerDato("juego", "idJuego", "nombreJuego", nombreJuego), "cedula", listaCedulas.get(i));
            int suma = 0;
            try {
                while (resultado.next()) {
                    suma = suma + resultado.getInt("puntaje");
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            punta = new Puntuacion(listaCedulas.get(i), suma, dao.traerDato("usuario", "nombreUsu", "cedula", listaCedulas.get(i) + ""));
            listaPuntuacio.add(punta);
        }

        ArrayList<Puntuacion> listaPuntuacio2 = new ArrayList<>();

        int max = 0;
        int pos = 0;
        while (!listaPuntuacio.isEmpty()) {
            for (int i = 0; i < listaPuntuacio.size(); i++) {
                if (Integer.parseInt(listaPuntuacio.get(i).getCedula()) > max) {
                    max = Integer.parseInt(listaPuntuacio.get(i).getCedula());
                    punta = listaPuntuacio.get(i);
                    pos = i;

                }
            }
            listaPuntuacio.remove(pos);
            listaPuntuacio2.add(punta);
        }
        for (int i = 0; i < listaPuntuacio2.size(); i++) {
            model.addRow(new Object[]{listaPuntuacio2.get(i).getCedula(), listaPuntuacio2.get(i).getNombreUsuario(), listaPuntuacio2.get(i).getPuntuacion()});
        }
        return model;
    }

}
