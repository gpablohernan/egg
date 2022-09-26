/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex22;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex22 {

    public static void cargaDatos(int n, int m){
        int[][] matriz = new int[n][m];
        int suma = 0;
        
        for (int i = 0; i<n-1; i++){
            for (int j=0; j<m-1; j++){
                
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
                       
           } 
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el Valor n de la matriz[n][m]:");
        int n = read.nextInt();
        System.out.println("Ingrese el Valor n de la matriz[n][m]:");
        int m = read.nextInt();
        cargaDatos(n, m);
       
        
    }    
    
}
