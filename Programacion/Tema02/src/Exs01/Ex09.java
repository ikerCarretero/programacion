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
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        
        boolean parell = false;
        
        System.out.println("Introdueix el tamany de l'array: ");
        int fila = sc.nextInt();
        
        System.out.println("Introdueix el tamany de l'array: ");
        int numP = sc.nextInt();
        
        int[] taula = new int[fila];
        
        for (int i = 0; i < taula.length; i++) {
            taula[i] = rd.nextInt(1,10);
        }
        
        for (int i = 0; i < taula.length; i++) {
            System.out.print(taula[i]+"  ");
        }
        
        System.out.println("");
        
        
        if(mostrar(taula, parell, numP) ==  true){
            System.out.println("El numero "+ numP +" es troba en la taula");
        }else{
            System.out.println("El numero "+ numP +" no es troba");
        }
        
    }
    
    public static boolean mostrar(int taula[], boolean parell, int numP) {
        
        for (int i = 0; i < taula.length; i++) {
            if(taula[i] == numP){
                parell = true;
            }
        }
        
        return parell;
    }
}
