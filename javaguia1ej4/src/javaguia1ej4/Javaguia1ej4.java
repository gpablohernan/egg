/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej4;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */

public class Javaguia1ej4 {

        public static float temp(float num){
        float res = 32 + (9 * num / 5);
        return res;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celcius: ");
        float num = read.nextFloat();
        float result = temp(num);
        System.out.println("La temperatura en grados Fahrenheit es: " + result + "ºF");
    }
    
}
