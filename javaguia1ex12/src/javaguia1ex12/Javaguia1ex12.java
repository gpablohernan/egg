/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1ex12;

/**
 *
 * @author hagsar
 */
public class Javaguia1ex12 {

    public static void llenarVectores(String[] digito){
        for (int i=0; i<10; i++){
        digito[i]= String.valueOf(i);
         }
        digito[3]= "E";
    }
    
    public static void muetraElementos(String[] dig1, String[] dig2, String[] dig3){
       for (int i = 0 ; i < 10; i++){
           
           for (int j = 0 ; j < 10; j++){
                
                for (int k = 0 ; k < 10; k++){
                    System.out.println(dig3[i] + "-" + dig2[j] + "-" + dig1[k]);
                }    
            }
       }  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dig1 = new String[10];
        String[] dig2 = new String[10];
        String[] dig3 = new String[10];
        
      llenarVectores(dig1);
      llenarVectores(dig2);      
      llenarVectores(dig3);  
     
      muetraElementos(dig1, dig2, dig3);
      
       
        
    }
    
}
