/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Projecte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iker-carretero
 */
public class carreteroIker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int [][] taula = new int [3][9];
        
//        boolean fi = false;
//        
//        String seguentNum;
        
        //do{
            crearTaula(taula);
            mostrarTaula(taula);
            for (int i = 0; i < 90; i++) {
                System.out.println("Nou numero:" + mostrarNumBombo(taula));

        }
            
            
//            System.out.println("Següent número (s/n)?: ");
//            seguentNum = sc.nextLine();
            
        //}while(fi);
        
    }
    
    public static void crearTaula(int taula[][]) {

        Random rd = new Random();
        
        int numRam = 0, bombo = 0, contador = 0, contadorUsat = 0;
        int [] numUsat = new int [contadorUsat];
        boolean finRandom = false;
        
        for (int i = 0; i < taula.length; i++) {
            contador = 0;
            
            for (int j = 0; j < taula[i].length; j++) {
            //taula[i][j] = rd.nextInt(1,90);
                contadorUsat++;
                do {
                    numRam = rd.nextInt(1, 90);
                    for (int k = 0; k < numUsat.length; k++) {
                        if (numRam == numUsat[k]) {
                            finRandom = false;    
                        }}
                    if (finRandom) {
                        numRam = numUsat[contadorUsat];
                    } 
                } while (finRandom = false);
                taula[i][j] = numRam;
            }
            do {
                bombo = rd.nextInt(1, 9);
                if (taula[i][bombo] != 0) {
                    taula[i][bombo] = 0;
                    contador++;
                }
            }while (contador < 4);                
        }  
        
    }
    
    public static void mostrarTaula(int taula[][]) {
        
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                if (taula[i][j] < 10) {
                    System.out.print("  "+ taula[i][j]);
                }else{
                    System.out.print(" "+taula[i][j]);
                }}
            System.out.println("");
        }
    }
    
    public static int mostrarNumBombo(int taula[][]) {
        Random rd = new Random();
        
        int nouNum = 0, contadorBombo = 0;
        boolean esValid = false;
        int [] arrayBombo = new int [contadorBombo];
        
        do{
            nouNum = rd.nextInt(1, 90);
            for (int i = 0; i < arrayBombo.length; i++) {
                if (nouNum == arrayBombo[i]) {
                    esValid = false;
                }
        }
            if (esValid) {
                arrayBombo = nouNum;
            }
        }while(esValid = true);
        
        return nouNum;
    }
    
//    public static void verificarTirada(String nouNum) {
//        
//    }
//    
//    public static void validarBingo(String[] args) {
//        
//    }
//    
//    public static void validarLinia(String[] args) {
//        
//    }
    
    
    
}
