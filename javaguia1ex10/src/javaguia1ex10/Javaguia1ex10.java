/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex10;
import java.util.Scanner;

/**
 *
 * @author hagsar
 */
public class Javaguia1ex10 {
    
    public static int generaNumero(){
        int numero = (int) (Math.random() * 10);
        numero *= (int) (Math.random() * 10); 
        return numero;
    }

    public static void adivinaNumero(int num){
        Scanner read = new Scanner(System.in);
        int numUser;
        String choice;
        System.out.println(num);
        do {
            System.out.println("Ingrese un número:");
            numUser = read.nextInt();
            if (numUser == num){
                System.out.println("Adivinó el número");
                break;
            } else {
                System.out.println("No adivinó el número. Desea intentarlo nuevamente? (S/N)");
                 choice = read.next().toUpperCase();
                 
            }
            
        } while (!"N".equals(choice));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = generaNumero();
        adivinaNumero(num);
        
    }
    
}
