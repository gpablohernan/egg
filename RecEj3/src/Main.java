import Entidad.Carta;
import Servicios.CartaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CartaService cartas = new CartaService();

        ArrayList<Carta> mazo = cartas.crearMazo();
        ArrayList<Carta> descartadas = new ArrayList<>();

        menu(mazo, descartadas, cartas);

    }

    public static void menu(ArrayList<Carta> mazo, ArrayList<Carta> descartadas, CartaService cartas) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int opcion, cant;
        System.out.println("MENÚ");
        System.out.println(
         "1 -- Barajar \n"+
         "2 -- Tomar una carta del mazo \n" +
         "3 -- Mostrar la cantidad de cartas en el mazo \n" +
         "4 -- Pedir cartas del mazo \n" +
         "5 -- Mostrar las cartas que ya han salido \n" +
         "6 -- Mostrar las cartas que quedan en el mazo \n" +
         "7 -- Salir \n"
        );
        System.out.println("Ingrese una opción:");
        opcion = read.nextInt();
        switch (opcion){
            case 1:
                cartas.barajar(mazo);
                menu(mazo, descartadas, cartas);
                break;
            case 2:
                cartas.siguienteCarta(mazo, descartadas);
                menu(mazo, descartadas, cartas);
                break;
            case 3:
                cartas.cartasDisponibles(mazo);
                menu(mazo, descartadas, cartas);
                break;
            case 4:
                System.out.println("Ingrese la cantidad de cartas a sacar del mazo");
                cant = read.nextInt();
                cartas.darCartas(cant, mazo, descartadas);
                menu(mazo, descartadas, cartas);
                break;
            case 5:
                cartas.mostrarBaraja(mazo);
                menu(mazo, descartadas, cartas);
                break;
            case 6:
                cartas.cartasMonton(descartadas);
                menu(mazo, descartadas, cartas);
                break;
            case 7:
                   break;
            default:
                System.out.println("Ingrese una opción válida");
                menu(mazo, descartadas, cartas);
                break;


        }

    }
}