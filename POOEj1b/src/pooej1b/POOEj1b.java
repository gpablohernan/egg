/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1b;
import Entidad.Libro;
import Servicios.LibroService;
/**
 *
 * @author hagsar
 */
public class POOEj1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService libro1 = new LibroService();
        
        Libro primerLibro = libro1.crearLibro();
        libro1.mostrarLibro(primerLibro);
    }
    
}
