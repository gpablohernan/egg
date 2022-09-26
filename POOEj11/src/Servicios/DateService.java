/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class DateService {
    int dia,mes,anio;
  
Scanner entrada = new Scanner(System.in);
    public Date fecha (){
       System.out.println("ingrese la fecha");
       int dia =  entrada.nextInt();
        System.out.println("Ingrese un mes");
        int mes = entrada.nextInt();
        System.out.println("Ingrese un año");
        int anio =  entrada.nextInt();
Date day = new Date(anio,mes,dia);
        return day;
    }
  public Date fecha2 (){
       System.out.println("ingrese la fecha");
       int dia =  entrada.nextInt();
        System.out.println("Ingrese un mes");
        int mes = entrada.nextInt();
        System.out.println("Ingrese un año");
        int anio =  entrada.nextInt();
Date day = new Date(anio,mes,dia);
        return day;
    }

}

