/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programame;

import java.util.Scanner;

/**
 *
 * @author ernest
 */
public class Programame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaOriginal = "", cadenaGirada = "";
        Scanner sc = new Scanner(System.in);

        cadenaOriginal = sc.next();

        for (int i = cadenaOriginal.length(); i > 0; i = i - 2) {
            cadenaGirada = cadenaGirada + cadenaOriginal.substring(i - 2, i);
        }

        System.out.println(cadenaGirada);
    }

}
