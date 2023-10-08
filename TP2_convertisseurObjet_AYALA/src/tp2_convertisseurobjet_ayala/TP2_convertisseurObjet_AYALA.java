/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_ayala;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class TP2_convertisseurObjet_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Convertisseur convertisseur = new Convertisseur();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de conversion:");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Fahrenheit vers Celsius");
            System.out.println("4. Celsius vers Fahrenheit");
            System.out.println("5. Kelvin vers Fahrenheit");
            System.out.println("6. Fahrenheit vers Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();

            if (choix == 7) {
                System.out.println("Au revoir !");
                break;
            }

            System.out.print("Entrez la température à convertir : ");
            double temperature = scanner.nextDouble();
            double resultat = 0;

            switch (choix) {
                case 1:
                    resultat = convertisseur.CelciusVersKelvin(temperature);
                    break;
                case 2:
                    resultat = convertisseur.KelvinVersCelcius(temperature);
                    break;
                case 3:
                    resultat = convertisseur.FarenheitVersCelcius (temperature);
                    break;
                case 4:
                    resultat = convertisseur.CelciusVersFarenheit(temperature);
                    break;
                case 5:
                    resultat = convertisseur.KelvinVersFarenheit(temperature);
                    break;
                case 6:
                    resultat = convertisseur.FarenheitVersKelvin(temperature);
                    break;           
            }
     System.out.println("le résultat est"+ resultat);
     break;
     
}
        }
    }

        
