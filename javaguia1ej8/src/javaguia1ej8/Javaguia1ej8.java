/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej8;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej8 {
    
public static String largo(String frase){
        if (frase.length()== 8){
            return "CORRECTO";
        } else {
            return "INCORRECTO";
             }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 de largo:");
        String frase = read.nextLine();
        System.out.println(largo(frase));
    }
    
}
