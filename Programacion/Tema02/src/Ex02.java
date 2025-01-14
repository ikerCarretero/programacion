
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        
        int numArrel;
        
        System.out.println("Introdueix un numero: ");
        numArrel = sc.nextInt();
        
        calcArrel(numArrel);
        
    }
    
    public static void calcArrel(int numArrel) {
        if (numArrel < 0) {
            System.out.println("El resultat es -1");            
        }else{
            System.out.println("El resultat es :"+ Math.sqrt(numArrel));
        }
    }
    
}
