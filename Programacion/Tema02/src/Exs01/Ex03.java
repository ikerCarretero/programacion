/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exs01;

import java.util.Random;
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
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
                
        System.out.println("De quina mida vols l'array? ");
        n = sc.nextInt();
        
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = rd.nextInt();
        }
        omple(num, n, total);
        
    }
    public static void omple(int num[], int n, int total) {
        for (int i = 0; i < n; i++) {
            if(num[i] > total){
                total = num[i];
            }
        }
        System.out.println("El element mes gran es "+total);
    }
    
}
