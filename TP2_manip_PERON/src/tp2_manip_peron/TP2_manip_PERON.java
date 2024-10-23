/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_peron;

/**
 *
 * @author eliot
 */
public class TP2_manip_PERON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        Tartiflette assiette4 = assiette2;
        Tartiflette assiette5 = assiette1;

        System.out.println("nb de calories de Assiette 2 : "
                + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "
                + assiette3.nbCalories);
        System.out.println("nb de calories de Assiette 4 : "
                + assiette4.nbCalories);
        System.out.println("nb de calories de Assiette 5 : "
                + assiette5.nbCalories);
        
        
    
        
        

    }

}
