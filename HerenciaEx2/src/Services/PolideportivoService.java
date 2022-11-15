package Services;

import Entities.Polideportivo;

import java.util.Scanner;

public class PolideportivoService {


    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo CrearPolideportivo() {
        System.out.println("Ingrese el largo del edificio:");
        double largo = scanner.nextDouble();
        System.out.println("Ingrese el ancho del edificio:");
        double ancho = scanner.nextDouble();
        System.out.println("Ingrese el alto del edificio:");
        double alto = scanner.nextDouble();
        System.out.println("Ingrese el nombre del edificio:");
        String nombre = scanner.next();
        String techo;
        do {
            System.out.println("Es techado? (S/N)");
            techo = scanner.next().toUpperCase();
        } while (!techo.equals("S") && !techo.equals("N"));
        if (techo.equals("S")) {
            techo = "Techado";
        } else {
            techo = "Abierto";
        }

        return new Polideportivo(largo, ancho, alto, nombre, techo);
    }
}
