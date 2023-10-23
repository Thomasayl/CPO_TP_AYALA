/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author ayala
 */
public abstract class Personnage {
    String nom ;
    int niveau ; 
    
public Personnage (String unNom,int unNiveau) {
nom = unNom;
niveau = unNiveau ;
    
}

@Override
    public String toString() {
String chaine;
chaine = "Le nom est " + nom +  " et le niveau est  " + niveau ;
return chaine ;
}
}