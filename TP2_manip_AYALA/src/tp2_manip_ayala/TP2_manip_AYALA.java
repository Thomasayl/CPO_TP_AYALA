/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_ayala;

/**
 *
 * @author ayala
 */
public class TP2_manip_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        System.out.println("nb de calories de Assiette 3 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        // La référence objet doit etre du même type que l'objet auquel elle fait référence donc les deux lignes de la question 6 sont fausses.
        
       Moussaka[] tableauMoussaka = new Moussaka[10];

        for (int i = 0; i < tableauMoussaka.length; i++) {
            int calories = i * 100; 
            tableauMoussaka[i] = new Moussaka(calories);
        }

      
    }
                
    }
 
    

