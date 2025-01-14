
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int quantDiners;
        
        System.out.println("Quanta cuanitat de diners es el negoci? ");
        quantDiners = sc.nextInt();
        
        calcula_bonificacio(quantDiners);
        
    }
    
    public static void calcula_bonificacio(int quantDiners) {
        
        double bonificacio = 0;
        if (quantDiners <= 20000){
            
            bonificacio = (quantDiners *(2.0 / 100) + 7000);
            
        }else if(quantDiners > 20000 && quantDiners < 50000){
            
            bonificacio = (quantDiners * (3.0 / 100) + 15000);

        }else{
            
            bonificacio = (quantDiners * (12.0 / 100) + 20000);

        }
        
        System.out.println("Has guanyat "+bonificacio+"€");
    }
    
}
