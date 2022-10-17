/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej16;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej16 {

    public static void llenaVector(int[] vector, int tam){
        for (int i = 0; i<tam; i++){
          vector[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void buscaVector(int[] vector, int tam){
       Scanner read = new Scanner(System.in);
       boolean flag = false;
        System.out.println("Ingrese el número a buscar:");
        int busca = read.nextInt();
        for (int i = 0; i<tam; i++){
          if (vector[i] == busca){
              System.out.println("El número se encontró en el la posición " + i);
              flag = true;
          }
        }
        if (flag == false){
            System.out.println("El número buscado no se encontró");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector;// = new int[100];
        System.out.println("Ingrese el tamaño del vector:");
        int tam = read.nextInt();
        vector = new int[tam];
        llenaVector(vector, tam);
        buscaVector(vector, tam);
        
    }
    
}
