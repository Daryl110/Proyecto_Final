/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PCSHOP
 */
public class Puntuacion {

    int puntuacion;
    String nombreUsuario, cedula;

    public Puntuacion(String cedula, int puntuacion, String nombreUsuario) {
        this.cedula = cedula;
        this.puntuacion = puntuacion;
        this.nombreUsuario = nombreUsuario;
    }

    public Puntuacion() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

}
