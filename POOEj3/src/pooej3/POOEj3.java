/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;
import Entidad.Operacion;
import Servicios.OperacionService;
/**
 *
 * @author hagsar
 */
public class POOEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionService Oper = new OperacionService();
        Operacion oper1 = Oper.crearOperacion();
        
        double suma = Oper.sumar(oper1);
        double resta = Oper.restar(oper1);
        double multiplicacion = Oper.multiplicar(oper1);
        double division = Oper.dividir(oper1);
        
        
        System.out.println("La suma de ambos números es: " + suma);
        System.out.println("La resta de ambos números es: " + resta);
        if (multiplicacion == 0){
            System.out.println("ERROR: Multiplicación por 0");
        } else {
            System.out.println("La multiplicación de ambos números es: " + multiplicacion);
        }
        
        if (division == 0){
            System.out.println("ERROR: Division por 0");
        } else {
            System.out.println("La division de ambos números es: " + division);
        }
        
       
    }
    
}
