/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex7b;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex7b {

    public static void ingresoDatos(int[] num, int tam){
        Scanner read = new Scanner(System.in);
        int i = 0;
        do { 
            System.out.println("Ingrese un número mayor a 0");
              num[i]= read.nextInt();
              i++;
        } while (i != tam && num[i] < 1);
              
        
    }
    
    public static void calculaDatos(int[] num, int tam){
        float prom = 0;
        int min = num[0], max = num[0]; 
        for (int i = 1; i<tam; i++){
            prom += num[i];
            min = Math.min(min, num[i]);
            max = Math.max(max, num[i]);
              }
           
        prom /= tam;
        
        System.out.println("El promedio de los núeros ingresados es: " + prom);
        System.out.println("El mínimo de los números ingresados es " + min);
        System.out.println("El máximo de los números ingresados es " + max);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        int[] num;
        System.out.println("Ingrese una cantidad de números: ");
        int tam = read.nextInt();
        num = new int[tam];
        ingresoDatos(num, tam);
        calculaDatos(num, tam);
    }
    
}
