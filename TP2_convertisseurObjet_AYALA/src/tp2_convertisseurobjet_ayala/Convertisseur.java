/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_ayala;

/**
 *
 * @author ayala
 */
public class Convertisseur {
    int nbConversions = 0 ;

    public double CelciusVersKelvin (double tCelcius) {
    double tkelvin = tCelcius + 273.15;
    return tkelvin ;
}
    
    public double KelvinVersCelcius (double tKelvin) {
    double tCelcius = tKelvin - 273.15 ;
    return tCelcius;
   
}
    public double FarenheitVersCelcius (double tFarenheit) {
    double tCelcius = (tFarenheit-32)/1.8 ;
    return tCelcius;
    }
    
    public double CelciusVersFarenheit (double tCelcius) {
    double tFarenheit = (tCelcius*1.8) +32 ;
    return tFarenheit;
    }
    
    public double KelvinVersFarenheit (double tKelvin) {
    double tFarenheit = ((tKelvin-273.15)*1.8) +32 ;
    return tFarenheit;
    }
    
    public double FarenheitVersKelvin (double tFarenheit) {
    double tKelvin = ((tFarenheit-32)/1.8) +273.15 ;
    return tKelvin;
    }
    
    @Override 
    public String toString () {
       return "nb de conversions"+ nbConversions;  
}
    public void effectuerConversion() {
        nbConversions++;
    }
    }

        

