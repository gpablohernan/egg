/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej14;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej14 {

    public static void convertir(double cantEuros, int moneda){
        double resultado;
        switch(moneda){
            case 1:
                resultado = moneda * 0.86;
                System.out.println("El resultado es: " + resultado + " libras");
                break;
            case 2:
                resultado = moneda * 1.28611;
                System.out.println("El resultado es: " + resultado + " dólares");
                break;
            case 3:
                resultado = moneda * 129.852;
                System.out.println("El resultado es: " + resultado + " yenes");
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros a convertir:");
        double cantEuros = read.nextDouble();
        int moneda;
        do {
            System.out.println("Ingrese una opción:\n" + "1- A libras\n" + "2- A dólares\n" + "3- A yenes");
            moneda = read.nextInt();
            } while ((moneda !=1) && (moneda !=2) && (moneda !=3));
        convertir(cantEuros, moneda);
        
        
    }
    
}
