/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej11;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej11 {
    

    public static void menu(int num1, int num2){
        Scanner read = new Scanner(System.in);
        System.out.println("MENU\n" +
"1. Sumar\n" +
"2. Restar\n" +
"3. Multiplicar\n" +
"4. Dividir\n" +
"5. Salir\n" +
"Elija opción:");
        int opcion = read.nextInt();
        switch(opcion){
            case 1:
                System.out.println("La suma de ambos números es: " + sumar(num1, num2));
                menu(num1, num2);
                break;
            case 2:
                System.out.println("La resta de ambos números es: " + restar(num1, num2));
                menu(num1, num2);
                break;
            case 3:
                System.out.println("La multiplicación de ambos números es: " + multiplicar(num1, num2));
                menu(num1, num2);
                break;
            case 4:
                dividir(num1, num2);
                menu(num1, num2);
                break;
            case 5:
                salir(num1, num2);
                break;
            default:
                System.out.println("Ingrese una opción válida");
                menu(num1, num2);
        }
    }
    
    public static int sumar(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    public static int restar(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    
    public static int multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    
    /**
     *
     * @param num1
     * @param num2
     */
    public static void dividir(double num1, double num2){
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
           double resultado = (num1 / num2);
           System.out.println("La división de ambos números es: " + resultado); 
        }
        
    }
    
    public static void salir(int num1, int num2){
        Scanner read = new Scanner(System.in);
        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
        String resp = read.nextLine().toUpperCase();
        if (resp.equals("S")){
            System.out.println("Hasta luego"); 
        } else {
            menu(num1, num2);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = read.nextInt();
        menu(num1, num2);
        
    }
    
}
