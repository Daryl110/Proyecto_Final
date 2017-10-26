/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Daryl Ospina
 */
public class Pregunta {
    
    private int idTema,idTipoPregunta;
    private String enunciado;

    public Pregunta(int idTema, String enunciado,int idTipoPregunta) {
        this.idTema = idTema;
        this.enunciado = enunciado;
        this.idTipoPregunta = idTipoPregunta;
    }

    public Pregunta() {
    }

    public int getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(int idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
}
