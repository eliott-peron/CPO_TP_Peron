/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_peron;

/**
 *
 * @author eliot
 */
public class TP2_Bieres_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0f, "Dubuisson");
        BouteilleBiere unesecondBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("1664", 5.5f, "Kronenbourg");
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Grimbergen", 8.5f, "Kronenbourg");
        BouteilleBiere unecinquiemeBiere = new BouteilleBiere("Goudale", 7.2f, "Saint-Omer");

        uneBiere.lireEtiquette();
        System.out.println();

        unesecondBiere.lireEtiquette();
        System.out.println();

        troisiemeBiere.lireEtiquette();
        System.out.println();

        quatriemeBiere.lireEtiquette();
        System.out.println();

        unecinquiemeBiere.lireEtiquette();

        System.out.println();
        

        BouteilleBiere unesisiemeBiere = new BouteilleBiere("paix dieu triple", 10.0f, "Caulier");
        unesisiemeBiere.Decapsuler();
        System.out.println(unesisiemeBiere);

    }

}
