/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Matematica;

/**
 *
 * @author hagsar
 */
public class MatematicaService {
    
    public Matematica crearMatematica(){
        
        double num1 = (Math.random()*100+1);
        double num2 = (Math.random()*100+1);
        
        return new Matematica(num1, num2);
    }
    
    public void devolverMayor(Matematica mate){
        double mayor = Math.max(mate.getNum1(), mate.getNum2());
        System.out.println("El número de mayor valor es: " + mayor);
    }
    
    public void calcularPotencia(Matematica mate){
        double potencia;
        Math.round(mate.getNum1());
        Math.round(mate.getNum2());
        if (mate.getNum1()>mate.getNum2()){
            potencia = Math.pow(mate.getNum1(), mate.getNum2());
        } else {
            potencia = Math.pow(mate.getNum1(), mate.getNum2());
        }
        System.out.println("El resultado de la potencia es: " + potencia);
    }
    
    public void calculaRaiz(Matematica mate){
        double raiz;
        Math.round(mate.getNum1());
        Math.round(mate.getNum2());
        if (mate.getNum1()<mate.getNum2()){
            raiz = Math.abs(mate.getNum1());
            raiz = Math.sqrt(raiz);
        } else {
            raiz = Math.abs(mate.getNum2());
            raiz = Math.sqrt(raiz);
        }
        System.out.println("El resultado de la raiz es: " + raiz);
    }
}
