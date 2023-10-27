package lightoff_ayala_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import lightoff_ayala_version_console.CelluleLumineuse;
/**
 *
 * @author ayala
 */

public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes ;
    private int nbColonnes;
    
    /**
     *Crée une nouvelle grille de jeu avec un nombre de ligne et de colonne choisit en entr?e 
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeJeu (int p_nbLignes, int p_nbColonnes) {
    nbLignes = p_nbLignes;
    nbColonnes = p_nbColonnes;
   
    matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
    
    for (int i = 0; i< nbLignes; i++){
        for (int j = 0; j < nbColonnes; j++){
            matriceCellules[i][j] = new CelluleLumineuse();
        }
    }
    }
    
    /**
     *permet d'eteindre chaque cellule de la grille en parcourant la grille en lignes et en colonnes
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
}
        }
   }

    /**
     *Choisis al?atoirement l'une des trois m?thode priv? pour activer sois une ligne aleatoire, soit une colonne aleatoire ou une diagonale aleatoire
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);

        switch (choix) {
            case 0:
                activerLigneAleatoire();
                break;
            case 1:
                activerColonneAleatoire();
                break;
            case 2:
                activerDiagonaleAleatoire();
                break;
            default:
                System.out.println("Choix inattendu : " + choix);
                break;
        }
    }

    private void activerLigneAleatoire() {
        Random random = new Random();
        int ligne = random.nextInt(nbLignes);

        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[ligne][j].activerCellule();
        }
    }

    private void activerColonneAleatoire() {
        Random random = new Random();
        int colonne = random.nextInt(nbColonnes);

        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][colonne].activerCellule();
        }
    }

    private void activerDiagonaleAleatoire() {
        Random random = new Random();
        int direction = random.nextInt(2);

        if (direction == 0) {
            activerDiagonaleDescendante();
        } else {
            activerDiagonaleMontante();
        }
    }

    /**
     * Permet d'éteindre toute les cellules de la grille puis de melanger en utilisant la methode qui active une ligne une colonne ou une diagonale aleatoirement
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules(); // Éteindre toutes les cellules au départ
    Random random = new Random();

    for (int tour = 0; tour < nbTours; tour++) {
        int choix = random.nextInt(3); // 0 pour ligne, 1 pour colonne, 2 pour diagonale

        switch (choix) {
            case 0:
                activerLigneAleatoire();
                break;
            case 1:
                activerColonneAleatoire();
                break;
            case 2:
                activerDiagonaleAleatoire();
                break;
        }
    }

    }

    /**
     *Permet d'activer une ligne entiére de la grille, éteint tout les éléments de la ligne qui était allumé et allume les éléments qui étaient éteint
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     *Permet d'activer une colonne entière de la grille, éteint tout les éléments de la colonne qui étaient allumé et allume les éléments qui étaient éteint
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     *Permet d'activer la diagonale descendante de la grille, éteint tout les ?l?ments de la diagonale qui était allumé et allume les éléments qui étaient éteint
     */
    public void activerDiagonaleDescendante() {
        int minDim = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     *Permet d'activer la diagonale montante de la grille, éteint tout les éléments de la diagonale qui était allumé et allume les éléments qui étaient éteint
     */
    public void activerDiagonaleMontante() {
        int minDim = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    /**
     *Verifie si l'une des cellules est allumé en utilisant la méthode estEteint 
     * @return
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
               if (!matriceCellules[i][j].estEteint())
               return false;
                    
                }
            }
        return true;
        }

    /**
     * Permet d'afficher dans la console la grille finale en fonction du nombre de lignes et de colonnes choisis par l'utilisateur
     * @return
     */
    @Override
public String toString() {
    StringBuilder builder = new StringBuilder();

    // Afficher les indices de colonnes
    builder.append("   |");
    for (int j = 0; j < nbColonnes; j++) {
        builder.append(String.format("%2d |", j));
    }
    builder.append("\n");

    // Ligne de séparation
    builder.append("---|");
    for (int j = 0; j < nbColonnes; j++) {
        builder.append("---|");
    }
    builder.append("\n");

    // Afficher les cellules avec les indices de lignes
    for (int i = 0; i < nbLignes; i++) {
        builder.append(String.format("%2d |", i));
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].estEteint()) {
                builder.append(" O |");
            } else {
                builder.append(" X |");
            }
        }
        builder.append("\n");

        // Ligne de séparation
        builder.append("---|");
        for (int j = 0; j < nbColonnes; j++) {
            builder.append("---|");
        }
        builder.append("\n");
    }

    return builder.toString();
}
}
    
    
    

