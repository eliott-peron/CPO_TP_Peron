/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

public abstract class arme {
    private String nom;
    private int niveauAttaque;

    public arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = Math.min(niveauAttaque, 100);
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}
