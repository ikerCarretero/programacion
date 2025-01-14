
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex10 {

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
        double notaFinal [] = new double [dadesAlumn.length];
        double notaAlta [] = new double [dadesAlumn.length];
        double notaAlumneAlta [] = new double [dadesAlumn.length];
        

        demanarAlumne(dadesAlumn);
        
        
            System.out.println("-----------");
            System.out.printf("Nota final mes alta es: %.2f \n\n", calculNotaFinal(dadesAlumn));
            System.out.printf("Nota mes alta es: %.2f del jugador %.10s\n\n",notaMesAlta(dadesAlumn), alumneNotaMesAlta(dadesAlumn));
        
    }
    
    public static void demanarAlumne(alumnes dadesAlumn[]) {
        Scanner sc = new Scanner(System.in);
        
                
        for (int i = 0; i < dadesAlumn.length; i++) {
                dadesAlumn[i] = new alumnes();

                System.out.println("Nom de l'alumne: ");
                dadesAlumn[i].nom = sc.nextLine();
                

                System.out.println("Edat de l'alumne: ");
                dadesAlumn[i].edat = sc.nextDouble();
                
                System.out.println("Nota de l'alumne del 1º trimestre: ");
                dadesAlumn[i].notaPrimer = sc.nextDouble();

                System.out.println("Nota de l'alumne del 2º trimestre: ");
                dadesAlumn[i].notaSegon = sc.nextDouble();

                System.out.println("Nota de l'alumne del 3º trimestre: ");
                dadesAlumn[i].notaTercer = sc.nextDouble();
                
                System.out.println("");
                
                sc.nextLine();
                
                
        }
        
    }
    
    public static double calculNotaFinal(alumnes dadesAlumn[]) {
        
        double notaFinal = 0;
        
        for (int i = 0; i < dadesAlumn.length; i++) {
            double notaSuma = 0;
            
            notaSuma = dadesAlumn[i].notaPrimer + dadesAlumn[i].notaSegon + dadesAlumn[i].notaTercer;
            
            notaSuma = notaSuma / 3;
            
            if (notaSuma > notaFinal) {
                notaFinal = notaSuma;
            }
            
            
        }
        
        return notaFinal;
    }
    
    public static double notaMesAlta(alumnes dadesAlumn[]) {
        
        double notaAlta = 0;        
        for (int i = 0; i < dadesAlumn.length; i++) {
            
            if (dadesAlumn[i].notaPrimer > dadesAlumn[i].notaSegon && dadesAlumn[i].notaPrimer > dadesAlumn[i].notaTercer) {
                if (dadesAlumn[i].notaPrimer > notaAlta) {
                    notaAlta = dadesAlumn[i].notaPrimer;
                }
                
                
            }else if (dadesAlumn[i].notaSegon > dadesAlumn[i].notaPrimer && dadesAlumn[i].notaSegon > dadesAlumn[i].notaTercer) {
                if (dadesAlumn[i].notaSegon > notaAlta) {
                    notaAlta = dadesAlumn[i].notaSegon;
                }
                     
                
            }else {
                if (dadesAlumn[i].notaTercer > notaAlta) {
                    notaAlta = dadesAlumn[i].notaTercer;
                }
            }
            
        }
        
        return notaAlta;
    }
    
    public static String alumneNotaMesAlta(alumnes dadesAlumn[]) {
        
        String nomAlta = "";
        double notaAlta = 0;
        
        for (int i = 0; i < dadesAlumn.length; i++) {
            
            if (dadesAlumn[i].notaPrimer > dadesAlumn[i].notaSegon && dadesAlumn[i].notaPrimer > dadesAlumn[i].notaTercer) {
                if (dadesAlumn[i].notaPrimer > notaAlta) {
                    notaAlta = dadesAlumn[i].notaPrimer;
                    nomAlta = dadesAlumn[i].nom;
                }
                
                
            }else if (dadesAlumn[i].notaSegon > dadesAlumn[i].notaPrimer && dadesAlumn[i].notaSegon > dadesAlumn[i].notaTercer) {
                if (dadesAlumn[i].notaSegon > notaAlta) {
                    notaAlta = dadesAlumn[i].notaSegon;
                    nomAlta = dadesAlumn[i].nom;
                }
                     
                
            }else {
                if (dadesAlumn[i].notaTercer > notaAlta) {
                    notaAlta = dadesAlumn[i].notaTercer;
                    nomAlta = dadesAlumn[i].nom;
                }
            }
        }    
        return nomAlta;
    }
    
}
