/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Juego;

/**
 *
 * @author PCSHOP
 */
public class CtlJuego {

    private final DAO dao;
    private final CtlDAO controladorDAO;

    public CtlJuego() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }

    public boolean solicitudRegistro(int numeroJugadores, String nombreJuego, String fecha) {

        if (dao.validarCampo(nombreJuego, "nombreJuego", "juego")) {
            return false;
        }

        Juego juego = new Juego(numeroJugadores, nombreJuego, fecha);

        return controladorDAO.solicitudRegistro(juego, "juego");
    }

}
