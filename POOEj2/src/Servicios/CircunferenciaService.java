package Servicios;
import Entidad.Circunferencia;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hagsar
 */
public class CircunferenciaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el radio:");
        double radio = input.nextDouble();
        
        return new Circunferencia(radio);
    }
    
    public void area(Circunferencia circ){
        double calcArea = Math.PI * Math.pow(circ.getRadio(), 2);
        System.out.println("El área es: " + calcArea);
    }
    
    public void perimetro(Circunferencia circ){
        double calcPerimetro = Math.PI * circ.getRadio() * 2;
        System.out.println("El perímetro es: " + calcPerimetro);
    }
}
