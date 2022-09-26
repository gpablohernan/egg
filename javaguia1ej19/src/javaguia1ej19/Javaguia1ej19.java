/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ej19;

/**
 *
 * @author hagsar
 */
public class Javaguia1ej19 {

    public static void llenarMatriz(int[][] matrizA){
    
        for (int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                matrizA[i][j]= ((int) (Math.random() * 10))-5;
            }
        }
	   System.out.println("");
}
	


public static void ImprimirMatrizA(int[][] matrizA){
    for (int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
			System.out.print(" [ " + matrizA[i][j] + " ] ");
            }
		System.out.println("");
    }
}
	


public static void ImprimirMatrizB(int[][] matrizA, int[][] matrizB){
	   System.out.println("");
	
	for (int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
			matrizB[i][j] = matrizA[j][i] *(-1);
			System.out.print(" [ " + matrizB[i][j] + " ] ");
            }
		System.out.println("");
        }
}
    
public static void antiSimetrica(int[][] matrizA, int[][] matrizB){
    boolean flag = false;
    System.out.println("");
	
	for (int i=0; i<4; i++){
            for (int j = 0; j<4; j++){
                        if (matrizB[i][j] == matrizA[i][j]){
                            flag = true;
                        }
			
            }
		
        }
        if (flag){
            System.out.println("La matriz es antisimétrica");
        } else {
          System.out.println("La matriz no es antisimétrica");  
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizA = new int [4][4];
        int[][] matrizB = new int [4][4];
	
	
	llenarMatriz(matrizA);
	ImprimirMatrizA(matrizA);
	ImprimirMatrizB(matrizA, matrizB);
        antiSimetrica(matrizA, matrizB);
    }
    
}
