/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_peron;

/**
 *
 * @author eliot
 */
public class convertisseur {

    int nbConversions;

    public convertisseur() {
        nbConversions = 0;
    }

    public double CelciusVersKelvin(double tCelcius) {
        tCelcius = tCelcius + 273;
        nbConversions = nbConversions + 1;

        return tCelcius;

    }

    public double KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273;
        nbConversions = nbConversions + 1;
        return tKelvin;

    }

    public double FarenheitVersCelcius(double Farenhei) {
        Farenhei = (Farenhei - 32) * 1.8;
        nbConversions = nbConversions + 1;
        return Farenhei;
    }

    public double CelciusVersFarenheit(double celciuse) {
        celciuse = (celciuse * 1.8) + 32;
        nbConversions = nbConversions + 1;
        return celciuse;
    }

    public double KelvinVersFarenheit(double kelvin) {
        double celsius = KelvinVersCelcius(kelvin);
        double fahrenheit = CelciusVersFarenheit(celsius);
        nbConversions = nbConversions - 1;
        return fahrenheit;
    }

    public double FarenheitVersKelvin(double Farenheit) {
        double celsius = FarenheitVersCelcius(Farenheit);
        double Kelvin = CelciusVersKelvin(celsius);
        nbConversions = nbConversions - 1;
        return Kelvin;
    }

    @Override
    public String toString() {
        return "nb de conversions " + nbConversions;
    }

}
