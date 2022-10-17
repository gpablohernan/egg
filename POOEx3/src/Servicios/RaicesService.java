/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Raices;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class RaicesService {
        Scanner read = new Scanner(System.in);

    public void ingresarValores(Raices raices) {
        System.out.print("Ingrese el valor para el indice a: ");
        raices.setA(read.nextInt());
        System.out.print("Ingrese el valor para el indice b: ");
        raices.setB(read.nextInt());
        System.out.print("Ingrese el valor para el indice c: ");
        raices.setC(read.nextInt());
    }
//    Método getDiscriminante(): devuelve el valor del discriminante (double). El
//      discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante (Raices raices){
        return ((Math.pow(raices.getB(), 2))-(4*raices.getA()*raices.getC()));
    }

    public boolean tieneRaices (Raices raices){ 
        return (getDiscriminante(raices)>=0);
    }
    
    public boolean tieneRaiz (Raices raices){
        return (getDiscriminante(raices)==0);
    }
    
    public void calcular(Raices raices ){
        double raiz1 = 0,raiz2 = 0;
        
        if(tieneRaices(raices)){
            raiz1=  (-raices.getB() + Math.sqrt((raices.getB()*raices.getB()) - (4 * raices.getA()*raices.getC())))/(2*raices.getA()); 
            raiz2=  (-raices.getB() - (Math.sqrt((raices.getB()*raices.getB()) - (4 * raices.getA()*raices.getC()))))/(2*raices.getA()); 
            obtenerRaices(raices,raiz1,raiz2);
        }else if(tieneRaiz(raices)){
            raiz1=  (-raices.getB() + Math.sqrt((raices.getB()*raices.getB()) - (4 * raices.getA()*raices.getC())))/(2*raices.getA()); 
            obtenerRaiz(raices,raiz1);
        }
        else{
            System.out.println("No existe resultado.");
        }
        
    }
    
    public void obtenerRaices(Raices raices, double raiz, double raiz2){
        System.out.println("La raiz uno es: " + raiz +"\nLa raiz dos: " + raiz2);
    }
   
     public void obtenerRaiz(Raices raices, double raiz){
         System.out.println("La raiz es: " + raiz);
    }
    
}
