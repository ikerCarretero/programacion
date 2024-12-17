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
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int tipus;
        double fahrenheit = 0, celsius = 0;

        System.out.println("Que tipus tens?");
        System.out.println("1. De Celsius a Fahrenheit");
        System.out.println("2. De Fahrenheit a Celsius");
        tipus = sc.nextInt();
        
        
        switch (tipus) {
            case 1:
                System.out.println("Cuanta temperatura tens en Celsius");
                celsius = sc.nextDouble();
                
                System.out.printf("%.2f en fahrenheit es %.2f \n", celsius, mostrarf(celsius));
                
                break;
            case 2:
                System.out.println("Cuanta temperatura tens en Fahrenheit");
                fahrenheit = sc.nextDouble();
                
                System.out.printf("%.2f en fahrenheit es %.2f \n", fahrenheit, mostrarc(fahrenheit));

        }

        
    }
    
    public static double mostrarc(double fahrenheit) {

            double cel = (5.0 / 9) * fahrenheit - 32;
                       
            return cel;
            
        }
    public static double mostrarf(double celsius) {
        
            double fahn = (9.0 / 5) * (celsius + 32);
            
            return fahn;

    }
    
}
