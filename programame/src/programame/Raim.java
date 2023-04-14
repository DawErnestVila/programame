/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programame;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Raim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] Mates = new int[100];
        int[] RaimsNecesitats = new int[100];
        int[][] Mates = new int[100][100];

        Scanner sc = new Scanner(System.in);
        String primeraLinia = "";
        String segonaLinia = "";

        while (primeraLinia != "0 0") {
            primeraLinia = sc.nextLine();
            segonaLinia = sc.nextLine();

            String[] primeraLiniaSeparada = primeraLinia.split("\\s");
            int MatesActual = Integer.parseInt(primeraLiniaSeparada[0]);
            int RaimsDemanats = Integer.parseInt(primeraLiniaSeparada[1]);
            
            String[] segonaLiniaSeparada = primeraLinia.split("\\s");
            int[] ValorMates = new int[MatesActual];
            for (int i = 0; i < MatesActual; i++) {
                ValorMates[i] = Integer.parseInt(segonaLiniaSeparada[i]);
            }
            
             

        }

    }

}
