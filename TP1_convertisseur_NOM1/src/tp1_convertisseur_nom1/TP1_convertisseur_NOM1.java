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
        double result = 0;
        Scanner sc = new Scanner(System.in);        
    System.out.println("\n Bonjour saisissez une valeur:");
    temp=sc.nextDouble();
    System.out.println("\n Saisissez la conversion que vous souhaiter effectuer: \n 1) Celcius Vers Kelvin \n 2) Kelvin Vers Celcius \n 3) Farenheit Vers Celcius \n 4) Celcius Vers Farenheit \n 5) Kelvin Vers Farenheitn \n 6) Farenheit Vers Kelvin");
        double operateur = sc.nextDouble();
        if (operateur == 1) {
             result= CelciusVersKelvin(temp) ;}
        if (operateur ==2){
              result= KelvinVersCelcius(temp) ;}
        if (operateur ==3){
                result= FarenheitVersCelcius(temp) ;}
        if (operateur ==4){
             result = CelciusVersFarenheit(temp);}
        if (operateur ==5) {
                result = KelvinVersFarenheit(temp);}
        if (operateur ==6) {
                result = FarenheitVersKelvin(temp);}
    
    System.out.println("\n Le resultat est:"+ result);
    
     
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
    
