/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author ayala
 */
public class Guerrier extends Personnage {
   private boolean cheval;

    public void setConfirmé(String cheval1) {
        if (cheval1 == "à cheval") {
            cheval = true ;
        }
        else {
            cheval = false; 
        }
        
    }

    public Guerrier(String unNom, int unNiveau, String cheval) {
        super(unNom, unNiveau);
    }
}

