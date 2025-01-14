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
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N;
        
        System.out.println("Quantes vegades vols que es repeteixi? ");
        N = sc.nextInt();
        
        executable(N);
    }
    
    public static void executable(int N) {
        for (int i = 0; i < N; i++){
            System.out.println("Mòdul executant-se");

        }
    }
}
