/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

import arme.arme;

/**
 *
 * @author eliot
 */
public class baton extends arme {

    private int age;

    // Constructeur pour initialiser Baton avec niveau d'attaque et âge
    public baton(String nom,int niveauAttaque, int age) {
        super(nom, niveauAttaque);

        if (age >= 0 && age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge doit être entre 0 et 99.");
        }
    }

    // Getter pour age
    public int getAge() {
        return age;
    }

    // Redéfinition de toString pour inclure l'âge
    @Override
    public String toString() {
        return super.toString() + ", age=" + age + '}';
    }

}
