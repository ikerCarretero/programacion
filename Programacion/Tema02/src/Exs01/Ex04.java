/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exs01;

import java.util.Scanner;

/**
 *
 * @author iker-carretero
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
                
        System.out.println("Introdueix dos numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("\n");
        mostrar(num1, num2);
        
    }
    
    public static void mostrar(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
