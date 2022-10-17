/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej6;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej6 {
    
    public static String parImpar(int num){
        if (num % 2 == 0){
            return "es par";
        } else {
            return "es impar";
             }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = read.nextInt();
        System.out.println("El número ingresado " + parImpar(num));
        
    }
    
}
