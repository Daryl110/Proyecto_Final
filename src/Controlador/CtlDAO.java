/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Daryl Ospina
 */
public class CtlDAO {

    private final JsonParser parser;
    private JsonObject jObject;
    private final Gson gson;
    private String sentenciaSQL;
    private ArrayList<String> campos, valores;
    private Iterator<String> camposI, valoresI;
    private Set<String> keys;
    private final DAO dao;

    public CtlDAO() {
        parser = new JsonParser();
        gson = new Gson();
        dao = new DAO();
    }
    
    public String getUltimoId(String tabla,String llavePrimaria){
        ResultSet result = dao.getUltimoId(tabla , llavePrimaria);
        try {
            if (result.next()) {
                String cantidaRegistros = result.getString("MAX("+llavePrimaria+")");
                return cantidaRegistros;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
    public int getNumeroRegistros(String tabla){
        ResultSet result = dao.getNumeroRegistros(tabla);
        try {
            if (result.next()) {
                int cantidaRegistros = result.getInt("COUNT(*)");
                return cantidaRegistros;
            }
        } catch (SQLException e) {
            return 0;
        }
        return 0;
    }

    public boolean solicitudRegistro(Object objeto, String tabla) {
        
        darValores(objeto);

        sentenciaSQL = "INSERT INTO " + tabla + "(";

        while (camposI.hasNext()) {
            sentenciaSQL += camposI.next();
            if (camposI.hasNext()) {
                sentenciaSQL += ",";
            } else {
                sentenciaSQL += ") VALUES(";
            }
        }

        while (valoresI.hasNext()) {
            sentenciaSQL += "'" + valoresI.next();
            if (valoresI.hasNext()) {
                sentenciaSQL += "',";
            } else {
                sentenciaSQL += "');";
            }
        }

        return dao.registrarYModificar(sentenciaSQL);
    }

    public boolean solicitarModificar(Object objeto, String tabla, String llavePrimaria) {

        darValores(objeto);
        
        sentenciaSQL = "UPDATE " + tabla + " SET ";

        while (camposI.hasNext()) {
            sentenciaSQL += camposI.next() + "='" + valoresI.next();
            if (camposI.hasNext()) {
                sentenciaSQL += "',";
            } else {
                sentenciaSQL += "' WHERE " + llavePrimaria + "='" + jObject.get(llavePrimaria).getAsString() + "'";
            }
        }

        return dao.registrarYModificar(sentenciaSQL);
    }
    public boolean solicitarModificar(Object objeto, String tabla, String llavePrimaria,String dato) {

        darValores(objeto);
        
        sentenciaSQL = "UPDATE " + tabla + " SET ";

        while (camposI.hasNext()) {
            sentenciaSQL += camposI.next() + "='" + valoresI.next();
            if (camposI.hasNext()) {
                sentenciaSQL += "',";
            } else {
                sentenciaSQL += "' WHERE " + llavePrimaria + "='" + dato + "'";
            }
        }

        return dao.registrarYModificar(sentenciaSQL);
    }

    public Object sqlToObject(String nombreTabla, String llavePrimaria, String dato, Object objeto) {

        ResultSet rb = dao.traerBuscar(nombreTabla, llavePrimaria, dato);
        
        darValores(objeto);

        String sentenciaJSON = "{ ";
        
        Object objet = null;

        try {
            rb.next();
            while (camposI.hasNext()) {
                String var = camposI.next();
                sentenciaJSON += "\"" + var + "\" : ";
                if (rb.getObject(var).getClass().getName().equalsIgnoreCase("java.lang.Integer")) {
                    sentenciaJSON += rb.getInt(var);
                    if (camposI.hasNext()) {
                        sentenciaJSON += ",";
                    } else {
                        sentenciaJSON += " }";
                    }
                } else {
                    sentenciaJSON += "\"" + rb.getString(var) + "\"";
                    if (camposI.hasNext()) {
                        sentenciaJSON += ",";
                    } else {
                        sentenciaJSON += " }";
                    }
                }
            }
            objet = gson.fromJson(sentenciaJSON, objeto.getClass());
        } catch (JsonSyntaxException | SQLException e) {
            
        }
        return objet;
    }
    
    private void darValores(Object objeto){
        
        jObject = parser.parse(gson.toJson(objeto)).getAsJsonObject();
        keys = jObject.keySet();

        campos = new ArrayList<>(keys);
        valores = new ArrayList<>();
        
        for (int i = 0; i < campos.size(); i++) {
            valores.add(jObject.get(campos.get(i)).getAsString());
        }
        
        camposI = campos.iterator();
        
        valoresI = valores.iterator();
    }

}
