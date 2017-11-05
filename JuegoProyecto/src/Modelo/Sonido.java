/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.applet.AudioClip;

/**
 *
 * @author Nicolas Davila
 */
public class Sonido extends Thread {

    AudioClip sonido;
    String ubicacion;

    public Sonido(AudioClip sonido, String ubicacion) {
        this.sonido = sonido;
        this.ubicacion = ubicacion;
    }

    @Override
    public void run() {
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(ubicacion));
        sonido.play();
    }
}
