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
public class CodiBarres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codiBarres;

        Scanner sc = new Scanner(System.in);

        codiBarres = sc.nextInt();

        String codiBarresString, codiBarresBo;
        int suma = 0;

        codiBarresString = String.valueOf(codiBarres);
        if (codiBarresString.length() != 8) {
            System.out.println("Codi Invalid");

        } else {
            codiBarresBo = codiBarresString.substring(0, codiBarresString.length() - 1);

            for (int i = codiBarresBo.length(); i > 0; i--) {
                if (i % 2 == 0) {
                    suma = suma + (Integer.parseInt(codiBarresBo.substring(i - 1, i)));
                } else {
                    suma = suma + (3 * Integer.parseInt(codiBarresBo.substring(i - 1, i)));
                }
            }

            int sumafinal = suma + Integer.parseInt(codiBarresString.substring(codiBarresString.length() - 1, codiBarresString.length()));

            if (sumafinal % 10 == 0) {
                System.out.println("Codi Correcte");
            } else {
                System.out.println("Codi Incorrecte");
            }
        }
    }

}
