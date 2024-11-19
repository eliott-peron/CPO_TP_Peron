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
        Guerrier guerrier = new Guerrier("Conan", 78, false);
        Guerrier guerrier1 = new Guerrier("Lannister", 45, true);
        Magicien magicien = new Magicien("Gandalf", 65, true);
        Magicien magicien1 = new Magicien("Garcimore", 44, false);

   

        Personnage[] personnages = {guerrier, guerrier1, magicien, magicien1};

        for (Personnage personnage : personnages) {
            System.out.println(personnage);

        }

    }
}