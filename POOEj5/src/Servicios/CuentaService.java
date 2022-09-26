/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Cuenta;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class CuentaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        double saldo;
        System.out.println("Ingrese su número de cuenta:");
        int cta = input.nextInt();
        System.out.println("Ingrese su DNI:");
        long dni = input.nextLong();
        do {
        System.out.println("Ingrese su saldo actual");
        saldo = input.nextInt();
        } while (saldo <= 0);
        
        return new Cuenta(cta, dni, saldo);
    }
    
    public void ingresar(Cuenta Cta){
        double ingreso;
        do {
        System.out.println("Ingrese la cantidad de dinero a depositar:");
        ingreso = input.nextDouble();
        } while (ingreso <=0);
        double saldo = Cta.getSaldoActual() + ingreso;
        Cta.setSaldoActual(saldo);
    }
    
      public void retirar(Cuenta Cta){
        double retiro;
        do {
        System.out.println("Ingrese la cantidad de dinero a retirar:");
        retiro = input.nextDouble();
        } while (retiro <=0);
        double saldo;
        if (retiro > Cta.getSaldoActual()){
            saldo = 0;
        } else {
           saldo = Cta.getSaldoActual() - retiro; 
        }
        Cta.setSaldoActual(saldo);
    }
      
      public void extraccionRapida(Cuenta Cta){
        double retiro;
        do {
        System.out.println("Ingrese la cantidad de dinero a retirar: (máximo 20% de su saldo)");
        retiro = input.nextDouble();
        } while (retiro <=0);
        double saldo = 0;
        if (retiro > (Cta.getSaldoActual())* .2){
            System.out.println("El retiro supera el 20% de su saldo");
            extraccionRapida(Cta);
        } else {
           saldo = Cta.getSaldoActual() - retiro; 
        }
        Cta.setSaldoActual(saldo);
    }
      
      public void consultarSaldo(Cuenta Cta){
          System.out.println("Su saldo actual es: $" + Cta.getSaldoActual());
      }
      
      public void consultarDatos(Cuenta Cta){
          System.out.println("Número de cuenta: " + Cta.getNumeroCuenta());
          System.out.println("DNI: " + Cta.getDni());
          System.out.println("Saldo actual: " + Cta.getSaldoActual());
      }
}
