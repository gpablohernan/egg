import Entidad.Perro;
import Entidad.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Perro> perros = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();



        Perro perro1 = new Perro("Fito", "Gran Danés", 9, "Grande", false);
        Perro perro2 = new Perro("Beto", "Pitbull", 4, "Mediano", false);
        Perro perro3 = new Perro("Nina", "Caniche", 2, "Chico", false);
        Perro perro4 = new Perro("Flor", "Buldog Francés", 7, "Chico", false);
        Perro perro5 = new Perro("Fonzo", "Dogo", 4, "Grande", false);


        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);

        for (int i = 0; i < perros.size(); i++) {
            Persona persona = new Persona();
            System.out.println("Ingrese su nombre:");
            persona.setNombre(read.next());
            System.out.println("Ingrese su apellido:");
            persona.setApellido(read.next());
            System.out.println("Ingrese su edad:");
            persona.setEdad(read.nextInt());
            System.out.println("Ingrese su DNI:");
            persona.setEdad(read.nextInt());
            eligePerro(perros, persona);
            personas.add(persona);
        }

        System.out.println(personas);
    }

    public static void eligePerro(ArrayList<Perro> perros, Persona persona) {
        Scanner read = new Scanner(System.in);
        String nombrePerro;
        boolean flag = false;

        System.out.println("Ingrese el nombre del perro a adoptar de la lista:");
        for (Perro perrosNom : perros) {
            System.out.println(perrosNom.getNombre());
        }
        nombrePerro = read.next();

        for (Perro perrosNom : perros) {
            if (nombrePerro.equalsIgnoreCase(perrosNom.getNombre())) {
                if (!perrosNom.isAdoptado()) {
                    perrosNom.setAdoptado(true);
                    persona.setPerro(perrosNom);
                    System.out.println("Muchas gracias por adoptar a " + perrosNom.getNombre());
                    flag = true;



                } else {
                    System.out.println("Lo siento, ese perro ya se encuentra adoptado. Elija otro perro por favor");
                    eligePerro(perros, persona);
                    flag = true;
                }

            }
        } if (!flag) {
            System.out.println("El nombre igresado es incorrecto o no existe en la lista");
            eligePerro(perros, persona);
        }
    }

}