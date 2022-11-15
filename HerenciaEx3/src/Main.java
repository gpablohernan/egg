import Entities.*;
import Utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menuPrincipal();


    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        int opcion;
        do {
            System.out.println("----------------- MENÚ PRINCIPAL -----------------");
            System.out.println("Ingrese el tipo de alojamiento que desea cargar:");
            System.out.println("1 ----- Hotel de cuatro estrellas");
            System.out.println("2 ----- Hotel de cinco estrellas");
            System.out.println("3 ----- Camping");
            System.out.println("4 ----- Residencia");
            System.out.println("5 ----- No cargar más");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    CuatroEstrellas cuatroEstrellas = new CuatroEstrellas();
                    cuatroEstrellas.crearCuatroEstrellas();
                    alojamientos.add(cuatroEstrellas);
                    System.out.println("Hotel de cuatro estrellas creado");
                    break;
                case 2:
                    CincoEstrellas cincoEstrellas = new CincoEstrellas();
                    cincoEstrellas.crearCincoEstrellas();
                    alojamientos.add(cincoEstrellas);
                    System.out.println("Hotel de cinco estrellas creado");
                    break;
                case 3:
                    Camping camping = new Camping();
                    camping.crearCamping();
                    alojamientos.add(camping);
                    System.out.println("Camping creado");
                    break;
                case 4:
                    Residencia residencia = new Residencia();
                    residencia.crearResidencia();
                    alojamientos.add(residencia);
                    System.out.println("Residencia creada");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");

            }
        } while (opcion != 5);
        menuSecundario(alojamientos);
    }

    public static void menuSecundario(ArrayList<Alojamiento> alojamientos) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Hotel> hoteles = new ArrayList<>();
        int opcion;
        do {
            System.out.println("---------------------- MENÚ SECUNDARIO ----------------------");
            System.out.println("Ingrese la opción que desea visualizar:");
            System.out.println("1 ----- Mostrar todos los alojamientos");
            System.out.println("2 ----- Mostrar todos los hoteles del más caro al más barato");
            System.out.println("3 ----- Mostrar todos los campings con restaurante");
            System.out.println("4 ----- Mostrar todas las residencias con descuento al gremio");
            System.out.println("5 ----- Salir");
            opcion = scanner.nextInt();
            boolean flag = false;
             for (Alojamiento aloj : alojamientos) {
                switch (opcion) {
                    case 1:
                        System.out.println(aloj);
                        break;
                    case 2:
                        if (aloj.getClass().getName().equalsIgnoreCase("Entities.CuatroEstrellas") || aloj.getClass().getName().equalsIgnoreCase("Entities.CincoEstrellas")) {
                            hoteles.add((Hotel) aloj);
                            flag = true;
                        }
                        break;
                    case 3:
                        if (aloj.getClass().getName().equalsIgnoreCase("Entities.Camping") && ((Camping) aloj).getPoseeRestaurante().equalsIgnoreCase("sí")) {
                            System.out.println(aloj);
                        }
                        break;
                    case 4:
                        if (aloj.getClass().getName().equalsIgnoreCase("Entities.Residencia") && (((Residencia) aloj).getDescuentoAGremio().equalsIgnoreCase("sí"))) {
                            System.out.println(aloj);
                        }
                        break;
                    case 5:
                        return;

                }

            }
            if (flag) {
                Collections.sort(hoteles, Comparadores.ordenarPrecioDesc);
                for (Hotel hotel : hoteles) {
                    System.out.println(hotel);
                }
            }

        } while (opcion != 5) ;
    }
}
