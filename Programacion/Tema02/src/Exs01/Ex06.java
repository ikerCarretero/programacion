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
public class Ex06 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        boolean parell = false;
        int num;
        
        System.out.println("Introdueix un numero: ");
        num = sc.nextInt();
        
        if (mostrar(parell, num)){
            System.out.println("El numero es parell");
        }else{
            System.out.println("El numero no es parell");
        }
        
        
        
    }
    
    public static boolean mostrar(boolean parell, int num) {
        if(num % 2 == 0){
            parell = true;
        }
        
        return parell;
    }

    
}
