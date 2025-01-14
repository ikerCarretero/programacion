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
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int num;
        

        System.out.println("Introdueix un numero");
        num = sc.nextInt();
       
        System.out.println(mostrar(num));;
        
    }
    
    public static int mostrar(int num) {
        int suma = 0;
        
        while (num != 0){
            suma = suma + num % 10;
            num = num /10;
        }
        
        return suma;
    }
    
}
