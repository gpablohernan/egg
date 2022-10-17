import Entidad.Pelicula;
import Servicios.PeliculaService;
import Utilidades.Comparadores;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        PeliculaService pelicula = new PeliculaService();
        Pelicula pelicula1 = new Pelicula();

        ArrayList<Pelicula> listaPelis;
        listaPelis = pelicula.crearListaPeliculas();

        System.out.println("ORDEN COMÚN:");
        System.out.println(listaPelis);
        System.out.println("MAYORES A UNA HORA:");
        for (Pelicula pelis: listaPelis) {
            if (pelis.getDuracion()>1){
                System.out.println(pelis);
            }
        }
        System.out.println("ORDEN POR DURACIÓN DESCENDENTE:");
        Collections.sort(listaPelis, Comparadores.ordenarPorDuracionDesc);
        pelicula.mostrarPeliculas(listaPelis);
        System.out.println("ORDEN POR DURACIÓN ASCENDENTE:");
        Collections.sort(listaPelis, Comparadores.ordenarPorDuracionAsc);
        pelicula.mostrarPeliculas(listaPelis);
        System.out.println("ORDEN POR TITULO:");
        Collections.sort(listaPelis, Comparadores.ordenarPorTitulo);
        pelicula.mostrarPeliculas(listaPelis);
        System.out.println("ORDEN POR DIRECTOR:");
        Collections.sort(listaPelis, Comparadores.ordenarPorDirector);
        pelicula.mostrarPeliculas(listaPelis);

    }
}
