/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Usuario
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][3];
        int[][] matrizT = new int [3][3];
        antisimetrica(matriz,matrizT);
        
    }
    
    public static void antisimetrica(int[][] matrizF, int[][] matriztF){
        System.out.println("matriz normal");
        for(int i=0; i<3;i++){
            System.out.println("  ");
            for(int j=0; j<3;j++){
                int aleatorio = (int) (Math.random()*(15-(-10)+1)+(-10));
                matrizF[i][j] = aleatorio;
                  System.out.print(matrizF[i][j]);
                System.out.print("  ");
        }
           
        }
        System.out.println("\t");
        System.out.println("  ");
        System.out.println("matriz transpuesta");
        for(int j=0; j<3;j++){
            System.out.println("  ");
            for(int i=0; i<3;i++){
               
                matriztF[i][j] = matrizF[i][j];
                  System.out.print(matriztF[i][j]);
                System.out.print("  ");
        }
        }
        /*System.out.println("\t");
        System.out.println("  ");
               System.out.println("matriz transpuestassssss");
        for(int i=0; i<3;i++){
            System.out.println("  ");
            for(int j=0; j<3;j++){
                              
                  System.out.print(matriztF[i][j]);
                System.out.print("  ");
        }
        }*/
        
        System.out.println("\t");
        System.out.println("  ");
        System.out.println("Comparando matrices...");
        
           for(int i=0; i<3;i++){
               System.out.println("  ");
            for(int j=0; j<3;j++){
                int matrizN = matriztF[j][i] * (-1);
               if(matrizF[i][j]== matrizN){                                              
                System.out.print("  ");
                System.out.print("son iguales");                                
        }else{
                   System.out.print("  ");
                   System.out.print("no son iguales");}
               }
            
            
               System.out.println("\t");
               System.out.println("  ");
        }
        
        
      
    
    }
}

