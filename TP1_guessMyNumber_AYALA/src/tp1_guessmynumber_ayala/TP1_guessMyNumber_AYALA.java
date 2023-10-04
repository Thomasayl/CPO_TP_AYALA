// AYALA THOMAS
//TDA
// 30/09/2023/

package tp1_guessmynumber_ayala;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class TP1_guessMyNumber_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            Scanner sc = new Scanner(System.in);
            Random generateurAleat = new Random();
        
        System.out.println("Bienvenue dans le jeu Guess My Number !");
        System.out.print("Choisissez le niveau de difficulté (facile, normal, difficile) : ");
        String niveauDifficulte = sc.nextLine().toLowerCase();
        
        int min = 0;
        int max = 100;
        int nombreAleatoire = generateurAleat.nextInt(max - min + 1) + min;
        
        int nombreTentatives = 0;
        int nombreEssaisMax = 10; 
        
        if (niveauDifficulte.equals("facile")) {
            nombreEssaisMax = 15; 
        } 
            else if (niveauDifficulte.equals("difficile")) {
            nombreEssaisMax = 5; 
        }
        
        System.out.println("Devinez le nombre entre 0 et 100 !");
        
        while (nombreTentatives < nombreEssaisMax) {
            System.out.print("Saisissez votre proposition : ");
            int proposition = sc.nextInt();
            
            if (proposition < min || proposition > max) {
                System.out.println("Veuillez entrer un nombre entre 0 et 100.");
                continue;
            }
            
            nombreTentatives++;
            
            if (proposition < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (proposition > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo, vous avez trouvé le nombre en " + nombreTentatives + " tentatives !");
                break;
            }
        }
        
        if (nombreTentatives >= nombreEssaisMax) {
            System.out.println("Desolé, vous avez atteint le nombre maximum d'essais. Le nombre etait " + nombreAleatoire + ".");
        }
        
        sc.close();
    }
        }
    
    

