/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_ayala_version_console;

/**
 *
 * @author ayala
 */
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;
    private Timer chronometre;
    private int tempsEcoule;
    
    /**
     * Permet à l'utilisateur de choisir le nombre de ligne et de colonne souhaité dans la grille avec trois niveaux de difficulté.
     * @param dif
     * @return
     */
    public GrilleDeJeu difficulte(String dif) {
    GrilleDeJeu grille = null;
    if (dif.equals("facile")) {
        grille = new GrilleDeJeu(3, 3,2);
    } else if (dif.equals("moyen")) {
        grille = new GrilleDeJeu(5, 5,2);
    } else if (dif.equals("difficile")) {
        grille = new GrilleDeJeu(7, 7,1);
    }
    return grille;
}
    /**
     * Permet de créer la grille en fonction de la méthode ci-dessus et d'initialisé le nombre de coups joué par l'utilisateur
     * Elle contient également le code correspondant au chronomètre
     */
    public Partie(String dif) {
    grille = difficulte(dif); // Utilisez la méthode difficulte pour obtenir la grille avec les dimensions appropriées
    nbCoups = 0;
    tempsEcoule = 0;
    int delai = 1000; // 1000 millisecondes (1 seconde)
    chronometre = new Timer(delai, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tempsEcoule++;
          
        }
    });
    
}
    /**
     * Utilise la methode melangerMatriceAleatoirement pour mélanger la grille de depart autant de fois que l'utilisateur le souhaite
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(50); // Vous pouvez ajuster le nombre de tours de mélange
    }

    /**
     * Definit l'ensemble de la partie dans ma console, elle affiche les messages de debut de partie, les consignes, les coups possibles, et 
     * guide l'utilisateur dans sa partie. 
     * ELle permet egalement de définir le nombre maximum de coup avant que le jeu s'arrete, on y démarre et y arrête le chronomètre
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        initialiserPartie();
        boolean partieTerminee = false;

        System.out.println("Bienvenue dans le jeu LightOff ! Voici comment jouer :");
        System.out.println("- Pour activer une ligne, tapez 'ligne' suivi du numero de ligne (par exemple, 'ligne 1').");
        System.out.println("- Pour activer une colonne, tapez 'colonne' suivi du numero de colonne (par exemple, 'colonne 2').");
        System.out.println("- Pour activer une diagonale, tapez 'diagonale' suivi de 'descendante' ou 'montante' (par exemple, 'diagonale descendante').");
        System.out.println("-Attention si vous dépassez 20 coups vous perdrez ");
        
        System.out.println("Choisissez la difficulté ");
        chronometre.start();
        
        
        while (!partieTerminee) {
            System.out.println("Nombre de coups joues : " + nbCoups);
            System.out.println(grille);

            System.out.print("Entrez un coup /n: ");
            String coup = scanner.nextLine().toLowerCase();

            switch (coup) {
                case "ligne":
                    System.out.print("Entrez le numéro de la ligne à activer : ");
                    int numeroLigne = Integer.parseInt(scanner.nextLine());
                    grille.activerLigneDeCellules(numeroLigne);
                    break;
                case "colonne":
                    System.out.print("Entrez le numéro de la colonne à activer : ");
                    int numeroColonne = Integer.parseInt(scanner.nextLine());
                    grille.activerColonneDeCellules(numeroColonne);
                    break;
                case "diagonale":
                    System.out.println("Entrez 'descendante' pour la diagonale descendante ou 'montante' pour la diagonale montante : ");
                    String directionDiagonale = scanner.nextLine().toLowerCase();
                    if (directionDiagonale.equals("descendante")) {
                        grille.activerDiagonaleDescendante();
                    } else if (directionDiagonale.equals("montante")) {
                        grille.activerDiagonaleMontante();
                    } else {
                        System.out.println("Direction de la diagonale invalide.");
                    }
                    break;
                default:
                    System.out.println("Coup invalide. Utilisez 'ligne', 'colonne' ou 'diagonale'.");
            }

            nbCoups++;

            if (grille.cellulesToutesEteintes()) {
                partieTerminee = true;
                chronometre.stop();
                System.out.println("Félicitations, vous avez gagné en " + nbCoups + " coups !");
                System.out.println("Vous avez mis" + tempsEcoule);
                
              }
            if (nbCoups ==10){
                partieTerminee = true;
                chronometre.stop();
                System.out.println("Dommage, vous avez perdu en " + nbCoups + " coups !"); 
                System.out.println("Vous avez mis " + tempsEcoule + " secondes");
                
            }
        }

        scanner.close();
    }
  
}

