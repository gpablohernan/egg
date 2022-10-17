/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex1;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex1 {

    public static void calculaDiasHoras(int minutos){
        int dias = minutos / (60*24);
        int horas = (minutos - ((60*24)*dias))/60;
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos:");
        int minutos = read.nextInt();
        calculaDiasHoras(minutos);
    }
    
}
