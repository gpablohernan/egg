/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class LibroService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
   
        
        System.out.println("Ingrese el ISBN:");
        int isbn = input.nextInt();
        System.out.println("Ingrese el título:");
        String titulo = input.next();
        System.out.println("Ingrese el autor:");
        String autor = input.next();
        System.out.println("Ingrese el número de páginas");
        int nroPaginas = input.nextInt();
        
        
        return new Libro(isbn, titulo, autor, nroPaginas);
    }
    
     public void mostrarLibro(Libro Libro){
        System.out.println("El ISBN del libro es: " + Libro.getIsbn());
        System.out.println("El título del libro es: " + Libro.getTitulo());
        System.out.println("El autor del libro es: " + Libro.getAutor());
        System.out.println("El número de páginas del libro es: " + Libro.getNroPaginas());
    }
}
