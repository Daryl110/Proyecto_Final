/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Tema;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daryl Ospina
 */
public class CtlTema {
    
    private final DAO dao;
    private final CtlDAO controladorDAO;

    public CtlTema() {
        this.dao = new DAO();
        this.controladorDAO = new CtlDAO();
    }
    
    public Tema traerTema(String idTema){
        return (Tema) controladorDAO.sqlToObject("tema", "idTema", idTema, new Tema(""));
    }

    public DefaultComboBoxModel listarCB() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione un Tema");
        return dao.cargarInformacionCB("tema", "nombre", modelo);
    }
    
    public DefaultTableModel listar(){
        return listarRegistro(dao.traerListar("tema"));
    }
    
    public boolean registrar(String nombreTema){
        Tema tema = new Tema(nombreTema);
        return controladorDAO.solicitudRegistro(tema, "tema");
    }
    
    public boolean modificar(String nombreTema,String idTema){
        Tema tema = new Tema(nombreTema);
        return controladorDAO.solicitarModificar(tema, "tema", "idTema",idTema);
    }
    
    public boolean eliminar(String idTema){
        return dao.eliminar("tema", "idTema", idTema);
    }
    
    private DefaultTableModel listarRegistro(ResultSet resultado) {

        String[] nombreColumnas = {"Numero del tema","Nombre de tema"};

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        try {
            while (resultado.next()) {
                model.addRow(new Object[]{resultado.getString("idTema"),resultado.getString("nombre")});
            }
        } catch (SQLException e) {
            System.out.println("Esto se tosto");
        }

        return model;
    }
}
