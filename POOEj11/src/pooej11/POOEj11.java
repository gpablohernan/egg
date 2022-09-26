/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;
import java.time.LocalDateTime;
import java.util.Date;
import Servicios.DateService;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author hagsar
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
     DateService sday = new DateService(); 
     Date day = new Date();
     DateTimeFormatter dtf = new DateTimeFormatter ();
       
        System.out.println(sday.fecha());
        System.out.println(sday.fecha2());
        System.out.println(dtf.format(LocalDateTime.now ()) - sday.fecha());
    }
}
