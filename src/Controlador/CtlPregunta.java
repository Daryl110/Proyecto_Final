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
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

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

    public DefaultComboBoxModel listarTipoPregunta() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione un Tipo de pregunta");
        return dao.cargarInformacionCB("tipoPregunta", "enunciado", modelo);
    }

    public boolean añadirOpcion(int correcta, String enunciado) {
        int ultimoId = Integer.parseInt(controladorDAO.getUltimoId("pregunta", "idPregunta"));
        return controladorDAO.solicitudRegistro(new Opcion(ultimoId, correcta, enunciado), "opcion");
    }

    public int getUltimoId() {
        return Integer.parseInt(controladorDAO.getUltimoId("pregunta", "idPregunta"));
    }

    public String traerDato(String nombreTabla, String atributoSolicitado, String valorIgualar, String valor) {
        return dao.traerDato(nombreTabla, atributoSolicitado, valorIgualar, valor);
    }

    public boolean registrarPregunta(int idTema, int idTipoPregunta, String enunciado) {
        return controladorDAO.solicitudRegistro(new Pregunta(idTema, enunciado, idTipoPregunta), "pregunta");
    }

    public boolean modificarPregunta(String idPregunta, int idTema, int idTipoPregunta, String enunciado) {
        Pregunta preg = new Pregunta(idTema, enunciado, idTipoPregunta);
        return controladorDAO.solicitarModificar(preg, "pregunta", "idPregunta", idPregunta);
    }

    public boolean modificarOpcion(String idOpcion, String idPregunta, int correcta, String enunciado) {
        return controladorDAO.solicitarModificar(new Opcion(Integer.parseInt(idPregunta), correcta, enunciado), "opcion", "idOpcion", idOpcion);
    }

    public DefaultTableModel listarPreguntas() {
        return listarRegistro(dao.traerListar("pregunta"));
    }

    private DefaultTableModel listarRegistro(ResultSet resultado) {

        String[] nombreColumnas = {"Numero de la pregunta", "Enunciado", "Tema", "Tipo de Pregunta"};

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        try {
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("idPregunta"), resultado.getString("enunciado"),
                    dao.traerDato("tema", "nombre", "idTema", resultado.getString("idTema")),
                    dao.traerDato("tipoPregunta", "enunciado", "idTipoPregunta", resultado.getString("idTipoPregunta"))});
            }
        } catch (SQLException e) {
            System.out.println("Esto se tosto");
        }

        return model;
    }

    public boolean eliminarPregunta(int idPregunta) {
        return dao.eliminar("pregunta", "idPregunta", idPregunta + "");
    }

    public Pregunta traerPregunta(int id) throws NullPointerException {
        if (!dao.validarCampo(id + "", "idPregunta", "pregunta")) {
            return null;
        }
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

    public int[] traerOpciones(int id) {
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

    public int[] calificar(ArrayList<int[]> selecciones, ArrayList<ArrayList<Opcion>> opciones) {
//        for (int i = 0; i < selecciones.size(); i++) {
//            for (int j = 0; j < selecciones.get(i).length; j++) {
//                System.out.println(selecciones.get(i)[j]);
//            }
//        }
        ArrayList<Boolean> corr = new ArrayList<>();
        int[] arreglo = new int[10];
        int correctas;
        for (int i = 0; i < selecciones.size(); i++) {
            correctas = 0;
            for (int j = 0; j < selecciones.get(i).length; j++) {
                if (selecciones.get(i)[j] == opciones.get(i).get(j).getCorrecta()) {
                    correctas++;
                }
            }
            if (correctas == 4) {
                corr.add(true);
            } else {
                corr.add(false);
            }
        }
        for (int i = 0; i < corr.size(); i++) {
            if (corr.get(i)) {
                arreglo[i] = 1;
            } else {
                arreglo[i] = 0;
            }
        }
        return arreglo;
    }

    public boolean validarPreguntar(String id) {
        return dao.validarCampo(id, "idPregunta", "pregunta");
    }

    public String Acierto(String IdPregunta) {
        String consultaString = "SELECT idPregunta, puntaje FROM resultado WHERE idPregunta='" + IdPregunta + "';";
        ResultSet resultado = dao.traerResultado(consultaString);
        double numero = 0;
        double aciertos = 0;
        try{
        while (resultado.next()) {
            if (resultado.getString("puntaje").equalsIgnoreCase("1")) {
                aciertos++;
            }
            numero++;
        }
        }catch(SQLException e){
            
        }
        double porcentage = (aciertos / numero) * 100;
        String x = String.format("%,2f", porcentage);
        
        return x+"%";
    }
}
