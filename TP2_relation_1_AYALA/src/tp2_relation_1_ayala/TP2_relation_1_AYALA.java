/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_ayala;

/**
 *
 * @author ayala
 */
public class TP2_relation_1_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
    Voiture une3008 = new Voiture ("3008", "Peugeot", 8) ;
    Personne bob = new Personne("Bobby", "Sixkiller");
    Personne reno = new Personne("Reno", "Raines");

   
System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

bob.liste_voitures[0] = uneClio ;
bob.liste_voitures[1] = uneAutreClio ;
reno.liste_voitures[0] = une2008 ;
reno.liste_voitures[1] = uneMicra;
reno.liste_voitures[1] = une3008 ;

bob.nbVoitures = 1 ;
uneClio.Proprietaire = bob ;

System.out.println("la premiere voiture de Bob est " +
bob.liste_voitures[0] ) ;

System.out.println("la seconde voiture de Bob est " +
bob.liste_voitures[1] ) ;

System.out.println("la premiere voiture de reno est " +
reno.liste_voitures[0] ) ;

System.out.println("la seconde voiture de reno est " +
reno.liste_voitures[1] ) ;


    }
    
}
