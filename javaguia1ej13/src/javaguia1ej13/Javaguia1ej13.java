/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej13;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); 
        int num, i, j;
	System.out.println("Ingresar un numero entero:");
        num = read.nextInt();
	for (i=0; i<num ; i++){
            for (j = 0; j<num; j++){
			if (i == 0 || i == num-1 ){
				System.out.print("*");
			} else if(j==0 || j== num-1){          
					System.out.print("*");       
				} else {                                  
					System.out.print(" ");         
				}                               
				                                  
			
		}
		System.out.println(" "); 
	}
    }
    
}
//	Definir num, i, j Como Entero
//	Escribir "Ingresar un numero entero"
//	leer num
//	Para i=1 Hasta num Con Paso 1 Hacer
//		Para j = 1 Hasta num Con Paso 1 Hacer
//			si (i == 1 o i == num ) entonces
//				escribir "* " Sin Saltar
//			SiNo
//				si j==1 o j== num Entonces          
//					Escribir " * " Sin Saltar        
//				SiNo                                  
//					escribir "  " Sin Saltar         
//				FinSi                               
//			Fin Si	                                  
//			
//		Fin Para
//		escribir " " 
//	Fin Para
	