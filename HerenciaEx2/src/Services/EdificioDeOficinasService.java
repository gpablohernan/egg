package Services;

import Entities.EdificioDeOficinas;

import java.util.Scanner;

public class EdificioDeOficinasService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas crearEdificioDeOficinas(){
        System.out.println("Ingrese el largo del edificio:");
        double largo = scanner.nextDouble();
        System.out.println("Ingrese el ancho del edificio:");
        double ancho = scanner.nextDouble();
        System.out.println("Ingrese el alto del edificio:");
        double alto = scanner.nextDouble();
        System.out.println("Ingrese el número de oficinas:");
        int nroOficinas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina:");
        int cantPersonasPorOficina = scanner.nextInt();
        System.out.println("Ingrese el número de pisos:");
        int nroPisos = scanner.nextInt();


        return new EdificioDeOficinas(largo, ancho, alto, nroOficinas, cantPersonasPorOficina, nroPisos);
    }


}
