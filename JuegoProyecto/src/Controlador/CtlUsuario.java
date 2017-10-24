/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Usuario;
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

    public boolean solicitudRegistro(int cedula, int pregunta, int semestre, String nombre, String nombreUsu, String contrasena, String correo, String telefono, String respuesta) {
        Usuario usu = new Usuario(cedula, pregunta, semestre, nombre, nombreUsu, contrasena, correo, telefono, respuesta);

        return controladorDAO.solicitudRegistro(usu, "usuario");
    }

    public DefaultComboBoxModel solicitarListarEnCB(String tabla, String campo) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione una pregunta");
        return dao.cargarInformacionCB(tabla, campo, modelo);
    }

}
