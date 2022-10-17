/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex6;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex6 {

    public static void ingresoAlturas(float[] pers, int tam){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i<tam; i++){
            System.out.println("Ingrese una altura");
              pers[i]= read.nextFloat();
              
        }
    }
    
    public static void calculaAlturas(float[] pers, int tam){
        float menor160 = 0, total = 0;
        int aux = 0; 
        for (int i = 0; i<tam; i++){
            if (pers[i] < 1.6){
                  menor160 += pers[i];
                  aux++;
              }
            total += pers[i];
        }
        total /= tam;
        menor160 /= aux;
        System.out.println("La altura promedio de todas las personas es: " + total);
        System.out.println("La altura promedio de las personas menores a 1.60 es " + menor160);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[] pers;
        System.out.println("Ingrese una cantidad de personas: ");
        int tam = read.nextInt();
        pers = new float[tam];
        ingresoAlturas(pers, tam);
        calculaAlturas(pers, tam);
        
    }
    
}
