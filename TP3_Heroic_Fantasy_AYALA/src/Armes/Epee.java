/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;



/**
 *
 * @author ayala
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee(String unNom, int unNiveau, int unefinesse) {
        super(unNom, unNiveau);
        if (unefinesse > 100);{
        finesse = 100;
}  
        if (unefinesse<0);{
        finesse =0 ;
    }
    
    }
}