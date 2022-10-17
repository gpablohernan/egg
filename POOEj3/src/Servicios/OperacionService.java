/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Operacion;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class OperacionService {
    
   Scanner input = new Scanner(System.in).useDelimiter("\n");
   
   public Operacion crearOperacion(){
       System.out.println("Ingrese el primer número :");
        double num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número :");
        double num2 = input.nextDouble();
        
        return new Operacion(num1, num2);
    }
   
    public double sumar(Operacion Oper){
        double suma = Oper.getNumero1() + Oper.getNumero2();
        return suma;
    }    
    
    public double restar(Operacion Oper){
        double resta = Oper.getNumero1() - Oper.getNumero2();
        return resta;
    }    
    
    public double multiplicar(Operacion Oper){
        if (Oper.getNumero1() == 0 || Oper.getNumero2() == 0){
            return 0;
        } else {
            double multiplicacion = Oper.getNumero1() * Oper.getNumero2();
        return multiplicacion;
        }
    }
    public double dividir(Operacion Oper){
        if (Oper.getNumero1() == 0 || Oper.getNumero2() == 0){
            return 0;
        } else {
            double division = Oper.getNumero1() / Oper.getNumero2();
        return division;
        }    
        
        
    }    
   
    
    
}
