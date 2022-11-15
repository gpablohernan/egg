package Entities;

public class Perro extends Animal{
    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro "+ this.nombre  + " se alimenta de " + this.alimento);
    }
}
