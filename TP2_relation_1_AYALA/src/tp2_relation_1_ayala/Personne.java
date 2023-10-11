/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_ayala;

/**
 *
 * @author ayala
 */
public class Personne {
String nom ;
String prenom; 
int nbVoitures ;
Voiture [] liste_voitures ;
    
public Personne(String unnom , String unprenom){
nom = unnom ;
prenom = unprenom ;
liste_voitures = new Voiture [3] ;
nbVoitures = 0 ;

}
@Override
    public String toString() {
String chaine;
chaine = nom + " " + prenom ;
return chaine ;
}

public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
if (voiture_a_ajouter.Proprietaire != null) {
            System.out.println("Cette voiture a déjà un propriétaire.");
            return false;
        }

        if (nbVoitures >= 3) {
            System.out.println("La personne possède déjà 3 voitures. Impossible d'en ajouter plus.");
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;

        voiture_a_ajouter.Proprietaire = this;

        System.out.println(voiture_a_ajouter.Marque + " " + voiture_a_ajouter.Modele + " a été ajoutée à la liste de " + nom + " " + prenom + ".");

        return true;
    }

}

