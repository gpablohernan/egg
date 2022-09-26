/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;
import Entidad.Persona;
import Servicios.PersonaService;
/**
 *
 * @author hagsar
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
    PersonaService sp = new PersonaService();
    Persona p1 = sp.crearPersona();
    sp.calcularEdad(p1);
  //  sp.menorQue(p1, 50);
        System.out.println(sp.menorQue(p1, 50));
    sp.mostrarPersona(p1);   
        
    }
    
}