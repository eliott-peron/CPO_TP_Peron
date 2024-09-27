/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_peron;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eliot
 */
public class TP1_stats_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int m;

        int[] tab = new int[6];
        
        tab[0] = 0;
        tab[1] = 0;
        tab[2] = 0;
        tab[3] = 0;
        tab[4] = 0;
        tab[5] = 0;
        
        
        System.out.println("veuiller saisir un nombre");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
             int alea = generateurAleat.nextInt(6);
             tab[alea]= tab[alea]+1;

        }
        
        for (int j = 0; j < 6; j++) {
            
                        System.out.println("Face " + (j + 1) + ": " + tab[j] + " fois");

            
        }
        

    }

}
