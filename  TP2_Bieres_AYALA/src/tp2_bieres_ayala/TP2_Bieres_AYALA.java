// AYALA THOMAS
//TDA
// 04/10/2023/

package tp2_bieres_ayala;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class TP2_Bieres_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", (float) 7.0,"Dubuisson") ;
        BouteilleBiere secondBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken", (float) 8.0,"Marseille") ;
        BouteilleBiere quatreBiere = new BouteilleBiere("Guiness", (float) 7.6,"Dublin") ;
        BouteilleBiere cinqBiere = new BouteilleBiere("Desperados", (float) 6.8,"Barcelona") ;
        uneBiere.lireEtiquette();
        secondBiere.lireEtiquette();
        troisiemeBiere.lireEtiquette();
        quatreBiere.lireEtiquette();
        cinqBiere.lireEtiquette();
    

       uneBiere.Decapsuler();
       secondBiere.Decapsuler();
       troisiemeBiere.Decapsuler();
       quatreBiere.Decapsuler();
       cinqBiere.Decapsuler();
    }
}
