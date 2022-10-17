/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Libro {
    Scanner input = new Scanner(System.in);
    private int isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public Libro(int isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public Libro() {
    }
    
    public void cargarLibro(){
        System.out.println("Ingrese el ISBN:");
        this.setIsbn(input.nextInt());
        System.out.println("Ingrese el título:");
        this.setTitulo(input.next());
        System.out.println("Ingrese el autor:");
        this.setAutor(input.next());
        System.out.println("Ingrese el número de páginas");
        this.setNroPaginas(input.nextInt());
    }
    
    public void mostrarLibro(){
        System.out.println("El ISBN del libro es: " + this.getIsbn());
        System.out.println("El título del libro es: " + this.getTitulo());
        System.out.println("El autor del libro es: " + this.getAutor());
        System.out.println("El número de páginas del libro es: " + this.getNroPaginas());
    }
}
