/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;
import Entidad.Circunferencia;
import Servicios.CircunferenciaService;
/**
 *
 * @author hagsar
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaService circ1 = new CircunferenciaService();
        
        Circunferencia circunferencia1 = circ1.crearCircunferencia();
        circ1.area(circunferencia1);
        circ1.perimetro(circunferencia1);
    }
    
}
