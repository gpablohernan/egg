import Entidad.Perro;
import Entidad.Persona;

public class Main {
    public static void main(String[] args){

        Perro perro1 = new Perro("Fito", "Gran Danés", 9, "Grande");
        Perro perro2 = new Perro("Beto", "Pitbull", 4, "Mediano");
        Persona persona1 = new Persona("Pepe", "López", 35, 37265941, perro1);
        Persona persona2 = new Persona("Vera", "González", 31, 41234879, perro2);

        System.out.println(persona1);
        System.out.println(persona2);



    }
}