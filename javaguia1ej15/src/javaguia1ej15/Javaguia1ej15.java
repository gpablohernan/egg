/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej15;

/**
 *
 * @author hagsar
 */
public class Javaguia1ej15 {

    public static void llenaVector(int[] vector){
        for (int i = 1; i<=100; i++){
          vector[i-1] = i;  
        }
    }
    
    public static void muestraVector(int[] vector){
        for (int i = 100; i>0; i--){
            System.out.println(vector[i-1]);
              
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        llenaVector(vector);
        muestraVector(vector);
    }
    
}
