/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import arme.arme;
import arme.epee;
import arme.baton;
import java.util.ArrayList;
import tp3_heroic_fantasy_peron.EtreVivant;

public abstract class Personnage implements EtreVivant {

    private String nom;
    private int niveauVie;
    private ArrayList<arme> inventaire = new ArrayList<>();
    private arme armeEnMain = null;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void ajouterArme(arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
        } else {
            System.out.println("Inventaire plein !");
        }
    }

    public void equiperArme(String nomArme) {
        for (arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println("Arme " + nomArme + " équipée !");
                return;
            }
        }
        System.out.println("Arme non trouvée !");
    }

    public arme getArmeEnMain() {
        return armeEnMain;
    }

    public int compterArmesPreferees() {
        int count = 0;
        for (arme arme : inventaire) {
            if (this instanceof Magicien && arme instanceof baton) {
                count++;
            } else if (this instanceof Guerrier && arme instanceof epee) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Personnage: " + nom + ", Vie: " + niveauVie
                + (armeEnMain != null ? ", Arme équipée: " + armeEnMain : "");

    }

    @Override
    public void seFatiguer() {
        this.niveauVie -= 10;
        if (this.niveauVie < 0) {
            this.niveauVie = 0;
        }
    }

    @Override
    public boolean estVivant() {
        return this.niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points;
        if (this.niveauVie < 0) {
            this.niveauVie = 0;
        }

    }

    public void attaquer(Personnage cible) {
        if (this.getArmeEnMain() == null) {
            System.out.println(this.getNom() + " n'a pas d'arme équipée !");
            return;
        }

        int dommages = this.getArmeEnMain().getNiveauAttaque();
        if (this instanceof Magicien && armeEnMain instanceof baton) {
            dommages *= ((baton) armeEnMain).getAge();
            if (((Magicien) this).isEstConfirme()) {
                dommages /= 2;
            }
        } else if (this instanceof Guerrier && armeEnMain instanceof epee) {
            dommages *= ((epee) armeEnMain).getFinesse();
            if (((Guerrier) this).isACheval()) {
                dommages /= 2;
            }
        }

        cible.estAttaque(dommages);
        this.seFatiguer();

        System.out.println(this.getNom() + " attaque " + cible.getNom()
                + " avec " + dommages + " dégâts !");
    }

}
