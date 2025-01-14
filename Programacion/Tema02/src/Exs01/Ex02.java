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
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int param1, param2, param3;
        
        System.out.println("Introdueix tres parametres: ");
        param1 = sc.nextInt();
        param2 = sc.nextInt();
        param3 = sc.nextInt();
        
        mostrar(param1, param2, param3);
    }
    
    public static void mostrar(int param1, int param2, int param3) {
            int max = 0;
            if(param1 > param2 && param1 > param3){
                max = param1;
            }else if (param2 > param1 && param2 > param3){
                max = param2;
            }else{
                max = param3;
            }
        
            System.out.println("El nombre mes gran es "+max);
        
    }
    
}
