/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;
import Entidad.Matematica;
import Servicios.MatematicaService;      
/**
 *
 * @author hagsar
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatematicaService mat = new MatematicaService();
        Matematica mate1 = mat.crearMatematica();
        
        mat.devolverMayor(mate1);
        mat.calcularPotencia(mate1);
        mat.calculaRaiz(mate1);
        
    }
    
}
