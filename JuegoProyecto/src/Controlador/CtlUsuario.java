/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author PCSHOP
 */
public class CtlUsuario {

    private final DAO dao;
    private final CtlDAO controladorDAO;

    public CtlUsuario() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }

    public String traerDato(String cedula,String columna) {
        return dao.traerDato("usuario", columna, "cedula", cedula);
    }

    public boolean solicitudRegistro(int cedula, int pregunta, int semestre, String nombre, String nombreUsu, String contrasena, String correo, String telefono, String respuesta) {

        if (dao.validarCampo(nombreUsu, "nombreUsu", "usuario")) {
            return false;
        }

        Usuario usu = new Usuario(cedula, pregunta, semestre, nombre, nombreUsu, contrasena, correo, telefono, respuesta);

        return controladorDAO.solicitudRegistro(usu, "usuario");
    }

    public DefaultComboBoxModel solicitarListarEnCB(String tabla, String campo) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione una pregunta");
        return dao.cargarInformacionCB(tabla, campo, modelo);
    }

    //Metodos para recordar
    public boolean validarCampoUsuario(String igualdad, String columna, String tabla) {
        return dao.validarCampo(igualdad, columna, tabla);
    }

    public void registroRecordar(String nombreUsu, String contrasena) {
        boolean recordar = dao.recordar(dao.traerDato("usuario", "cedula", "nombreUsu", nombreUsu), nombreUsu, contrasena);
    }

    public void eliminarRegistro() {
        dao.eliminarTodo("historial");
    }

    public ArrayList<String> mostrarRecordar() {
        ArrayList<String> lista = new ArrayList<>();
        ResultSet resultado = dao.traerColumna("historial", "nombreUsu");
        ResultSet resultado1 = dao.traerColumna("historial", "contrasena");

        try {
            while (resultado.next() && resultado1.next()) {
                lista.add(resultado.getString("nombreUsu"));
                lista.add(resultado1.getString("contrasena"));
            }
        } catch (Exception e) {
        }
        return lista;

    }

    //Metodos para olvidar contraseña
    public boolean validarOlvidoContrasena(String cedula, int pregunta, String respuesta) {
        ResultSet resultado = dao.traerListar("usuario");
        try {
            while (resultado.next()) {
                if (resultado.getString("cedula").equalsIgnoreCase(cedula)
                        && resultado.getInt("pregunta") == pregunta
                        && resultado.getString("respuesta").equalsIgnoreCase(respuesta)) {
                    return true;
                }
            }
        } catch (SQLException e) {

        }
        return false;
    }

    public boolean cambiarContrasena(String contrasena, String cedula) {
        String consulta = "update usuario set contrasena='" + contrasena + "' where cedula='" + cedula + "'";
        return dao.registrarYModificar(consulta);
    }
}
