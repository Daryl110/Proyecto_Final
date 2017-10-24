/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PCSHOP
 */
public final class Conexion {

    private String driver = ""; //nombre del driver
    private String connectString = "jdbc:"; //ubicacion de la base de datos, para postgres esta es por defecto
    private String nombreDriver = "";
    private String database = "";
    private final String user = "root"; //usuario de la base de datos
    private final String password = ""; //password de la base de datos
    private Connection conexionDB; // variable que permite la conexion
    private Statement sentenciaSQL; //permite la ejecucion de sentencias SQL

    /**
     * Permite la conexion de la base de datos
     *
     * @param database
     * @param driver
     * @param urlDB
     */
    public Conexion(String database,String driver,String urlDB) {
        nombreDriver = driver;
        connectString += nombreDriver+":"+urlDB;
        this.database = database;
        connectString += database;
        this.setDriver(driver);
    }
    
    public void conectar(){
        try {
            Class.forName(driver); //se carga el driver en memoria
            conexionDB = DriverManager.getConnection(connectString, user, password);//conexion a la base de datos
            sentenciaSQL = conexionDB.createStatement();//variable que permite ejecutar las sentencias SQL
//            JOptionPane.showMessageDialog(null, "Conexion exitosa con el driver "+nombreDriver+", para la base de datos "+database);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con "+database+", ya que hubo un error "+e);
        }
    }

    public boolean ejecutar(String sentencia) {
        try {
            conectar();
            sentenciaSQL.executeUpdate(sentencia);
            desconectar();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public ResultSet ejecutarRetorno(String sentencia) {
        try {
            conectar();
            return sentenciaSQL.executeQuery(sentencia);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error en la consulta");
            return null;
        }finally{
            desconectar();
        }
    }

    public void desconectar() {
        try {
            conexionDB.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error "+e+" al cerrar la base de datos "+database);
        }
    }
    
    public void setDriver(String driver){
        if (driver.equalsIgnoreCase("PostgreSQL")) {
            this.driver = "org.postgresql.Driver";
        }else if (driver.equalsIgnoreCase("Firebird SQL")) {
            this.driver = "org.firebirdsql.jdbc.FBDriver";
        }else if (driver.equalsIgnoreCase("H2 Database Engine")) {
            this.driver = "org.h2.Driver";
        }else if (driver.equalsIgnoreCase("HSQLDB")) {
            this.driver = "org.hsqldb.jdbcDriver";
        }else if (driver.equalsIgnoreCase("Apache Derby")) {
            this.driver = "org.apache.derby.jdbc.EmbeddedDriver";
        }else if (driver.equalsIgnoreCase("IBM DB2")) {
            this.driver = "com.ibm.db2.jcc.DB2Driver";
        }else if (driver.equalsIgnoreCase("IBM DB2 for iSeries")) {
            this.driver = "com.ibm.as400.access.AS400JDBCDriver";
        }else if (driver.equalsIgnoreCase("Teradata")) {
            this.driver = "com.teradata.jdbc.TeraDriver";
        }else if (driver.equalsIgnoreCase("Sybase SQL Anywhere")) {
            this.driver = "com.sybase.jdbc3.jdbc.SybDriver";
        }else if (driver.equalsIgnoreCase("Oracle")) {
            this.driver = "oracle.jdbc.OracleDriver";
        }else if (driver.equalsIgnoreCase("MariaDB")) {
            this.driver = "org.mariadb.jdbc.Driver";
        }else if (driver.equalsIgnoreCase("MySQL")) {
            this.driver = "com.mysql.jdbc.Driver";
        }
        conectar();
    }

}
