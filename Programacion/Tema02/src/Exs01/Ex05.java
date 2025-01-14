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
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static int mostrar(int num) {
        
        return num * 2;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Introdueix un numero: ");      
        num = sc.nextInt();
                
        System.out.println(mostrar(num));
    }
    
        
}
