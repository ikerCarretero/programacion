
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int x, y, z;
        
        System.out.println("Introdueix la x, y i la z: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        fan_parella(x, y, z);
        
    }
    
    public static void fan_parella(int x, int y, int z) {
        
        if (x == y | x == z | y == z){
            System.out.println("Hi ha dos numeros iguals");
        }else{
            System.out.println("No hi ha cap parella");
        }
        
    }
    
}
