// AYALA THOMAS
//TDA
// 26/09/2023/*


package tp1_convertisseur_nom1;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class TP1_convertisseur_NOM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp; 
        Scanner sc = new Scanner(System.in);        
    System.out.println("\n Entrer un nombre entier :");
    temp=sc.nextDouble();
    System.out.println("\n "+ (temp +273.15));
     
    }
    public static double CelciusVersKelvin (double tCelcius) {
    double tkelvin = tCelcius + 273.15;
    return tkelvin ;
}
    
    public static double KelvinVersCelcius (double tKelvin) {
    double tCelcius = tKelvin - 273.15 ;
    return tCelcius;
   
}
    public static double FarenheitVersCelcius (double tFarenheit) {
    double tCelcius = (tFarenheit-32)/1.8 ;
    return tCelcius;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
    double tFarenheit = (tCelcius*1.8) +32 ;
    return tFarenheit;
    }
    
    public static double KelvinVersFarenheit (double tKelvin) {
    double tFarenheit = ((tKelvin-273.15)*1.8) +32 ;
    return tFarenheit;
    }
    
    public static double FarenheitVersKelvin (double tFarenheit) {
    double tKelvin = ((tFarenheit-32)/1.8) +273.15 ;
    return tKelvin;
    }
    }
    
