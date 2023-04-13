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
public class Pentavocaliques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String paraula, lletra;
        ArrayList<String> paraules = new ArrayList<String>();
        int numCasosProva, a = 0, e = 0, i = 0, o = 0, u = 0;
        Scanner sc = new Scanner(System.in);

        numCasosProva = sc.nextInt();

        if (numCasosProva <= 50 && numCasosProva > 0) {
            for (int y = 0; y < numCasosProva; y++) {
                paraula = sc.next();
                paraules.add(paraula);
            }

            for (int y = 0; y < numCasosProva; y++) {
                if (paraules.get(y).contains("o") && paraules.get(y).contains("a") && paraules.get(y).contains("e") && paraules.get(y).contains("i") && paraules.get(y).contains("u")) {
                    a = 0;
                    e = 0;
                    i = 0;
                    o = 0;
                    u = 0;
                    for (int j = 0; j < paraules.get(y).length(); j++) {
                        lletra = paraules.get(y).substring(j, j + 1);

                        switch (lletra) {
                            case "a":
                                a++;
                                break;
                            case "e":
                                e++;
                                break;
                            case "i":
                                i++;
                                break;
                            case "o":
                                o++;
                                break;
                            case "u":
                                u++;
                                break;
                            default:
                        }
                    }
                    if (a == 1 && e == 1 && i == 1 && o == 1 && u == 1) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("Error");
        }
    }

}
