import Entidad.Pais;
import Servicios.PaisService;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        PaisService pais = new PaisService();
        PaisService paisAEliminar = new PaisService();
        Pais paisEliminado;
        boolean flag = false;

        TreeSet<Pais> conjuntoPaises;
        conjuntoPaises = pais.crearConjuntoPaises();
        System.out.println(conjuntoPaises);

        System.out.println("ELIMINAR PAIS:");

        paisEliminado = paisAEliminar.crearPais();
        Iterator<Pais> it = conjuntoPaises.iterator();
        while (it.hasNext()) {
            if (it.next().equals(paisEliminado)) {
                it.remove();
                flag = true;
            }
        }
        if (flag) {
            System.out.println("El país ingresado se eliminó correctamente");
        } else {
            System.out.println("El país ingresado no existe en la lista");
        }
        System.out.println(conjuntoPaises);
    }
}