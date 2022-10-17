/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;
import Entidad.Rectangulo;
import Servicios.RectanguloService;
/**
 *
 * @author hagsar
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloService Rect = new RectanguloService();
        Rectangulo rect1 = Rect.crearRectangulo();
        
        float superficie = Rect.calcularSuperficie(rect1);
        float perimetro = Rect.calcularPerimetro(rect1);
        
        System.out.println("La superficie del rectángulo es: " + superficie);
        System.out.println("El perímetro del rectángulo es es: " + perimetro);
        
        Rect.dibujarRectangulo(rect1);
    }
    
}
