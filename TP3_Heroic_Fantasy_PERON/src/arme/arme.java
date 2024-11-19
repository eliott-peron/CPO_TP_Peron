/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

/**
 *
 * @author eliot
 */
public abstract class arme {

    private String nom;
    private int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    // Getter pour le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Getter pour le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Redéfinition de toString pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Arme{" + "nom='" + nom + '\'' + ", niveau d'attaque=" + niveauAttaque + '}';

    }

}
