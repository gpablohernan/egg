/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex21;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex21 {

    public static void cargaDatos(float[] alumnos){
        Scanner read = new Scanner(System.in);
        float notas = 0;
        int aprobado = 0, desaprobado =0;
        for (int i = 0; i<=9; i++){  
        System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo del alumno " + (i+1) + ":");
        notas+= read.nextFloat() * .1;
        System.out.println("Ingrese la nota del Segundo trabajo práctico evaluativo del alumno " + (i+1) + ":");
        notas+= read.nextFloat() * .15;
        System.out.println("Ingrese la nota del Primer Integrador del alumno " + (i+1) + ":");
        notas+= read.nextFloat() * .25;
        System.out.println("Ingrese la nota del Segundo integrador del alumno " + (i+1) + ":");
        notas+= read.nextFloat() * .5;
      
        alumnos[i] = notas;
            if (alumnos[i] >= 7){
                aprobado++;
            } else {
                desaprobado++;
            }
        
        }
        System.out.println("Cantidad de alumnos aprobados: " + aprobado);
        System.out.println("Cantidad de alumnos desaprobados: " + desaprobado);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float[] alumnos = new float[10];
        cargaDatos(alumnos);
       
    }
    
}
