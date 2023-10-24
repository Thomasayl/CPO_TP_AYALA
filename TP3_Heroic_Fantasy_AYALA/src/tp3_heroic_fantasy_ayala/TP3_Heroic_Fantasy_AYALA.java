/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_ayala;
import Armes.*;
import Personnages.*;

import java.util.ArrayList;
/**
 *
 * @author ayala
 */
public class TP3_Heroic_Fantasy_AYALA {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
         Epee Epee1 = new Epee ("Excalibur",7,5) ;
         Epee Epee2 = new Epee ("Durandal",4,7) ;
         
         Baton Baton1 = new Baton ("Chêne",4,5) ;
         Baton Baton2 = new Baton ("Charme",5,6) ;
         
          ArrayList<Arme> liste = new ArrayList<Arme>();
          liste.add(Epee1);
          liste.add(Epee2);
          liste.add(Baton1);
          liste.add(Baton2);
               
    System.out.println("Taille de la liste d'armes : " +liste.size());
    for (Arme arme : liste){
        System.out.println (arme);
        
         Magicien Magicien1 = new Magicien ( "Gandalf", 65, "confirmé");
         Magicien Magicien2 = new Magicien ("Garcimore", 44, "novice");
         
         Guerrier Guerrier1 = new Guerrier ("Aragorn", 78, "à pied");
         Guerrier Guerrier2 = new Guerrier ("Soron", 45, "à cheval");
         
         ArrayList<Personnage> liste1 = new ArrayList<Personnage>();
          liste1.add(Magicien1);
          liste1.add(Magicien2);
          liste1.add(Guerrier1);
          liste1.add(Guerrier2);

     System.out.println("Taille de la liste d'armes : " +liste.size());
    for (Personnage personnage : liste1){
        System.out.println (personnage);   
    }
          
        Guerrier guerrier3 = new Guerrier("Legolas l'Elfe", 2, "à pied");
        Magicien magicien3 = new Magicien ("Saouman le blanc", 8, "novice");
        Baton baton3 = new Baton ("branche", 5 , 5);
        Baton baton4 = new Baton ("branche2", 5 , 5);
        Baton baton5 = new Baton ("branche3", 5 , 5);
        
        Epee épée3 = new Epee ("glaive", 5, 6);
        Epee épée4 = new Epee ("glaive2", 5, 6);
        Epee épée5 = new Epee ("glaive3", 5, 6);
        
        guerrier3.ajouter_arme(épée3);
        guerrier3.ajouter_arme(épée4);
        guerrier3.ajouter_arme(baton5);
        
        magicien3.ajouter_arme(baton3);
        magicien3.ajouter_arme(baton4);
        magicien3.ajouter_arme(épée5);

        guerrier3.équiper_arme("glaive");
        System.out.println(guerrier3);
        
        magicien3.équiper_arme("glaive2");
        System.out.println(magicien3);        
         
    }
    
 
    }
}