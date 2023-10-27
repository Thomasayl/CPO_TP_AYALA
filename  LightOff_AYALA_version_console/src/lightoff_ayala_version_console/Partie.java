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

public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    /**
     * Permet à l'utilisateur de choisir le nombre de ligne et de colonne souhaité dans la grille et d'initialiser le nombre de coup à 0
     */
    public Partie() {
        grille = new GrilleDeJeu(4, 3); // Vous pouvez ajuster les dimensions de la grille ici
        nbCoups = 0;
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
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        initialiserPartie();
        boolean partieTerminee = false;

        System.out.println("Bienvenue dans le jeu LightOff ! Voici comment jouer :");
        System.out.println("- Pour activer une ligne, tapez 'ligne' suivi du numero de ligne (par exemple, 'ligne 1').");
        System.out.println("- Pour activer une colonne, tapez 'colonne' suivi du numero de colonne (par exemple, 'colonne 2').");
        System.out.println("- Pour activer une diagonale, tapez 'diagonale' suivi de 'descendante' ou 'montante' (par exemple, 'diagonale descendante').");

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
                System.out.println("Félicitations, vous avez gagné en " + nbCoups + " coups !");
            }
        }

        scanner.close();
    }

    /**
     * Permet de lancer la partie
     * @param args
     */
    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.lancerPartie();
    }
}

