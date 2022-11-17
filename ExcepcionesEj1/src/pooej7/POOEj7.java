/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Persona;
import Servicios.PersonaService;


/**
 *
 * @author hagsar
 */
public class POOEj7 {
    
    public static int mayorEdad(PersonaService Pers, Persona persona, int mayorDeEdad){
        if (Pers.esMayorDeEdad(persona)){
            System.out.println(persona.getNombre() + " es mayor de edad");
           mayorDeEdad++;
            
           return mayorDeEdad;
        }
        else System.out.println(persona.getNombre() + " es menor de edad");
            return mayorDeEdad;    
    }
    
    public static void porcentajeMayores(int mayorDeEdad){
            double porcMayores = mayorDeEdad*25;
            double porcMenores = Math.abs((porcMayores-100));
            System.out.println("El porcentaje de mayores de edad es del %" + porcMayores);
            System.out.println("El porcentaje de menores de edad es del %" + porcMenores);
    }
        
    public static int calcIMC(PersonaService Pers, Persona persona) {
        switch(Pers.calcularIMC(persona)){
            case -1:
                System.out.println(persona.getNombre() + " está por debajo de su peso");
                
                return -1;
            case 0:
                System.out.println(persona.getNombre() + " está en su peso ideal");
               
                return 0;
            case 1:
                System.out.println(persona.getNombre() + " tiene sobrepeso");
                
                return 1;
        }
        return 0;
    }   
    
    public static void porcentajeIMC(int imcBajo, int imcNormal, int imcAlto){
        double porcImcBajo = imcBajo*25;
        double porcImcNormal = imcNormal*25;
        double porcImcAlto = imcAlto*25;
        System.out.println("El porcentaje de personas con bajo peso es %" + porcImcBajo);
        System.out.println("El porcentaje de personas peso normal es %" + porcImcNormal);
        System.out.println("El porcentaje de personas sobrepeso es %" + porcImcAlto);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mayorDeEdad=0, imcBajo = 0, imcNormal = 0, imcAlto = 0;
        PersonaService Pers = new PersonaService();
        try {
            Persona persona1 = null;
            mayorDeEdad= mayorEdad(Pers, persona1, mayorDeEdad);
            switch (calcIMC(Pers, persona1)){
                case -1:
                    imcBajo++;
                    break;
                case 0:
                    imcNormal++;
                    break;
                case 1:
                    imcAlto++;
                    break;
            }
        } catch (NullPointerException e){
            System.out.println("Error grave:" + e.getMessage());
        }
        try {
        Persona persona2 = Pers.crearPersona();
        mayorDeEdad=mayorEdad(Pers, persona2, mayorDeEdad);
        switch (calcIMC(Pers, persona2)){
            case -1:
                imcBajo++;
                break;
            case 0:
                imcNormal++;
                break;
            case 1:
                imcAlto++;
                break;
        }
    } catch (NullPointerException e){
        System.out.println("Error grave:" + e.getMessage());
    }
        try {
        Persona persona3 = Pers.crearPersona();
        mayorDeEdad=mayorEdad(Pers, persona3, mayorDeEdad);
        switch (calcIMC(Pers, persona3)){
            case -1:
                imcBajo++;
                break;
            case 0:
                imcNormal++;
                break;
            case 1:
                imcAlto++;
                break;
        }
            } catch (NullPointerException e){
        System.out.println("Error grave:" + e.getMessage());
        }
        try {
        Persona persona4 = Pers.crearPersona();
        mayorDeEdad=mayorEdad(Pers, persona4, mayorDeEdad);
        switch (calcIMC(Pers, persona4)){
            case -1:
                imcBajo++;
                break;
            case 0:
                imcNormal++;
                break;
            case 1:
                imcAlto++;
                break;
        }
            } catch (NullPointerException e){
        System.out.println("Error grave:" + e.getMessage());
        }
        porcentajeMayores(mayorDeEdad);
        porcentajeIMC(imcBajo, imcNormal, imcAlto);
    }
    
}
