/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controlador.Main;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author PCSHOP
 */
public class DAO {
        private ResultSet resultadoDB;

    public DefaultComboBoxModel cargarInformacionCB(String tabla, String campo, DefaultComboBoxModel modelo) {

        String consulta = "SELECT " + campo + " FROM " + tabla;

        resultadoDB = Main.conec.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelo.addElement(resultadoDB.getString(campo));
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
        }

        return modelo;
    }

    public boolean registrarYModificar(String sentenciaSQL) {
        return Main.conec.ejecutar(sentenciaSQL);
    }

    public ResultSet traerListar(String nombreTabla) {
        String consulta = "select * from " + nombreTabla;
        return Main.conec.ejecutarRetorno(consulta);
    }

    public String traerDato(String nombreTabla, String atributoSolicitado, String valorIgualar, String valor) {
        String dato = "";
        String sentencia = "SELECT " + atributoSolicitado + " FROM " + nombreTabla + " WHERE " + valorIgualar + "= '" + valor + "'";
        resultadoDB = Main.conec.ejecutarRetorno(sentencia);
        try {
            if (resultadoDB.next()) {
                dato = resultadoDB.getString(atributoSolicitado);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return dato;
    }
    
    public ResultSet traerBuscar(String nombreTabla,String llavePrimaria,String dato){
        String senteciaSQL = "SELECT * FROM "+nombreTabla+" WHERE "+llavePrimaria+"='"+dato+"'";
        return Main.conec.ejecutarRetorno(senteciaSQL);
    }

    public boolean eliminar(String nombreTabla, String llavePrimaria, String dato) {
        String senteciaSQL = "DELETE FROM "+nombreTabla+" WHERE "+llavePrimaria+"='"+dato+"'";
        return Main.conec.ejecutar(senteciaSQL);
    }
    
}
