/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;
import Entidad.Persona;
/**
 *
 * @author hagsar
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona primeraPersona = new Persona();
        Persona segundaPersona = new Persona();
        Persona terceraPersona = new Persona();
        
        primeraPersona.setNombre("Lucio");
        segundaPersona.getNombre();
        terceraPersona.mostrarPersona("Pepe", "López", 35);
        
        
        
    }
    
}
