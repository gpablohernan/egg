/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex16;
import java.util.Scanner;

/**
 *
 * @author hagsar
 */
public class Javaguia1ex16 {
    
    public static void ingresoPersonas(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas a ingresar:"); 
        int cantPers = read.nextInt();
        String[] nombre = new String[cantPers];
        int[] edad = new int[cantPers];
        for (int i = 0; i<cantPers; i++){
            System.out.println("Ingrese el nombre de la persona:");
            nombre[i] = read.next();
            System.out.println("Ingrese la edad de la persona:");
            edad[i] = read.nextInt();
        }
        for (int j=0; j<cantPers; j++){
            System.out.println("La persona se llama " + nombre[j] + " y tiene " + edad[j] + " años.");
            if (edad[j]<18){
                System.out.println("Es menor de edad");
            } else {
                System.out.println("Es mayor de edad");
            }
            System.out.println("Desea seguir mostrando los datos? (Escriba No si no lo desea)");
            String choice = read.next();
            if ("No".equals(choice)){
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ingresoPersonas();
    }
    
}
