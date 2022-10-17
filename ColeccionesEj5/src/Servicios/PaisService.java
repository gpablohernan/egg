package Servicios;
import Entidad.Pais;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pais crearPais(){
        Pais pais = new Pais();


        System.out.println("Ingrese el País:");
        pais.setNombre(leer.next().toUpperCase());


        return pais;
    }

    public TreeSet<Pais> crearConjuntoPaises(){

        TreeSet<Pais> paises = new TreeSet<>();
        String opcion;
        do {
            Pais pais = crearPais();
            paises.add(pais);
            do {
                System.out.println("Desea ingresar otro país? (s/n)");
                opcion = leer.next();
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while (opcion.equalsIgnoreCase("s"));
        return paises;
    }
}
