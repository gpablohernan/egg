/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej9;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej9 {
    
    public static String letraA(String primeraLetra){
        String letra = "A"; 
        if (primeraLetra.equals(letra)){
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
        String frase = read.nextLine();
        String primeraLetra = frase.substring(0, 1).toUpperCase();
        System.out.println(letraA(primeraLetra));
    }
    
}
