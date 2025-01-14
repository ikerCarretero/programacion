
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        
        int menuOper, a, b;
        
        System.out.println("Menu d'operacions:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Producte");
        System.out.println("4.Divisio");
        System.out.println("5.Potencia");
        menuOper = sc.nextInt();
        
        if(menuOper == 1){
            System.out.println("Introdueix els dos nombres (a i b)");
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("Resultat: " + sumarNombres(menuOper, a, b));

        }else if(menuOper == 2){
        
            System.out.println("Introdueix els dos nombres (a i b)");
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("Resultat: " + restaNombres(menuOper, a, b));

        }else if(menuOper == 3){
            System.out.println("Introdueix els dos nombres (a i b)");
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("Resultat: " + producteNombres(menuOper, a, b));

        }else if(menuOper == 4){
            System.out.println("Introdueix els dos nombres (a i b)");
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("Resultat: " + divisioNombres(menuOper, a, b));

        }else{
            System.out.println("Introdueix la base i l'exponent (a i b)");
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("Resultat: " + potenciaNombres(menuOper, a, b));
        }
        
        
        
        
    }
    
    public static int menu() {
        Scanner sc = new Scanner(System.in);

        int opcio;
        do{
            System.out.println("Menu d'operacions:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Producte");
        System.out.println("4.Divisio");
        System.out.println("5.Potencia");
        opcio = sc.nextInt();
        }while(opcio > 1 && opcio < 5);
    }
    
    public static double sumarNombres(int menuOper, int a, int b) {
               
        return a + b;
    }
    
    public static double restaNombres(int menuOper, int a, int b) {

        return a - b;
    }

    public static double producteNombres(int menuOper, int a, int b) {
        double resultat = 0;
        
        if(menuOper == 3){
            resultat = a * b;
        }
        
        return resultat;
    }

    public static double divisioNombres(int menuOper, int a, int b) {
        double resultat = 0;
        
        if(menuOper == 4){
            resultat = a / b;
        }
        
        return resultat;
    }

    public static double potenciaNombres(int menuOper, int a, int b) {
        double resultat = 0;
        
        if(menuOper == 5){
            resultat = (int) Math.pow(a, b);
        }
        
        return resultat;
    }

    
    
}
