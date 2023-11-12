/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_ayala_version_console;

/**
 * Repr?sente une cellule lumineuse allum?e ou ?teinte 
 * @author ayala
 */
public class CelluleLumineuse {
    private int etat ;

    /**
     * Met chaque nouvelle cellule en mode ?teinte
     * @param etat = false
     */
    public CelluleLumineuse() {
        this.etat = 1;
        
    }
        
    /**
     * Inverse l'etat de la cellule, si elle ?tait allum?, la m?thode l'?teint et inversement
     * 
     */
    public void activerCellule (int diff){
        if (diff==1) {
            if (etat == 1) {
                etat=2;
            } else if (etat==2) {
                etat=3;
            } else {
                etat=1;
            }
    } else {
            if (etat == 1) {
                etat=2;
            } else {
                etat=1;
            }
    }
    }

    /**
     * Permet d'eteindre la cellule si elle est allum?, si elle est deja ?t?inte la m?thode ne change rien
     * 
     */
    public void eteindreCellule(){
        if (etat == 2 || etat==3 ){
        etat = 1 ;
        etat=1;
    }
    }  
    /**
     * Permet de savoir si la cellule est bien ?t?inte, renvoie true si elle est ?teinte, false si elle est allum?e 
     * @return
     */
   public boolean estEteint(){ 
        if (etat==1) {
            return true;
        } else {
            return false;
        }
   }
    
    /**
     * Permet de savoir si la cellule est allumée
     * @return
     */
    public boolean estAllume(){
        if (etat == 2){
            return true;
        }
       return false;
    }
    
   public boolean estAutre(){
        if (etat == 3){
            return true;
        }
       return false;
    }
    /**
     * Permet de renvoyer l'?tat actuel de la cellule, true si elle est allum?e et false si elle est ?tainte
     * @return 
     */
       public int getEtat() {
        return etat;
    }
    /**
     * Affiche X si la cellule est allum?e et O si la cellule est ?teinte 
     * @return
     */
    @Override
    public String toString() {
       if (etat == 1){
        System.out.println("X");
}
       if (etat == 2) {
        System.out.println("O");
       
    }
        if (etat == 3) {
        System.out.println("N");
    
    }
        return null;
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
        
   

    

