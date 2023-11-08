package lightoff_ayala_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ayala
 */
public class CelluleGraphique extends JButton {

    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee;
// constructeur (appelé depuis FenetrePrincipale)

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur,
            int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }
// Methode gérant le dessin de la cellule

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (celluleLumineuseAssociee.estEteint()) {
            g.setColor(Color.red);
        }
        else {
            g.setColor(Color.yellow);
        }   
      g.fillOval(0,0,largeur,hauteur);  
    
    }
//this.setText(celluleLumineuseAssociee.toString()+"e");
}

