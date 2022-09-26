/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;
import Entidad.Cafetera;
import Servicios.CafeteraService;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class POOEj6 {

    public static void menu(CafeteraService Cafet, Cafetera cafet1){
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la opción deseada:");
        System.out.println("1 - Llenar cafetera\n"
                + "2 - Servir taza\n"
                + "3 - Vaciar cafetera\n"
                + "4 - Agregar Café\n"
                + "5 - Salir"  );
        opcion = input.nextInt();
        switch (opcion){
            case 1:
                Cafet.llenarCafetera(cafet1);
                menu(Cafet, cafet1);
                break;
            case 2:
                Cafet.servirTaza(cafet1);
                menu(Cafet, cafet1);
                break;
            case 3:
                Cafet.vaciarCafetera(cafet1);
                menu(Cafet, cafet1);
                break;
            case 4:
                Cafet.agregarCafe(cafet1);
                menu(Cafet, cafet1);
                break;
            case 5:
                System.out.println("Disfrute su café.");
                break;
            default:
                System.out.println("Ingrese una Opción válida");
                menu(Cafet, cafet1);
                
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService Cafet = new CafeteraService();
        Cafetera cafet1 = Cafet.crearCafetera();
        
        menu(Cafet, cafet1);
    }
    
}
