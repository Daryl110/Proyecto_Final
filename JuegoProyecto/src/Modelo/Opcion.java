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
public class Opcion {

    private int idPregunta, correcta;
    private String enunciado;

    public Opcion(int idPregunta, int correcta, String enunciado) {
        this.idPregunta = idPregunta;
        this.correcta = correcta;
        this.enunciado = enunciado;
    }

    public Opcion() {
        this.idPregunta = 0;
        this.correcta = 0;
        this.enunciado = null;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
}
