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
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        
        System.out.println("Introdueix un numero: ");
        int num1 = sc.nextInt();
        
        System.out.println(mostrar(num1, total));
    }
    
    public static int mostrar(int num1, int total) {
        for (int i = 1; i < num1; i++) {
            if(i % 2 != 0){
                total += i;
            }
        }
        return total;
    }
    
}
