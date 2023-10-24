/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;


/**
 *
 * @author ayala
 */
public abstract class Arme {
    String nom ;
    int niveau ; 
    
public Arme (String unNom,int unNiveau) {
nom = unNom;
niveau = unNiveau ;
if (unNiveau > 100){
    niveau = 100;
}  
if (unNiveau <0){
    niveau =0 ;
}
}
   public String getNom() {
        return nom;
    }
    




@Override
    public String toString() {
String chaine;
chaine = "Le nom est " + nom +  " et le niveau est  " + niveau ;
return chaine ;
    }
}