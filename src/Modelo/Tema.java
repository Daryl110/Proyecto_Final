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
public class Tema {
    
    private String nombre;

    public Tema(String nombre) {
        this.nombre = nombre;
    }

    public Tema() {
    }

    public String getNombreTema() {
        return nombre;
    }

    public void setNombreTema(String nombre) {
        this.nombre = nombre;
    }
}
