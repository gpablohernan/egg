package Servicios;

import Entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno(){
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList<>();

        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(leer.next().toLowerCase());
        System.out.println("Ingrese la primera nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la segunda nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la tercera nota");
        notas.add(leer.nextInt());

        alumno.setNotas(notas);

        return alumno;
    }

    public ArrayList<Alumno> crearListaAlumnos(){

        ArrayList<Alumno> alumnos = new ArrayList<>();
        String opcion;
        do {
            Alumno alumno = crearAlumno();
            alumnos.add(alumno);
            do {
                System.out.println("Desea ingresar otro alumno? (s/n)");
                opcion = leer.next();
                System.out.println("");
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while (opcion.equalsIgnoreCase("s"));
        return alumnos;
    }

    public void notaFinal(ArrayList<Alumno> alumnos){
        String nombre;
        boolean flag = false;

        System.out.println("Ingrese el nombre del alumno para calcular su nota final:");
        nombre = leer.next();
        float nota[] = new float[3];
        float promedio = 0;
        for (Alumno al: alumnos){
            if (nombre.equalsIgnoreCase(al.getNombre())){
                for (int i=0; i<3; i++){
                    promedio += al.getNotas().get(i);
                }
                flag = true;
            }
        }
        if (flag){
            promedio/=3;
            System.out.println("El promedio del alumno " + nombre + " es: " + promedio);
        } else {
            System.out.println("El alumno ingresado no existe");
        }
    }
}
