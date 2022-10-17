/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author hagsar
 */


public class CadenaService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("ingrese la palabra o frase para la cadena");
        return new Cadena(scanner.nextLine());
    }

    public void mostrarVocales(Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1).toUpperCase();
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    contador += 1;
                    break;
            }
        }
        System.out.println("La cadena tiene " + contador + " vocales");
    }

    public void invertirFrase(Cadena c) {
        String fraseInvertida = "";
        for (int i = c.getLongitud(); i > 0; i--) {
            fraseInvertida += c.getFrase().substring(i - 1, i);
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    private boolean buscarLetra(Cadena c, int i, String letra) {
        return c.getFrase().substring(i, i + 1).equalsIgnoreCase(letra);
    }

    public void vecesRepetido(Cadena c) {
        System.out.println("ingrese el caracter que desea buscar");
        String buscada = scanner.nextLine().substring(0, 1);
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (buscarLetra(c, i, buscada)) {
                contador += 1;
            }
        }
        System.out.println("hay " + contador + " coincidencias en la frase.");
    }

    public void compararLongitud(Cadena c) {
        System.out.println("ingrese la nueva frase a comparar");
        String nuevaFrase = scanner.nextLine();
        if (nuevaFrase.length() == c.getLongitud()) {
            System.out.println("las frases tienen la misma longitud");
        } else {
            System.out.println("las longitudes no coinciden");
        }
    }

    public void unirFrase(Cadena c) {
        System.out.println("ingrese una frase nueva que se unira con la original");
        String frase = scanner.nextLine();
        System.out.println(c.getFrase().concat(frase));
//        System.out.println(c.getFrase() + frase);
    }

    public void reemplazar(Cadena c) {
        System.out.println("ingrese una letra ");
        char letra = scanner.next().charAt(0);
        String fraseNueva = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                fraseNueva += letra;
            } else {
                fraseNueva += c.getFrase().substring(i, i + 1);
            }
        }
        System.out.println(fraseNueva);
    }

    public boolean contiene(Cadena c) {
        System.out.println("Ingrese una letra a buscar");
        String buscada = scanner.next().substring(0, 1);
        boolean encontrada = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (buscarLetra(c, i, buscada)) {
                encontrada = true;
            }
        }
        return encontrada;
    }

}
