import Servicios.ProductoService;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ProductoService producto = new ProductoService();
        HashMap<String, Double> bDProductos;
        bDProductos = producto.crearBDProductos();
        menu(bDProductos, producto);

    }

    public static void menu(HashMap<String, Double> bDProductos, ProductoService producto){
        Scanner leer = new Scanner(System.in);
        int op;
        System.out.println("MENÚ" + '\n' + '\n' +
        "1 -- AGREGAR PRODUCTOS" + '\n' +
        "2 -- MODIFICAR PRODUCTOS" + '\n' +
        "3 -- ELIMINAR PRODUCTOS" + '\n' +
        "4 -- MOSTRAR PRODUCTOS" + '\n' +
        "5 -- SALIR" + '\n'
        );
        System.out.println("Ingrese una opción");
        op = leer.nextInt();
        switch (op){
            case 1:
                producto.agregarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 2:
                producto.modificarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 3:
                producto.eliminarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 4:
                producto.mostrarProductos(bDProductos);
                menu(bDProductos, producto);
                break;
            case 5:
                System.out.println("Gracias por utilizar el programa. Que tenga un buen día");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");
                menu(bDProductos, producto);
                break;
        }
    }
}

