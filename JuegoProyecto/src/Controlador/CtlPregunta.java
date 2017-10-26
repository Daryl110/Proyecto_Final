/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Opcion;
import Modelo.Pregunta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daryl Ospina
 */
public class CtlPregunta {

    private final DAO dao;
    private final CtlDAO controladorDAO;

    public CtlPregunta() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }

    public Pregunta traerPregunta(int id) {
        return (Pregunta) controladorDAO.sqlToObject("pregunta", "idPregunta", id + "", new Pregunta(0, "", 0));
    }

    public ArrayList<Opcion> getOpciones(int idPregunta) {
        ArrayList<Opcion> opciones = new ArrayList<>();
        int[] idOpciones = traerOpciones(idPregunta);

        for (int i = 0; i < idOpciones.length; i++) {
            opciones.add((Opcion) controladorDAO.sqlToObject("opcion", "idOpcion", idOpciones[i] + "", new Opcion(0, 0, "")));
        }

        return opciones;
    }

    public int getNumeroRegistros() {
        return controladorDAO.getNumeroRegistros("pregunta");
    }

    private int[] traerOpciones(int id) {
        int[] opciones = new int[4];
        ResultSet rb = dao.traerBuscar("opcion", "idPregunta", id + "");

        try {
            int i = 0;
            while (rb.next()) {
                opciones[i] = rb.getInt("idOpcion");
                i++;
            }
        } catch (SQLException e) {

        }
        return opciones;
    }

    public void calificar(ArrayList<int[]> selecciones, ArrayList<ArrayList<Opcion>> opciones) {
        boolean incorrecta = true;
        int correctas = 0;
        for (int i = 0; i < selecciones.size(); i++) {
            for (int j = 0; j < selecciones.get(i).length; j++) {
                if (selecciones.get(i)[j] + opciones.get(i).get(j).getCorrecta() != 2) {
                    incorrecta = false;
                }
            }
            if (incorrecta) {
                correctas++;
            }
        }
        System.out.println(correctas);
    }
}
