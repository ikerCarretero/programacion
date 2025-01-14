
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double souActu;
        String nom, dni;
        
        System.out.println("Introdueix el dni del treballador");
        dni = sc.nextLine();
        
        System.out.println("Introdueix el nom del treballador");
        nom = sc.nextLine();
        
        System.out.println("Introdueix el sou actual del treballador");
        souActu = sc.nextDouble();  
        
        System.out.printf("El treballador %.10s amb dni %.10s, te sou un amb el 5 per cent es %.2f \n",nom, dni, calculSou(souActu));
        
    }
    
    public static double calculSou(double souActu) {
        
        return (souActu * 0.05) + souActu;
        
    }
}
