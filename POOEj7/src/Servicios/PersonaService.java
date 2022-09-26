/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class PersonaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
     String nombre;
     int edad;
     String sexo;
     float peso;
     float altura;
      
        
        
        System.out.println("Ingrese el nombre:");
        nombre = input.next();
        System.out.println("Ingrese la edad:");
        edad = input.nextInt();
        
        do {
        System.out.println("Ingrese el sexo (H, M, O):");
        sexo = input.next().toUpperCase();
        } while (!"H".equals(sexo) && !"M".equals(sexo) && !"O".equals(sexo));
        
        System.out.println("Ingrese el peso:");
        peso = input.nextFloat();
        System.out.println("Ingrese la altura");
        altura = input.nextFloat();
        
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
        
    public int calcularIMC(Persona Pers){
        double calcIMC = Pers.getPeso()/(Math.pow(Pers.getAltura(), 2));
        if (calcIMC < 20){
            return -1;
        } else if (calcIMC > 25){
            return 1;
        } else return 0;
        
    }
    
    public boolean esMayorDeEdad(Persona Pers){
        return Pers.getEdad() >= 18;
    }
}
