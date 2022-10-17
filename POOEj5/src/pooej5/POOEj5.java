/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;
import Entidad.Cuenta;
import Servicios.CuentaService;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class POOEj5 {
    
    public static void menu(CuentaService Cta, Cuenta Cta1){
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la opción deseada:");
        System.out.println("1 - Ingresar dinero\n"
                + "2 - Retirar dinero\n"
                + "3 - Extracción Rápida (máximo 20% del saldo)\n"
                + "4 - Consultar saldo\n"
                + "5 - Consultar datos\n"
                + "6 - Salir"  );
        opcion = input.nextInt();
        switch (opcion){
            case 1:
                Cta.ingresar(Cta1);
                menu(Cta, Cta1);
                break;
            case 2:
                Cta.retirar(Cta1);
                menu(Cta, Cta1);
                break;
            case 3:
                Cta.extraccionRapida(Cta1);
                menu(Cta, Cta1);
                break;
            case 4:
                Cta.consultarSaldo(Cta1);
                menu(Cta, Cta1);
                break;
            case 5:
                Cta.consultarDatos(Cta1);
                menu(Cta, Cta1);
                break;
            case 6:
                System.out.println("Gracias por usar nuestro sistema.");
                break;
            default:
                System.out.println("Ingrese una Opción válida");
                menu(Cta, Cta1);
                
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaService Cta = new CuentaService();
        Cuenta cta1 = Cta.crearCuenta();
        
        menu(Cta, cta1);
    }
    
}
