/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex9;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dividendo, divisor, resto, cociente;
	System.out.println("Ingrese el dividendo:");
        dividendo = read.nextInt();
	System.out.println("Ingrese el divisor:");
	divisor = read.nextInt();
        
        resto = dividendo;
	cociente = 0;
	while (resto > divisor){
		resto = resto - divisor;
		cociente = cociente + 1;
                        }
	System.out.println("El cociente de la división es " + cociente + " y el resto es " + resto);
        
    }
    
}
