/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej5;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej5 {
    
 public static int doble(int num1){
        int resultado = num1 *2;
        return resultado;
    }
 
 public static int triple(int num1){
        int resultado = num1 *3;
        return resultado;
    }
 
 public static double raiz(int num1){
        double resultado = Math.sqrt(num1);
        return resultado;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = read.nextInt();
        int doble = doble(num1);
        int triple = triple(num1);
        double raiz = raiz(num1);
        System.out.println("El doble del número ingresado es: " + doble);
        System.out.println("El triple del número ingresado es: " + triple);
        System.out.println("La raíz cuadrada del número ingresado es: " + raiz);
    }
    
}
