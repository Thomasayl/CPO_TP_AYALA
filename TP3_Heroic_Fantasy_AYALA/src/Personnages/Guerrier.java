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
        @Override
public String toString() {
String chaine_a_retourner;
if (cheval == true){
chaine_a_retourner = ("Le Guerrier "+nom+ " a "+niveau+ "point de vie et est a cheval et utilise "+arme_en_main);
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le Guerrier "+nom+ " a "+niveau+ "point de vie et est a pieds et utilise "+arme_en_main);

   return chaine_a_retourner; 
}
}
}

