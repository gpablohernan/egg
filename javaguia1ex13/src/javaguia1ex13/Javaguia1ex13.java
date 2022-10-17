/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex13;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = read.nextInt();
        String escalera = "";
        
        for (int i = 1; i<=num; i++){
            escalera += String.valueOf(i);
            System.out.println(escalera);
        }
        
    }
    
}
