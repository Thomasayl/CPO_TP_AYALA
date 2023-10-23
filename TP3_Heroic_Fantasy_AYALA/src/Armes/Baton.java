/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;


/**
 *
 * @author ayala
 */
public class Baton extends Arme {
    int age ;

    public Baton(String unNom, int unNiveau, int unage) {
        super(unNom, unNiveau);
         if (unage > 100);{
        age = 100;
}  
        if (unage<0);{
        age =0 ;
    }
    }
    
}
