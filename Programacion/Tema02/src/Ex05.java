
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sexeAtleta = " ";
        int edatAtleta = 0;   
        double tempsAtleta = 0;
        
        dadesAtleta(sexeAtleta, edatAtleta, tempsAtleta); 
        atletasAptes(sexeAtleta, edatAtleta, tempsAtleta);
   }
    
    public static void dadesAtleta(String sexeAtleta, int edatAtleta, double tempsAtleta) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix el sexe del corredor (Home o Dona): ");
        sexeAtleta = sc.nextLine().toLowerCase();
                
        System.out.println("Introdueix l'edat del atleta: ");
        edatAtleta = sc.nextInt();
        
        System.out.println("Introdueix el temps que a fet l'atleta en l'anterior carrera");
        tempsAtleta = sc.nextDouble();
    }
    
    public static void atletasAptes(String sexeAtleta, int edatAtleta, double tempsAtleta) {
        
        if(tempsAtleta >= 150 && sexeAtleta == "home" && edatAtleta < 40){
            System.out.println("Ets apta1");
            
        }else if (tempsAtleta >= 175 && sexeAtleta == "home" && edatAtleta >= 40){
            
            System.out.println("Ets apta2");
            
        }else if(tempsAtleta >= 175 && sexeAtleta == "dona" && edatAtleta >= 40){
            
            System.out.println("Ets apta3");
            
        }else{
            
            System.out.println("No ets apta perque no compleixes els requisits");

        }
    }
    
}
