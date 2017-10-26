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
public class Juego {

    int numeroJugadores;
    String fechaJuego, nombreJuego;

    public Juego(int numeroJugadores, String nombreJuego, String fechaJuego) {
        this.numeroJugadores = numeroJugadores;
        this.nombreJuego = nombreJuego;
        this.fechaJuego = fechaJuego;
    }

    public Juego() {
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getFechaJuego() {
        return fechaJuego;
    }

    public void setFechaJuego(String fechaJuego) {
        this.fechaJuego = fechaJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

}
