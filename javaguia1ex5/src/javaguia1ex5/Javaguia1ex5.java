/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex5;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex5 {

    public static String claveSocio(){
       Scanner read = new Scanner(System.in);
        String socio;
        do {
        System.out.println("Ingrese su clave de socio");
        socio = read.nextLine().toUpperCase();
        } while (!socio.equals("A") && !socio.equals("B") && !socio.equals("C")); 
        return socio;
    }
    
    public static void importeTratamiento(String socio, double valorTrat){
        double total;
        switch(socio){
            case "A":
                total = valorTrat - valorTrat * .5;
                System.out.println("Para el tratamiento solicitado deberá pagar $" + total);
                break;
            case "B":
                total = valorTrat - valorTrat * .35;
                System.out.println("Para el tratamiento solicitado deberá pagar $" + total);
                break;
            case "C":
                total = valorTrat;
                System.out.println("Para el tratamiento solicitado deberá pagar $" + total);
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String socio = claveSocio();
        System.out.println("Ingrese el valor del tratamiento:");
        double valorTrat = read.nextDouble();
        importeTratamiento(socio, valorTrat);
        
    }
    
}
