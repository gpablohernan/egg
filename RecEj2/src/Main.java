import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import Servicios.JuegoService;
import Servicios.JugadorService;
import Servicios.RevolverService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        JugadorService jugador = new JugadorService();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        RevolverService revolverServ = new RevolverService();
        Revolver revolver = new Revolver();
        JuegoService JuegoServ = new JuegoService();
        Juego juego = new Juego();

        System.out.println("Bienvenidos al juego! Ingrese la cantidad de jugadores: (1 a 6)");
        int numJugadores = read.nextInt();
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }
        jugadores = jugador.crearJugador(numJugadores);
        revolverServ.llenarRevolver(revolver);
        System.out.println(revolver);
        System.out.println(jugadores);
        JuegoServ.llenarJuego(jugadores, revolver, juego);
        JuegoServ.ronda(revolverServ, revolver, jugadores, jugador);
    }
}

/*
Lógica:

Crear jugador
Llenar revolver

llenar juego

ronda(
disparo

)

 */