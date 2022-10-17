/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex11;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = read.nextInt();
        int digitos = 0;
        while (num != 0){
            num /= 10;
            digitos++;
        }
        System.out.println("El número ingresado tiene : " + digitos + " digitos");
    }
    
}
