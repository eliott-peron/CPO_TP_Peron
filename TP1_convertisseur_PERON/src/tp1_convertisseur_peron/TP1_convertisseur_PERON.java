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
         tKelvin = tKelvin+273;
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
        
     

 
        double nombre;
        double kelvin;
        double metodevar;
        double metodeconv;
        
        System.out.println("saisir un nombre reel ");
        nombre=sc.nextInt();
        
        kelvin = nombre+273;
        
        System.out.println("la convertion de "+nombre+" C en kelvine est :"+kelvin+" K");
        
        
        System.out.println("");
        System.out.println("utilisation de la metode");
        System.out.println("saisire un nouveau nombre :");
        
        metodevar = sc.nextInt();
        metodeconv = CelciusVersKelvin (metodevar);
        System.out.println("cela fais"+metodeconv+" K");
        
        
    
    }
    
}
