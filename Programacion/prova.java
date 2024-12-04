/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carretero_iker_projecte;

import java.util.Scanner;

/**
 *
 * @author iker-carretero
 */
public class prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int filas, columnas;
        int tiradaX, tiradaO;
        char x = 'X', o = 'O';
        boolean guanyadorX = false, guanyadorO = true, empat = true;
        int guanyarX, jugador = 0;
        boolean columnaValida = true;
        int guanyadesX = 0, guanyadesO = 0, guanyadesEmpat = 0;
        int contadorX = 0;        
        
        //Joc complet
        //do{
        
        System.out.println("Introdeuix quantes files i quantes columnes vols(n x m): ");
        
        //While per comprovar que es un numero
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Introdueix una altre vegada");

        }
        filas = sc.nextInt();
        
        //While per comprovar que es un numero
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Introdueix una altre vegada");

        }
        columnas = sc.nextInt();
        
        char[][] taulell = new char[filas][columnas];//Array del taulell
        String [] jugadors = new String[5];//Array de tots els jugadors
        
        //Introdueix el nom dels jugadors
        System.out.println("Indica el nom del jugador que sera la X ");
        
        jugadors[jugador] = sc.nextLine();
        sc.nextLine();
        
        jugador++;
        
        System.out.println("Indica el nom del jugador que sera la O: ");
        jugadors[jugador] = sc.nextLine();
        
        while(!sc.hasNextInt()){
            sc.nextInt();
            System.out.println("Introdueix una altre vegada");

        }
        
        //Taula començament
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[i].length; j++) {
                taulell[i][j] = ' ';
            }
        }

        System.out.print("   ");
        for (int i = 1; i <= columnas; i++) {
            System.out.print("----");
        }

        System.out.print("-");
        System.out.println();

        for (int i = filas; i >= 1; i--) {

            System.out.print(i + "  ");

            for (int j = 1; j <= columnas + 1; j++) {
                System.out.print("|   ");
            }

            System.out.println();
            System.out.print("   ");

            for (int j = 1; j <= columnas; j++) {
                System.out.print("----");
            }

            System.out.print("-");
            System.out.println();
        }

        System.out.print("  ");

        for (int j = 1; j <= columnas; j++) {
            System.out.print("   " + j + "");
        }

        
        //Principi del joc
        do {
            //Entrada de la X
            do {
                System.out.println("\n\nPlayer 'X', enter your move (column[1-" + columnas + "]):");
                tiradaX = sc.nextInt();
                tiradaX = tiradaX - 1;
                guanyarX = 0;
                
                for (int i = 0; i < taulell.length; i++){                 
                        if (taulell[i][tiradaX] == ' '){
                        columnaValida = true;
                        break;
                        
                        }if(taulell[i][tiradaX] != ' '){
                            columnaValida = false;
                    }
                }
                
                if(columnaValida == false){
                    System.out.println("La columna " + (tiradaX + 1) + " esta plena");
                }
                
                for(int i = 0;i < taulell.length; i++){
                    if (taulell[i][tiradaX] == x){
                            contadorX++;
                            if(contadorX == 4 ){
                                guanyadorX = true;
                                break;
                            }
                    }else{
                        contadorX = 0;
                    }
                }
                
                if(guanyadorX){
                    System.out.println("Esta tot be!!");
                }
                
            }while (tiradaX < 0 | tiradaX > columnas | columnaValida == false);
            
            //Introduir X en l'array
            for (int i = 0; i < taulell.length; i++) {

                if (taulell[i][tiradaX] == ' ') {
                    taulell[i][tiradaX] = x;
                    break;
                }
            }
            
            //Taula de la X
            System.out.print("   ");
            for (int i = 1; i <= columnas; i++) {
                System.out.print("----");
            }

            System.out.print("-");
            System.out.println();

            for (int i = filas - 1; i >= 0; i--) {

                System.out.print((i +1) + "  ");

                for (int j = 0; j < columnas +1; j++) {
                    if(j < columnas){
                        System.out.print("| "+ taulell[i][j] +" ");//Ficar la X
                    }else{
                        System.out.print("|  ");
                    }
                }

                System.out.println();
                System.out.print("   ");

                for (int j = 1; j <= columnas; j++) {
                    System.out.print("----");
                }

                System.out.print("-");
                System.out.println();
            }

            System.out.print("  ");

            for (int j = 1; j <= columnas; j++) {
                
                System.out.print("   "+ j +"");
            }
            
            //Comprovar si ha guanyat la X
            /*for (int i = taulell.length; i >= 0;){
                guanyarX = 0;
                for (int j = 0; j < columnas; j++) {
                    if(taulell[i][j] == 'x'){
                        guanyarX++;
                    }
                }
            }*/
            
            //Entrada de O
            do {
                System.out.println("\n\nPlayer 'O', enter your move (column[1-" + columnas + "]):");
                tiradaO = sc.nextInt();
                tiradaO = tiradaO - 1;
                columnaValida = false;
                
                for (int i = 0; i < taulell.length; i++){                 
                        if (taulell[i][tiradaO] == ' '){
                        columnaValida = true;
                        break;
                        
                        }else{
                            columnaValida = false;
                    }
                }
                
                if(!columnaValida){
                    System.out.println("La columna " + (tiradaO + 1) + " esta plena");
                }
                
            } while (tiradaO < 0 | tiradaO > columnas | columnaValida == false);
            
            //Itroduir la O en l'array
            for (int i = 0; i < taulell.length; i++) {
                
                if (taulell[i][tiradaO] == ' ') {
                    taulell[i][tiradaO] = o;
                    break;
                }
            }
            
            //
            //Taula de la O
            //
            System.out.print("   ");
            for (int i = 1; i <= columnas; i++) {
                System.out.print("----");
            }

            System.out.print("-");
            System.out.println();

            for (int i = filas - 1; i >= 0; i--) {

                System.out.print((i + 1) + "  ");

                for (int j = 0; j < columnas + 1; j++) {
                    if (j < columnas) {
                        System.out.print("| " + taulell[i][j] + " ");//Ficar la O
                    } else {
                        System.out.print("|  ");
                    }
                }

                System.out.println();
                System.out.print("   ");

                for (int j = 1; j <= columnas; j++) {
                    System.out.print("----");
                }

                System.out.print("-");
                System.out.println();
            }

            System.out.print("  ");

            for (int j = 1; j <= columnas; j++) {

                System.out.print("   " + j + "");
            }
            
            //Comprovar empat
            /*for (int i = 0; i < taulell.length; i++){
                for (int j = 0; j < columnas; j++) {
                    if (taulell == o)
                }
            }*/

        } while (guanyadorX = false | guanyadorO | empat);

        if (guanyadorX) {
            System.out.println("'X' won! Bye!");
            guanyadesX++;
        } else if(guanyadorO){
            System.out.println("'O' won! Bye!");
            guanyadesO++;
        }else{
            guanyadesEmpat++;
        }
        
        
        
        System.out.println("Classificacio dels jugadors:");
        System.out.println("\n----------------------");
        System.out.print("Oriol: ");
        for(int i = 0; i < guanyadesX; i++){
            System.out.print("|");
        }
        
        System.out.println("\n----------------------");
        System.out.print("Iker: ");
        for(int i = 0; i < guanyadesO; i++){
            System.out.print("|");
            
        }
        System.out.println("\n----------------------");
        System.out.print("Empat: ");
        for(int i = 0; i < guanyadesEmpat; i++){
            System.out.print("|");
        }
        jugador++;
        //}while();
    }

}
