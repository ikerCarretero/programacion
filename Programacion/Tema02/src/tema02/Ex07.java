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
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int a, n, total = 0;
        
        System.out.println("Introdueix la a i la n: ");
        a = sc.nextInt();
        n = sc.nextInt();
        
        System.out.println(mostrar(a, n, total));
    }
    
    public static int mostrar(int a, int n, int total) {
        for (int i = 0; i <= n; i++) {
            total = a * i;
        }
        
        return total;
    }
    
}
