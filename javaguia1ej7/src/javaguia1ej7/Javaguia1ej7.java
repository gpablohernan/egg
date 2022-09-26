/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej7;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej7 {

      public static String eureka(String frase){
        String palabra = "eureka";
          if (frase.equals(palabra)){
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
        System.out.println("Ingrese una frase:");
        String frase = read.nextLine().toLowerCase();
        System.out.println(eureka(frase));
    }
    
}
