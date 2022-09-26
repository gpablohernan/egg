/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex18;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex18 {

    public static int ingresoDatosSuma(int[] vector, int tam){
        Scanner read = new Scanner(System.in);
        int suma = 0;
        for (int i=0; i<tam; i++){
        System.out.println("Ingrese un número:");
        vector[i] = read.nextInt();
        suma += vector[i];
        }
        return suma;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar:");
        int tam = read.nextInt();
        int[] vector = new int[tam];
        System.out.println("La suma de todos los números ingresados es: " + ingresoDatosSuma(vector,tam));
        
    }
    
}
