/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej12;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej12 {

    public static void ingresoDatos(int correctos, int incorrectos){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un registro al dispositivo RS232:\n" +
        "(Primer caracter X, último caracter 0, 5 caracteres de largo)\n" +
                "(secuencia &&&&& para terminar)"
                );
        String registro = read.nextLine();
        validaFDE(registro, correctos, incorrectos);
    }
    
    public static void validaFDE(String registro, int correctos, int incorrectos){
        String FDE = "&&&&&";
        if (registro.equals(FDE)){
            System.out.println("Cantidad de registros correctos: " + correctos);
            System.out.println("Cantidad de registros incorrectos: " + incorrectos);  
        } else {
            registroValido(registro, correctos, incorrectos);
        }
    }
    
    public static boolean validaLargo(String registro){
        return registro.length() == 5;
    }
    
    public static boolean validaFormato(String registro){
        return "X".equals(registro.substring(0, 1)) && ("O".equals(registro.substring(4, 5)));
    }
    
    public static void registroValido(String registro, int correctos, int incorrectos){
        if ((validaFormato(registro)) && (validaLargo(registro))){
            correctos ++;
        } else {
            incorrectos++; 
        }
        ingresoDatos(correctos, incorrectos);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int correctos = 0, incorrectos = 0;
        ingresoDatos(correctos, incorrectos);
    }
    
}
