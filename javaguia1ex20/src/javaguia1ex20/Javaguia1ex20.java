/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex20;

import java.util.Scanner;

/**
 *
 * @author hagsar
 */
public class Javaguia1ex20 {

    
      public static void llenarVector(int[] vector, int tam){
        for (int i=0; i<tam; i++){
        vector[i] = (int) (Math.random() * 10);
        
        }
        
    }
    
      public static void imprimeVector(int[] vector, int tam){
            for (int i=0; i<tam; i++){
                System.out.print(vector[i] + " ");
          }
          
      }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar en el vector:");
        int tam = read.nextInt();
        int[] vector = new int[tam];
        llenarVector(vector,tam);
        imprimeVector(vector,tam);
        
    }
    
}