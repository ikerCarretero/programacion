
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author iker-carretero
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        double [][] temperatura = new double[12][30];
        
        boolean fin = true;
        int opcio;
        int semana = 0, mes = 0;

        
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                temperatura[i][j] = rd.nextDouble(0, 41);
            }
        }
        
        //Pintar la taula
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                System.out.printf("%.2f| ", temperatura[i][j]);
                }
            System.out.println("");
        }
        
        //Menu
        do {

            System.out.println("");
            System.out.println("1. El dia més fred de l'any");
            System.out.println("2. El dia més calorós de l' any");
            System.out.println("3. La temperatura mitjana de cada mes");
            System.out.println("4. La diferència entre el dia més fred i més calorós de cada mes");
            System.out.println("5. Finalitzar el programa");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    System.out.printf("El dia més fred de l'any es el %.2f \n", mesFred);
                    System.out.println("" + semana + "," + mes);
                    break;
                case 2:
                    System.out.printf("El dia més calorós de l'any: %.2f\n", mesCalor);
                    break;
                case 3:
                    for (int i = 0; i < 12; i++) {
                        System.out.printf("Mes %.2f", tempMitja);
                    }
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Final!!");
                    fin = true;
                    break;
            }

        } while (fin = true);
               
        menuTemps(temperatura);
    }
    
    public static void omplirArray(double temperatura[][]) {
        
    }
    
    public static void mostrarArray(double temperatura[][]) {
        
    }
    
    public static void demarOpciow(double temperatura[][]) {
        
    }
    
    public static void mesFred(double temperatura[][]) {
        Scanner sc = new Scanner(System.in);

        double mesFred = 0, mesCalor = 0;
        
        boolean fin = true;
        int opcio;
        int contadorI = 0, contadorJ = 0;
        
        //double[] tempMax = new double[12];
        //double[] tempMin = new double[12];
        double[] tempMitja = new double[12];
        double[] tempDifer = new double[12];
        
        
        
        contadorI = 0;
        contadorJ = 0;
        for (int i = 0; i < temperatura.length; i++) {
            double mitjana = 0;
            contadorI++;
            
            for (int j = 0; j < temperatura[i].length; j++) {
                contadorJ++;
                 if (temperatura[i][j] < mesFred){
                    mesFred = temperatura[i][j];
                    mes = i + 1;
                    semana = j + 1;
                }else if(temperatura[i][j] > mesCalor ){
                    mesCalor = temperatura[i][j];
                }
                 
                mitjana = temperatura[i][j];
                
                }
            
            tempMitja[i] = mitjana / 30;
            tempDifer[i] = mesFred - mesCalor;
            
                       
        }
        
       
             
    }
    
    public static float mesFred() {
        
    }
    
    }
