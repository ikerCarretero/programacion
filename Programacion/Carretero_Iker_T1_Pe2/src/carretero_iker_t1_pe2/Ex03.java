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
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int productes;
        
        int [][] taula = new int [3][5];
        
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = 0;
            }
        }

        
        System.out.println("Quants productes he de posar?");
        productes = sc.nextInt();
        
        int[] producte = new int[productes];
        
        for (int i = 0; i < producte.length; i++) {
                System.out.println("Producte "+(i+1));
                producte[i] = sc.nextInt();
            
        }
        
        for(int i = 0; i < producte.length;i++){
            if(producte[i] < 10){
                taula[2][i] = producte[i];
            }else if(producte[i] >= 10 || producte[i]/2 == 0){
                taula[1][i] = producte[i];
            }else if(producte[i] >= 10 && producte[i]/2 != 0){
                taula[0][i] = producte[i];
            }
        }
        
            System.out.println("Report:");
            System.out.print("   ");
            for (int i = 1; i <= 5; i++) {
                System.out.print("----");
            }

            System.out.print("-");
            System.out.println();

            for (int i = 2; i >= 0; i--) {

                System.out.print("   ");

                for (int j = 0; j < 5 + 1; j++) {
                    if (j < 5) {
                        System.out.print("| " + taula[i][j] + " ");
                    } else{
                        System.out.print("|  ");
                    }
                }

                System.out.println();
                System.out.print("   ");

                for (int j = 1; j <= 5; j++) {
                    System.out.print("----");
                }

                System.out.print("-");
                System.out.println();
            }

            System.out.print("  ");

            for (int j = 1; j <= 5; j++) {

                System.out.print("    ");
            }
        
        
    }
    
}
