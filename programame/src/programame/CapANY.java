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
public class CapANY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String horaEntrada="";
        int hores, minuts, horesRestants, minutsRestants, minutsTotals;
        Scanner sc = new Scanner(System.in);
        
        while (horaEntrada != "00:00") {            
            horaEntrada = sc.next();
        
        String[] horesArray = horaEntrada.split(":");
        
        hores = Integer.parseInt(horesArray[0]);
        minuts = Integer.parseInt(horesArray[1]);
        
        horesRestants = 23 - hores;
        minutsRestants = 60 -minuts;
        if (minutsRestants == 60) {
            minutsRestants = 0;
        }
        
        minutsTotals = (horesRestants * 60) + minutsRestants;
        if (hores == 0 && minuts == 0) {
            break;
        } else
        {
            System.out.println(minutsTotals);
        }
        }
        
        
    }
    
}
