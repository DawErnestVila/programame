/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ernest
 */
public class DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lletres = new String[23];
        lletres[0] = "T";
        lletres[1] = "R";
        lletres[2] = "W";
        lletres[3] = "A";
        lletres[4] = "G";
        lletres[5] = "M";
        lletres[6] = "I";
        lletres[7] = "F";
        lletres[8] = "P";
        lletres[9] = "D";
        lletres[10] = "X";
        lletres[11] = "B";
        lletres[12] = "N";
        lletres[13] = "J";
        lletres[14] = "Z";
        lletres[15] = "S";
        lletres[16] = "Q";
        lletres[17] = "V";
        lletres[18] = "H";
        lletres[19] = "L";
        lletres[20] = "C";
        lletres[21] = "K";
        lletres[22] = "E";

        Scanner llegir = new Scanner(System.in);
        int numCasosProva;

        numCasosProva = llegir.nextInt();
        ArrayList<String> DNIS = new ArrayList<String>();
        String dni = "";

        for (int y = 0; y < numCasosProva; y++) {
            dni = llegir.next();
            DNIS.add(dni);
        }

        for (int i = 0; i < numCasosProva; i++) {

            int contadorIntegorrants = 0;

            for (int j = 0; j < DNIS.get(i).length(); j++) {
                if (DNIS.get(i).substring(j, j + 1) == "?") {
                    contadorIntegorrants++;
                }

            }
            if (contadorIntegorrants == 4) {
                for (int j = 0; j < contadorIntegorrants; j++) {
                    for (int y = 0; y < 10; y++) {
                        String dnic = DNIS.get(i);
                        
                        
                        
                        for (int k = 0; k < 10; k++) {
                            for (int l = 0; l < 10; l++) {
                                for (int m = 0; m < 10; m++) {
                                    
                                }
                            }
                        }
                    }
                }

            } else if (contadorIntegorrants == 3) {
                for (int j = 0; j < contadorIntegorrants; j++) {
                    for (int y = 0; y < 10; y++) {

                        int numeroDNI = DNIS.get(y);
                        String lletraAconseguida = 
                
                        if (numeroDNI % 23 = lletres[i]) {

                        }
                        introduit == lletres[i];
                    }
                }
            } else if (contadorIntegorrants == 2) {
                for (int j = 0; j < contadorIntegorrants; j++) {
                    for (int y = 0; y < 10; y++) {

                        int numeroDNI = DNIS.get(y);
                        String lletraAconseguida = 
                
                        if (numeroDNI % 23 = lletres[i]) {

                        }
                        introduit == lletres[i];
                    }
                }
            } else if (contadorIntegorrants == 1) {
                for (int j = 0; j < contadorIntegorrants; j++) {
                    for (int y = 0; y < 10; y++) {

                        int numeroDNI = DNIS.get(y);
                        String lletraAconseguida = 
                
                        if (numeroDNI % 23 = lletres[i]) {

                        }
                        introduit == lletres[i];
                    }
                }
            }

        }

    }

}
