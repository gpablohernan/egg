/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author hagsar
 */
public class Libro {
    
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
    
}
