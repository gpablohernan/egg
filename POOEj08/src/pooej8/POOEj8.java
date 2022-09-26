/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;
import Entidad.Cadena;
import Servicios.CadenaService;
/**
 *
 * @author hagsar
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        Cadena cadena1 = cs.crearCadena();
        cs.mostrarVocales(cadena1);
        cs.invertirFrase(cadena1);
        cs.vecesRepetido(cadena1);
        cs.compararLongitud(cadena1);
        cs.unirFrase(cadena1);
        cs.reemplazar(cadena1);
        System.out.println(cs.contiene(cadena1));
    }

}
