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
    boolean ouverte;
    boolean decapsuler;

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie + decapsuler ) ;

}
public BouteilleBiere(String unNom, float unDegre, String
uneBrasserie) {
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;

}
public void Decapsuler(){
    if (ouverte ==false) {
     decapsuler= ouverte;
     decapsuler= true;
     System.out.println("La biere a ete decapsulee");
} else{
     System.out.println("La biere est deja decapsulee");
     decapsuler = false;
}
}
    @Override
    public String toString() {
String chaine;
chaine = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine += "oui" ;
else chaine += "non" ;
return chaine ;
}
}
