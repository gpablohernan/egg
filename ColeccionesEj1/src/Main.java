import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razasPerros = new ArrayList<>();
        String decision;
        String eliminar;
        boolean flag = false;

        do {
            System.out.println("Ingrese una raza de perro:");
            razasPerros.add(leer.next());
            System.out.println("Desea ingresar otra raza? (s/n)");
            decision = leer.next();
        } while (!(decision.equalsIgnoreCase("n")));

        for (String cadena: razasPerros) {
            System.out.println(cadena);
        }

        System.out.println("Ingrese una raza a eliminar de la lista:");
        eliminar = leer.next();

        Iterator<String> it = razasPerros.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(eliminar)){
                it.remove();
                flag = true;
            }
        }
        if (flag){
            System.out.println("La raza ingresada se eliminó correctamente");
        } else {
            System.out.println("La raza ingresada no existe en la lista");
        }

        for (String cadena: razasPerros) {
            System.out.println(cadena);
        }

    }
}