/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carretero_iker_t1_pe2;

import java.util.Scanner;

/**
 *
 * @author iker-carretero
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int suma = 0, contador=0;
        String pokemon;
        int[] num = new int[30];

        System.out.println("De quin Pokemon vols la probabilitat de captura? ");
        pokemon = sc.nextLine().toLowerCase();
        
        int primerCaracter = (pokemon.charAt(0)-'a' +1)*2;
        int mitjana = 0;

        for (int i = 1; i < pokemon.length(); i++) {
            mitjana = pokemon.lastIndexOf(i);
            suma = suma + mitjana;
            contador++;
        }
        
        mitjana = suma / contador;
        
        System.out.println(primerCaracter+ mitjana+"%");

    }
    
}
