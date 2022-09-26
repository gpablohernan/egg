/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex3;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex3 {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        String letra = read.next().toUpperCase();
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U") ){
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
    
}
