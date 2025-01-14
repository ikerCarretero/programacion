
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        
        int numAlumn;
        alumnes nom = new alumnes();
        alumnes edat = new alumnes();
        alumnes notaPrimer = new alumnes();
        alumnes notaSegon = new alumnes();
        alumnes notaTercer = new alumnes();

        
        System.out.println("Quants alumnes vols introduir");
        numAlumn = sc.nextInt();
        
        alumnes dadesAlumn [] = new alumnes [numAlumn];
        

        demanarAlumne(dadesAlumn);
        
        calculNotaFinal(dadesAlumn);
        
    }
    
    public static void demanarAlumne(alumnes dadesAlumn[]) {
        Scanner sc = new Scanner(System.in);
        
                
        for (int i = 0; i < dadesAlumn.length; i++) {
                dadesAlumn[i] = new alumnes();

                System.out.println("Nom de l'alumne: ");
                dadesAlumn[i].nom = sc.nextLine();
                

                System.out.println("Edat de l'alumne: ");
                dadesAlumn[i].edat = sc.nextDouble();
                
                System.out.println("Notes de l'alumne del 1º trimestre: ");
                dadesAlumn[i].notaPrimer = sc.nextDouble();

                System.out.println("Notes de l'alumne del 2º trimestre: ");
                dadesAlumn[i].notaSegon = sc.nextDouble();

                System.out.println("Notes de l'alumne del 3º trimestre: ");
                dadesAlumn[i].notaTercer = sc.nextDouble();
                
                System.out.println("");
                
                sc.nextLine();
                
                
        }
        
    }
    
    public static void calculNotaFinal(alumnes dadesAlumn[]) {
        
        
        for (int i = 0; i < dadesAlumn.length; i++) {
            double notaSuma = 0, notaFinal = 0;
            
            notaSuma = dadesAlumn[i].notaPrimer + dadesAlumn[i].notaSegon + dadesAlumn[i].notaTercer;
            
            notaFinal = notaSuma / 3;
            System.out.printf("El alumne %.10s te %.2f de nota final \n", dadesAlumn[i].nom, notaFinal);
            
        }
        
        
    }
    
}
