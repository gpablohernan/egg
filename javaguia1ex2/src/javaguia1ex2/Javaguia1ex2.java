/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex2;

/**
 *
 * @author hagsar
 */
public class Javaguia1ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4, aux;
        // B C B=3  A=4
        // C A C=1  B=3      
        // A D A=4  C=1
        // D B D=2  D=2
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        
      
        
        
        
        
        
        
        System.out.println("Valores finales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
    
}
