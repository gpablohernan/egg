/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Date;
/**
 *
 * @author hagsar
 */
public class Persona {
    private String nombre;
    private Date fechaNaci;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNaci) {
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNaci=" + fechaNaci + '}';
    }

    public Date setFechaNaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
