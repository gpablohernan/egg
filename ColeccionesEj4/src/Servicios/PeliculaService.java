package Servicios;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();


        System.out.println("Ingrese el título de la película");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director de la película");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película en horas");
        pelicula.setDuracion(leer.nextFloat());

        return pelicula;
    }

    public ArrayList<Pelicula> crearListaPeliculas(){

        ArrayList<Pelicula> peliculas = new ArrayList<>();
        String opcion;
        do {
            Pelicula pelicula = crearPelicula();
            peliculas.add(pelicula);
            do {
                System.out.println("Desea ingresar otra pelicula? (s/n)");
                opcion = leer.next();
                System.out.println("");
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while (opcion.equalsIgnoreCase("s"));
        return peliculas;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> listaPelis){
        for (Pelicula pelis: listaPelis) {
            System.out.println(pelis);
        }
    }
}
