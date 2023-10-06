/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_ayala;

/**
 *
 * @author ayala
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    private boolean ouverte;
    boolean decapsuler; 
    
public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie ) ;
}
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
nom = unNom;
degreAlcool = (float) unDegre;
brasserie = uneBrasserie;
ouverte = true;
}

    public void Decapsuler() {
        if (ouverte == false) {
          decapsuler= ouverte ;
          decapsuler = true;
        } 
        else {
            System.out.println("Erreur : la bière est déjà décapsuler.");
            decapsuler= false;
        }
    }
}

