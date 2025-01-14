/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exs01;

import java.util.Random;

/**
 *
 * @author iker-carretero
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        
        int [] arrayP = new int [6];
        int [] arrayG = new int [6];
        int contador = 0;
        
        for (int i = 0; i < arrayP.length; i++) {
            arrayP[i] = rd.nextInt(1,10);
        }
        
        for (int i = 0; i < arrayG.length; i++) {
            arrayG[i] = rd.nextInt(1,10);
        }
        System.out.println("Aposta teva");
        for (int i = 0; i < arrayP.length; i++) {
            System.out.print(arrayP[i]+"  ");
        }
        
        System.out.println("\nAposta guanyadora");
        for (int i = 0; i < arrayG.length; i++) {
            System.out.print(arrayG[i]+ "  ");
        }

        System.out.println("\nTens "+mostrar(arrayP, arrayG, contador)+" que coincideixen");
        
    }
    
    public static int mostrar(int arrayP[], int arrayG[], int contador) {
        for (int i = 0; i < arrayP.length; i++) {
            for (int j = 0; j < arrayG.length; j++) {
                if (arrayP[i] == arrayG[j]){
                    contador ++;
                }    
            }
        }
        
        return contador;
        
    }
    
}
