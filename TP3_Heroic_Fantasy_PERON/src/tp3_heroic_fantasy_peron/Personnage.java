/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_peron;

/**
 *
 * @author eliot
 */
public class Personnage {

    private String nom;
    private int niveauVie;

    // Constructeur pour initialiser le nom et le niveau de vie
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // Getter pour le niveau de vie
    public int getNiveauVie() {
        return niveauVie;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Redéfinition de toString pour afficher le nom et le niveau de vie
    @Override
    public String toString() {
        return "Personnage{" + "nom='" + nom + '\'' + ", niveauVie=" + niveauVie + '}';
    }
}
