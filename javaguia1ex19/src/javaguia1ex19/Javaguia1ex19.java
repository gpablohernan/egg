/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex19;

import java.util.Scanner;

/**
 *
 * @author hagsar
 */
public class Javaguia1ex19 {

      public static void llenarVector(int[] vector, int tam){
        for (int i=0; i<tam; i++){
        vector[i] = (int) (Math.random() * 10);
        
        }
        
    }
    
      public static boolean comparaVectores(int[] vector1, int[] vector2, int tam){
          boolean iguales = true;
          for (int i=0; i<tam; i++){
              if (vector1[i] == vector2[i]){
                  iguales= true;
              } else {
                  iguales= false;
                  return iguales;
              }
          }
          return iguales;
      }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar en los vectores:");
        int tam = read.nextInt();
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];
        llenarVector(vector1,tam);
        llenarVector(vector2,tam);
        boolean iguales = comparaVectores(vector1,vector2,tam);
        if (iguales){
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
    
}
