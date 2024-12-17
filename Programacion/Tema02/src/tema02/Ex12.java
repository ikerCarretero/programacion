/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02;

import java.util.Scanner;

/**
 *
 * @author iker-carretero
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int n;
        
        System.out.println("Quants numero vols ficar? ");
        n = sc.nextInt();
        
        int[] num = new int[n];


        System.out.println("Introdueix un numero");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
       
        mostrar(num);
        
    }
    
    public static void mostrar(int num[]) {


        for (int i = num.length -1 ; i >= 0; i--) {
            System.out.print(num[i]+" ");
        }
        
        
    }
    
}
