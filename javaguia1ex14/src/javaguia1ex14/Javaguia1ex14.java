/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex14;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] familias;
        System.out.println("Ingrese el número de familias");
        int cantFam = read.nextInt();
        familias = new int[cantFam];
        for (int i = 0; i< cantFam; i++){
            System.out.println("Ingrese el número de hijos para la familia " + (i+1));
            familias[i]= read.nextInt();
        }
    }
}
// 3 familias flia[0]=2     flia[1]=3       flia[2]=1 
// 