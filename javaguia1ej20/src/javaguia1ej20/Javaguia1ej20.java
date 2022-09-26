/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej20;
import java.util.Scanner;
/**
 *
 * @author hagsar
 */
public class Javaguia1ej20 {
    


public static void llenarMatriz(int[][] matriz){
	Scanner read = new Scanner(System.in);
	for (int i=0; i<3; i++){
		for (int j=0; j<3; j++){
			do {
                            System.out.println("Ingrese valor para posición [" + i + "] [" + j + "] (del 1 al 9)");
                            matriz[i][j]= read.nextInt();
                        
                        } while ((matriz[i][j] > 9) || (matriz[i][j] < 1));
		}
                        }
	System.out.println("La matriz ha sido llenada");
	System.out.println("");
        
        
}

public static void ImprimirMatriz(int[][] matriz){
	
	for (int i=0; i<3; i++){
		for (int j=0; j<3; j++){
			System.out.print(" [ " + matriz[i][j] + " ] ");
}                      
		System.out.println("");
}
                }


// ////////////////////////////////////////////

public static int CalcularSumaFila(int[][] matriz, int fila){
	
	int sumaFila = 0;
        
	for (int j = 0; j<3; j++){
		sumaFila += matriz[fila][j];
}
		
	return sumaFila;
                }


public static int CalcularSumaColumna(int[][] matriz, int columna){
	int sumaColumna = 0;
	
	for (int i = 0; i<3; i++){
		sumaColumna += matriz[i][columna];
}
	
	return sumaColumna;
}


public static int CalcularSumaDiagonal1(int[][] matriz){
	int sumaDiagonal1 = 0;
	
	for (int i = 0; i<3; i++){
		sumaDiagonal1 += matriz[i][i];
}
	return sumaDiagonal1;
                }


public static int CalcularSumaDiagonal2(int[][] matriz){
        int sumaDiagonal2 = 0;
	int j = 2;
	for (int i = 0; i<3; i++){
		
		sumaDiagonal2 += matriz[i][j];
		//Escribir "SumaDiagonal: " "[" i "]" "[" j "]" sumaDiagonal2
		j = j -1;
		
                        }
                   return sumaDiagonal2;
                }


//[00][01][02]
//[10][11][12]
//[20][21][22]


public static int Filas(int[][] matriz){
	int i = 0, resultadoFila;
        int[] vector = new int[3];
        resultadoFila = CalcularSumaFila(matriz, i);
	for (i=1; i<3; i++){
		vector[i] = CalcularSumaFila(matriz, i);
		if (resultadoFila != vector[i])
			resultadoFila = 0;
                                }
                        
                        return resultadoFila;
                        }



public static int Columnas(int[][] matriz){
	int i = 0, resultadoColumna;
	int[] vector = new int[3];
	resultadoColumna = CalcularSumaColumna(matriz, i);
	for (i=1; i<3; i++){
		vector[i] = CalcularSumaColumna(matriz, i);
		if (resultadoColumna != vector[i]){
			resultadoColumna = -1;
                                }
                        }
               return resultadoColumna;
}



public static int Diagonales(int[][] matriz){
	int diag1, diag2, resultadoDiagonales;
	diag1 = CalcularSumaDiagonal1(matriz);
	diag2 = CalcularSumaDiagonal2(matriz);
	
	if (diag1 == diag2){
		resultadoDiagonales = diag1;
                        }else{
		resultadoDiagonales = -2;
                }
                return resultadoDiagonales;
}



public static void MatrizMagica(int resultadoFila, int resultadoColumna, int resultadoDiagonales){
	if (resultadoFila == resultadoColumna && resultadoFila == resultadoDiagonales){
		  System.out.println("La matríz es mágica y la suma es: " + resultadoFila);
                        }else{
		System.out.println("La matriz no es mágica");
                                }
                }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int [3][3];
        int resultadoFila, resultadoColumna, resultadoDiagonales;
	
	
	
	llenarMatriz(matriz);
	
	ImprimirMatriz(matriz);
	
	resultadoFila = Filas(matriz);
	resultadoColumna = Columnas(matriz);
	resultadoDiagonales = Diagonales(matriz);
	MatrizMagica(resultadoFila, resultadoColumna, resultadoDiagonales);
	
    }
    
}
