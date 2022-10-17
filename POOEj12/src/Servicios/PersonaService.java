/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class PersonaService {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona per1 = new Persona();

        System.out.println("Ingrese su nombre");
        per1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes en el que nacio");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día de su nacimiento");
        int dia = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        per1.setFechaNaci(fecha);
        return per1;

    }
    
    public void calcularEdad(Persona p1){
        
        Date hoy = new Date(); 
        int edad = hoy.getYear() - p1.getFechaNaci().getYear();
        System.out.println("La edad de " + p1.getNombre() + " es " + edad );
     
    }
    
    public boolean menorQue(Persona p1, int mayorEdad) {
        boolean vof = false; 
        Date hoy = new Date(); 
        int edad = hoy.getYear() - p1.getFechaNaci().getYear();
        vof = edad < mayorEdad;
        System.out.println("La persona " + p1.getNombre() + " es menor que " + mayorEdad);
        return vof;
                
    }
    
    public void mostrarPersona (Persona p1) {
        System.out.println(p1.toString());
    }
    
}


