// AYALA THOMAS
//TDA
// 26/09/2023/*

package tp1_manipnombresint_ayala;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class TP1_manipNombresInt_AYALA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1;
        int entier2;
Scanner sc = new Scanner(System.in);       
System.out.println("\n Entrer un nombre entier :");
entier1=sc.nextInt(); 
System.out.println("\n Entrer un second nombre entier :");
entier2=sc.nextInt(); 
System.out.println("\n Voici vos deux entiers: \n"+ entier1 +"\n" +entier2 );
System.out.println("/n Voici dans l'ordre:la somme,la différence, le produit, le quotient entier et le reste de la division euclidienne" );
System.out.println((entier1+entier2) + "\n"+ (entier1-entier2) + "\n"+ (entier1*entier2)+ "\n" + (entier1/entier2)+ "\n"+ (entier1%entier2));
    }
    
}
