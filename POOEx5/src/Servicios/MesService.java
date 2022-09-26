/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Mes;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class MesService {
    Scanner input = new Scanner (System.in);

    public void adivinarMes (Mes mes){
    
        String mesRandom;
        mesRandom= mes.getMeses()[(int)(Math.random()*11)+1];
        
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes: ");
        mes.setMesSecretro(input.next().toLowerCase());
        
        //System.out.println(mesRandom);
        
        while(!(mesRandom.equals(mes.getMesSecretro()))){
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            mes.setMesSecretro(input.next().toLowerCase());
        }
        
        System.out.println("¡Ha acertado!");
        
        
    }
    
}

