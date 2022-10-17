/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex17;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex17 {
    
    public static boolean esPrimo(int num1){
	
	int contador=0;
	
	for (int i=1; i<num1; i++){
		
		if (num1 % i == 0){
			
			contador++;
			
                                }
		
                        }
	
	return contador<=2;
	
                }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
	System.out.println("Ingrese un número:");
	int num1 = read.nextInt();
	
        if (num1 != 0){
		System.out.println("El número " + num1 + " es primo: " + esPrimo(num1));
		
        }else{
	        System.out.println("No se puede dividir por 0");
        }
    }
    
}
