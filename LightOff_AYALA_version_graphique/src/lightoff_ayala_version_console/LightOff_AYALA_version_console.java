/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_ayala_version_console;

import java.util.Scanner;


/**
 *
 * @author ayala
 */
public class LightOff_AYALA_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choisissez la difficult� (facile, moyen, difficile) : ");
        String difficulty = scanner.nextLine();

        // Cr�ez une instance de Partie en passant la difficult� choisie
        Partie partie = new Partie(difficulty);
        
        // Test de la m�thode initialiserPartie
        // partie.initialiserPartie();
        
        // Test de la m�thode lancerPartie (jouer une partie compl�te)
        partie.lancerPartie();
    }
}
       
       

