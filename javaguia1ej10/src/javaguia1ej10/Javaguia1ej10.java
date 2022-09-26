/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej10;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej10 {
    
    public static void introdNumeros(int num){
        Scanner read = new Scanner(System.in);
        int suma = 0;
        int aux;
        while (suma <= num){
            System.out.println("Ingrese un número:");
            aux = read.nextInt();
            suma += aux;
        
        }             
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo:");
        int num = read.nextInt();
        introdNumeros(num);
    }
    
}
