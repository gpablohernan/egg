/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej3;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String name = read.nextLine();
        System.out.println("La frase ingresada en mayúsculas es: " + name.toUpperCase());
        System.out.println("La frase ingresada en minúsculas es: " + name.toLowerCase());
    }
    
}
