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
public class epee extends arme {

    private int finesse;
    

    // Constructeur pour initialiser epee avec niveau d'attaque et finesse
    public epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);

        if (finesse >= 0 && finesse < 100) {
           this.finesse = finesse;
        } else {
            throw new IllegalArgumentException("L'indice de finesse doit être entre 0 et 99.");
        }
    }

    // Getter pour finesse
    public int getFinesse() {
        return finesse;
    } 

    // Redéfinition de toString pour inclure le niveau de finesse
    @Override
    public String toString() {
        return super.toString() + ", finesse=" + finesse + '}';
    }

}
