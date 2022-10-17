/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Cafetera;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class CafeteraService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        
        int capacidadMaxima;
        int cantidadActual;
        do {
        System.out.println("Ingrese la capacidad máxima de la cafetera (en ml):");
        capacidadMaxima = input.nextInt();
        } while (capacidadMaxima <= 0);
        
        do {
        System.out.println("Ingrese cantidad actal de café en la cafetera (en ml):");
        cantidadActual = input.nextInt();
        } while (cantidadActual <= 0);
        
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera Cafet){
        Cafet.setCantidadActual(Cafet.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera Cafet){
        int capacidadTazaVacia;
        int capacidadRestante;
        do {
        System.out.println("Ingrese capacidad de la taza a llenar (en ml):");
        capacidadTazaVacia = input.nextInt();
        } while (capacidadTazaVacia <= 0);
        capacidadRestante = Cafet.getCantidadActual()-capacidadTazaVacia;
        if (capacidadRestante > 0){
            Cafet.setCantidadActual(capacidadRestante);
        } else {
            capacidadRestante += capacidadTazaVacia;
            System.out.println("La taza se llenó hasta " + (capacidadRestante) + "ml");
            Cafet.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera Cafet){
        Cafet.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera Cafet){
        int cantidadCafe;
        int totalCafe;
        
        do {
        System.out.println("Ingrese capacidad del café a llenar (en ml):");
        cantidadCafe = input.nextInt();
        } while (cantidadCafe <= 0);
        totalCafe = Cafet.getCantidadActual() + cantidadCafe;
        if (totalCafe > Cafet.getCapacidadMaxima()){
            Cafet.setCantidadActual(Cafet.getCapacidadMaxima());
        } else {
            Cafet.setCantidadActual(totalCafe);
        }
    }
}
