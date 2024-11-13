/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_peron;

import arme.epee;
import arme.baton;
import arme.arme;
import java.util.ArrayList;

public class TP3_Heroic_Fantasy_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        epee excalibur = new epee("Excalibur", 7, 5);
        epee durandal = new epee("Durandal", 4, 7);

        // Création des bâtons avec les paramètres donnés
        baton chene = new baton("Chene", 4, 5);
        baton charme = new baton("Charme", 5, 6);

        // Création d'un tableau dynamique (ArrayList) pour stocker les armes
        ArrayList<arme> armes = new ArrayList<>();

        // Ajout des armes dans le tableau dynamique
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques des armes en parcourant le tableau
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));  // Appelle la méthode toString() de chaque arme
           
        }
         Guerrier guerrier = new Guerrier("Arthur", 100, true);
        Magicien magicien = new Magicien("Merlin", 80, false);

        System.out.println(guerrier);  // Affiche : Personnage{nom='Arthur', niveauVie=100}, aCheval=true
        System.out.println(magicien);  // Affiche : Personnage{nom='Merlin', niveauVie=80}, estConfirme=false

        // Modifier les propriétés avec les setters
        guerrier.setACheval(false);
        magicien.setEstConfirme(true);

        System.out.println(guerrier);  // Affiche : Personnage{nom='Arthur', niveauVie=100}, aCheval=false
        System.out.println(magicien);  // Affiche : Personnage{nom='Merlin', niveauVie=80}, estConfirme=true
    }
}
    
