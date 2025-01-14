
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numDiv1, numDiv2;
        System.out.println("Introdueix dos numeros (N x M): ");
        numDiv1 = sc.nextInt();
        numDiv2 = sc.nextInt();
        
        divisioNombres(numDiv1, numDiv2);
        
    }
    
    public static void divisioNombres(int numDiv1, int numDiv2) {
        int total = 0;
        
        if (numDiv2 == 0){
            System.out.println("Divisio imposible!");
            
        }else{
            System.out.println("La divisio es "+ numDiv1 / numDiv2);
                    
        }
        
        
    }
    
}
