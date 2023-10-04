// AYALA THOMAS
//TDA
// 30/09/2023/

package tp1_stats_ayala;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class TP1_stats_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] resultatDes = new int[6];
        
        
        for (int i = 0; i < resultatDes.length; i++) {
            resultatDes[i] = 0;
        }
        
        System.out.print("Combien de fois voulez-vous lancer le de ? ");
        int nombreLancers = sc.nextInt();
        
        Random generateurAleat = new Random();
        
      
        for (int i = 0; i < nombreLancers; i++) {
            int resultatLancer = generateurAleat.nextInt(6); 
            resultatDes[resultatLancer]++; 
        }
        
        System.out.println("Resultats des lancers de de :");
        
       
        for (int i = 0; i < resultatDes.length; i++) {
            double pourcentage = (double) resultatDes[i] / nombreLancers * 100.0;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }
        
        sc.close();
    }
}
    
    

