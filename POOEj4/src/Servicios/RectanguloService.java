/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author hagsar
 */
public class RectanguloService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo :");
        float base = input.nextFloat();
        System.out.println("Ingrese la altura del rectángulo :");
        float altura = input.nextFloat();
        
        return new Rectangulo(base, altura);
        
    }
    
     public float calcularSuperficie(Rectangulo Rect){
        float superficie = Rect.getBase() * Rect.getAltura();
        return superficie;
    }    
    
    public float calcularPerimetro(Rectangulo Rect){
        float perimetro = (Rect.getBase() + Rect.getAltura()) * 2;
        return perimetro;
    }  
    
    public void dibujarRectangulo(Rectangulo Rect){
        for (int i=0; i < Rect.getAltura(); i++){
            for (int j=0; j< Rect.getBase(); j++){
                if (i == 0 || j==0 || i==(Rect.getAltura()-1) || j==(Rect.getBase()-1)) {
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
}

