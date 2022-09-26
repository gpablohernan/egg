/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej17;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej17 {
    
    public static void llenaVector(int[] vector, int tam){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i<tam; i++){
            System.out.println("Ingrese el número para el vector en la posición " + i);
            vector[i] = read.nextInt();
        }
    }
    
    public static void contarDigitosVector(int[] vector, int tam){
       Scanner read = new Scanner(System.in);
       boolean flag = false;
       String vectorCadena;
       int longCadena, unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0, masDigitos = 0;
      for (int i = 0; i<tam; i++){
            vectorCadena = String.valueOf(vector[i]);
            longCadena = vectorCadena.length();
            switch (longCadena){
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
                default:
                    masDigitos++;
                    break;
          }
        }
        System.out.println("Cantidad de números por dígitos en el vector:\n"
                + "Un dígito: " + unDigito + "\n"
                + "Dos dígitos: " + dosDigitos + "\n"
                + "Tres dígitos: " + tresDigitos + "\n"
                + "Cuatro dígitos: " + cuatroDigitos + "\n"
                + "Cinco dígitos: " + cincoDigitos + "\n"
                + "Más de 5 dígitos: " + masDigitos + "\n");
           
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector;
        System.out.println("Ingrese el tamaño del vector:");
        int tam = read.nextInt();
        vector = new int[tam];
        llenaVector(vector, tam);
        contarDigitosVector(vector, tam);
    }
    
}
