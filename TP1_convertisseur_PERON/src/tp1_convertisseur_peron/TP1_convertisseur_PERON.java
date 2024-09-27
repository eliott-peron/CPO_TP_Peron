/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_peron;

import java.util.Scanner;

/**
 *
 * @author eliot
 */
public class TP1_convertisseur_PERON {

         public static double CelciusVersKelvin (double tCelcius) {
         tCelcius = tCelcius+273;
         return tCelcius;
        }
         
         public static double KelvinVersCelcius (double tKelvin ) {
         tKelvin = tKelvin-273;
         return tKelvin;
        }
         
         public static double FarenheitVersCelcius (double Farenhei ) {
         Farenhei = (Farenhei-32)*0.55;
         return Farenhei;
        }
         
         public static double CelciusVersFarenheit (double celciuse ) {
         celciuse = (celciuse*0.55) + 32;
         return celciuse;
        }
         
         public static double KelvinVersFarenheit (double kelvin ) {
         double celsius = KelvinVersCelcius(kelvin);
         double fahrenheit = CelciusVersFarenheit(celsius);
         return fahrenheit;
        }
         
         public static double FarenheitVersKelvin (double  Farenheit) {
         double celsius = FarenheitVersCelcius(Farenheit);
         double Kelvin = CelciusVersFarenheit(celsius);
         return Kelvin;
        }
    
        
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
     

 
        
        double nbr;
        double choix;
        double CK;
        double KC;
        double FC;
        double CF;
        double KF;
        double FK;
        
        System.out.println("Bonjour, saisissez une valeur :");
        nbr = sc.nextInt();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius ");
        System.out.println("3) De Farenheit vers Celcius ");
        System.out.println("4) De Celcius vers Farenheit ");
        System.out.println("5) De Kelvin vers Farenheit ");
        System.out.println("6) De Farenheit vers Kelvin");
        
        
         choix = sc.nextInt();
         
         
        CK = CelciusVersKelvin (nbr);
        KC = KelvinVersCelcius(nbr) ;
        FC = FarenheitVersCelcius(nbr);
        CF = CelciusVersFarenheit(nbr);
        KF = KelvinVersFarenheit(nbr);
        FK = FarenheitVersKelvin(nbr);
         
         
         if (choix == 1){
             
            System.out.println(nbr+" degre Celcius est egal a "+CK+" deges Kelvin");
             
         }
         if (choix == 2){
             
            System.out.println(nbr+" degre Kelvin est egal a "+KC+" deges Celcius");
             
         }
         
         if (choix == 3){
             
            System.out.println(nbr+" degre Farenheit est egal a "+FC+" deges Celcius");
             
         }
         
         if (choix == 4){
             
             System.out.println(nbr+" degre Celcius est egal a "+CF+" deges Farenheit");             
         }
         
          if (choix == 5){
             
             System.out.println(nbr+" degre Kelvin est egal a "+KF+" deges Farenheit");             
         }
          
           if (choix == 6){
             
              System.out.println(nbr+" degre Farenheit est egal a "+FK+" deges Kelvin");             
         }
           else{
                System.out.println(nbr+"erreur"); 
           }
         
   
        
        
    
    }
    
}
