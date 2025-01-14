
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        
        int numAlumn;
        alumnes alumnesDaw = new alumnes();

        
    

        
        System.out.println("Quants alumnes vols introduir");
        numAlumn = sc.nextInt();
        
        Curs primerDaw = new Curs();
        primerDaw.estudiants = new alumnes[numAlumn];
       

        
//        double notaFinal [] = new double [dadesAlumn.length];
//        double notaAlta [] = new double [dadesAlumn.length];
//        double notaAlumneAlta [] = new double [dadesAlumn.length];
        

        introduirDadesAlumnesCurs(primerDaw.estudiants);
        
        
            System.out.println("-----------");
            System.out.printf("Nota final mes alta es: %.2f \n\n", calculNotaFinal(primerDaw.estudiants));
            System.out.printf("Nota mes alta es: %.2f del jugador %.10s\n\n",notaMesAlta(primerDaw.estudiants), alumneNotaMesAlta(primerDaw.estudiants));
            System.out.printf("La mitjana de totes les notes finals son: %.2f \n\n",mitjanaNotesCurs(primerDaw.estudiants));
        
    }
    
    public static void introduirDadesAlumnesCurs(alumnes[] estudiants) {
        Scanner sc = new Scanner(System.in);
        Curs primerDaw = new Curs();

        System.out.println("Nom de curs");
        primerDaw.aula = sc.nextLine();
        
        System.out.println("Aula");
        primerDaw.nomCurs = sc.nextLine();
        

        for (int i = 0; i < estudiants.length; i++) {
                estudiants[i] = new alumnes();

                System.out.println("Nom de l'alumne: ");
                estudiants[i].nom = sc.nextLine();
                

                System.out.println("Edat de l'alumne: ");
                estudiants[i].edat = sc.nextDouble();
                
                System.out.println("Nota de l'alumne del 1º trimestre: ");
                estudiants[i].notaPrimer = sc.nextDouble();

                System.out.println("Nota de l'alumne del 2º trimestre: ");
                estudiants[i].notaSegon = sc.nextDouble();

                System.out.println("Nota de l'alumne del 3º trimestre: ");
                estudiants[i].notaTercer = sc.nextDouble();
                
                System.out.println("");
                
                sc.nextLine();
                
                
        }
        
    }
    
    public static double calculNotaFinal(alumnes estudiants[]) {
        
        double notaFinal = 0;
        
        for (int i = 0; i < estudiants.length; i++) {
            double notaSuma = 0;
            
            notaSuma = estudiants[i].notaPrimer + estudiants[i].notaSegon + estudiants[i].notaTercer;
            
            notaSuma = notaSuma / 3;
            
            if (notaSuma > notaFinal) {
                notaFinal = notaSuma;
            }
            
            
        }
        
        return notaFinal;
    }
    
    public static double notaMesAlta(alumnes[] estudiants) {
        
        double notaAlta = 0;        
        for (int i = 0; i < estudiants.length; i++) {
            
            if (estudiants[i].notaPrimer > estudiants[i].notaSegon && estudiants[i].notaPrimer > estudiants[i].notaTercer) {
                if (estudiants[i].notaPrimer > notaAlta) {
                    notaAlta = estudiants[i].notaPrimer;
                }
                
                
            }else if (estudiants[i].notaSegon > estudiants[i].notaPrimer && estudiants[i].notaSegon > estudiants[i].notaTercer) {
                if (estudiants[i].notaSegon > notaAlta) {
                    notaAlta = estudiants[i].notaSegon;
                }
                     
                
            }else {
                if (estudiants[i].notaTercer > notaAlta) {
                    notaAlta = estudiants[i].notaTercer;
                }
            }
            
        }
        
        return notaAlta;
    }
    
    public static String alumneNotaMesAlta(alumnes estudiants[]) {
        
        String nomAlta = "";
        double notaAlta = 0;
        
        for (int i = 0; i < estudiants.length; i++) {
            
            if (estudiants[i].notaPrimer > estudiants[i].notaSegon && estudiants[i].notaPrimer > estudiants[i].notaTercer) {
                if (estudiants[i].notaPrimer > notaAlta) {
                    notaAlta = estudiants[i].notaPrimer;
                    nomAlta = estudiants[i].nom;
                }
                
                
            }else if (estudiants[i].notaSegon > estudiants[i].notaPrimer && estudiants[i].notaSegon > estudiants[i].notaTercer) {
                if (estudiants[i].notaSegon > notaAlta) {
                    notaAlta = estudiants[i].notaSegon;
                    nomAlta = estudiants[i].nom;
                }
                     
                
            }else {
                if (estudiants[i].notaTercer > notaAlta) {
                    notaAlta = estudiants[i].notaTercer;
                    nomAlta = estudiants[i].nom;
                }
            }
        }    
        return nomAlta;
    }
        
    public static double mitjanaNotesCurs(alumnes[] estudiants) {
        double notaFinal = 0, notaSuma = 0;
        int contador = 0;

        for (int i = 0; i < estudiants.length; i++) {
            

            notaSuma = estudiants[i].notaPrimer + estudiants[i].notaSegon + estudiants[i].notaTercer;

            notaSuma = notaSuma / 3;
            
            notaFinal =+ notaSuma;
            
            contador = i;

        }

        return notaFinal / contador;
    }
    
    
    public static void alumnesAprovats(String[] args) {
        
        
        
    }
    
}
