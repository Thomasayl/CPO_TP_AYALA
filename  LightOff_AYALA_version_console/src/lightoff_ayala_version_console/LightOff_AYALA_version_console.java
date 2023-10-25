/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_ayala_version_console;



/**
 *
 * @author ayala
 */
public class LightOff_AYALA_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testez chacune de vos m?thodes dans la fonction main() : cr?ez une ou deux cellules
        //lumineuses, affichez leur ?tat, changez ce dernier, raffichez l??tat pour v?rifier que ce
       //dernier a bien ?t? mis ? jour.
       CelluleLumineuse cellule1 = new CelluleLumineuse ();
       CelluleLumineuse cellule2 = new CelluleLumineuse ();
       cellule1.getEtat();
       cellule2.getEtat();
       
       
       cellule1.activerCellule();
       cellule2.activerCellule();
       cellule2.toString();
       cellule1.toString();
       
       cellule2.activerCellule();
       cellule2.toString();
       
       GrilleDeJeu maGrille = new GrilleDeJeu(7, 7);
       System.out.println(maGrille);
       
        maGrille.activerLigneDeCellules(2); 
        System.out.println(maGrille);
        maGrille.activerColonneDeCellules(3); 
        System.out.println(maGrille);
        maGrille.activerDiagonaleDescendante(); 
        System.out.println(maGrille);
        maGrille.activerDiagonaleMontante();
        System.out.println(maGrille);
        maGrille.activerLigneColonneOuDiagonaleAleatoire(); 
        System.out.println(maGrille);
        maGrille.melangerMatriceAleatoirement(5);
        
        // Affichez la grille apr?s les modifications
        System.out.println("Grille modifiee :");
        System.out.println(maGrille);
       
       
       
    }
    
}
