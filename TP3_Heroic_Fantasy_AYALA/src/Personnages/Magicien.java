/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


/**
 *
 * @author ayala
 */
public class Magicien extends Personnage {
    private boolean confirme;

    public void setConfirmé(String confirmé) {
        if (confirmé == "confirme") {
            confirme = true ;
        }
        else {
            confirme = false;
        }
        
    }

    public Magicien(String unNom, int unNiveau, String confirmé) {
        super(unNom, unNiveau);
    }
}
