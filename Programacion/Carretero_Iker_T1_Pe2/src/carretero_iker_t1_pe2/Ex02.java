/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carretero_iker_t1_pe2;

import java.util.Scanner;

/**
 *
 * @author iker-carretero
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        boolean esPositiu = true;
                
        System.out.println("Quina mida te l'array?");
        n = sc.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("array["+i+"] = ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0 || array[i]/2 == 0){
               esPositiu = false;
               contador++ ;
            }
        }
        
        if(esPositiu){
            System.out.println("L'array es un array positiu parell.");
        }else{
            System.out.println("L'array te un index de negativitat de "+contador);
        }
    }
    
}
