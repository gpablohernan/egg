package Servicios;
import Entidad.Revolver;
import Entidad.Jugador;


import java.util.ArrayList;

public class JugadorService {

    public ArrayList<Jugador> crearJugador(int numJugadores){
        ArrayList <Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i<=numJugadores; i++){
            Jugador jugador = new Jugador();
            jugador.setId(i);
            jugador.setNombre("Jugador " + i);
            jugador.setMojado(false);
            jugadores.add(jugador);
        }
        return jugadores;
    }

    public void disparo(RevolverService r, Revolver revolver, Jugador jugador){
       if (r.mojar(revolver)){
           jugador.setMojado(true);
       } else r.siguienteChorro(revolver);

    }
}