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
public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarPersona(String nombre, String Apellido, int edad){
        this.setNombre(nombre);
        this.setApellido(Apellido);
        this.setEdad(edad);
        System.out.println(this.getNombre());
        System.out.println(this.getApellido());
        System.out.println(this.getEdad());
        
    }

   
    

    public Persona() {
    }
    
}
