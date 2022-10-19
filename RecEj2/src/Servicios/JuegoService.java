package Servicios;
import Entidad.Jugador;
import Entidad.Juego;
import Entidad.Revolver;

import java.util.ArrayList;

public class JuegoService {




    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r, Juego juego){
        juego.setRevolver(r);
        juego.setJugadores(jugadores);
    }


    public void ronda(RevolverService r, Revolver revolver, ArrayList<Jugador> jugadores, JugadorService JugServ){
        boolean flag = false;
        while (flag == false){
            for (int i=0; i< jugadores.size(); i++) {
                JugServ.disparo(r, revolver, jugadores.get(i));
                if (jugadores.get(i).isMojado()){
                    System.out.println("El juego terminó. El perdedor es: " + jugadores.get(i).getNombre());
                    flag = true;
                    break;
                }
            }
        }


    }
}