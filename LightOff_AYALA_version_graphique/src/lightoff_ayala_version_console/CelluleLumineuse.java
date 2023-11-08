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
    private boolean etat ;

    /**
     * Met chaque nouvelle cellule en mode ?teinte
     * @param etat = false
     */
    public CelluleLumineuse() {
        etat = false;
    }
        
    /**
     * Inverse l'etat de la cellule, si elle ?tait allum?, la m?thode l'?teint et inversement
     * 
     */
    public void activerCellule (){
        if (etat == false) {
            etat= true ;
        }
        else {
            etat= false;
        }
    }

    /**
     * Permet d'eteindre la cellule si elle est allum?, si elle est deja ?t?inte la m?thode ne change rien
     * 
     */
    public void eteindreCellule(){
        if (etat == true){
        etat = false ;
        }
    }
        
    /**
     * Permet de savoir si la cellule est bien ?t?inte, renvoie true si elle est ?teinte, false si elle est allum?e 
     * @return
     */
    public boolean estEteint(){ 
        if (etat == false) {
           return true ;
        }
        else {
            return false;
        }
    }
    
    /**
     * Permet de renvoyer l'?tat actuel de la cellule, true si elle est allum?e et false si elle est ?tainte 
     */
    public void getEtat(){
         if (etat == false) {
            etat= false ;
        }
        if (etat== true) {
            etat= true;
        }
    }

    /**
     * Affiche X si la cellule est allum?e et O si la cellule est ?teinte 
     * @return
     */
    @Override
    public String toString() {
       if (etat == true){
        System.out.println("X");
}
    else {
        System.out.println("O");
       
    }
        return null;
    
    
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
   

    

