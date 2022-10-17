/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex8;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex8 {
    
    public static void cargaDatos(){
        Scanner read = new Scanner(System.in);
        int num, cantNum = 0, par = 0, impar = 0;
        do {
        System.out.println("Ingrese un número");
        num = read.nextInt();
        if (num >= 0){
        cantNum++;
            if (num % 2 == 0){
            par++;
            } else {
            impar++;
            }
        }
        } while (num % 5 !=0);
        System.out.println("Cantidad de números ingresados: " + cantNum);
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de números impares: " + impar);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cargaDatos();
    }
    
}
