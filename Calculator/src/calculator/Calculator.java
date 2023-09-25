// AYALA THOMAS
//TDA
// 25/09/2023
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ayala
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println();
    //System.out.println("/n Please enter the operator: \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
    int operateur;
    int operand1;
    int operand2;
    double result=0;
Scanner sc = new Scanner(System.in); 
System.out.println("/n Please enter the operator: \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
operateur=sc.nextInt();
while (operateur>5 || operateur<1) {
    System.out.println("Erreur veuillez selectionner une valeur entre 1 et 5");
    operateur=sc.nextInt();
}   
    
System.out.println("\n Entrer le premier nombre :");
operand1=sc.nextInt(); 
System.out.println("\n Entrer le second nombre :");
operand2=sc.nextInt();
        


    if (operateur == 1) {
            result= operand1 + operand2 ;}
    if (operateur ==2){
            result= operand1 - operand2 ;}
    if (operateur ==3){
            result= operand1*operand2 ;}
    if (operateur ==4){
            result = operand1/operand2 ;}
    if (operateur ==5) {
            result = operand1%operand2;}
    
    System.out.println("\n Le résultat est:"+ result);
    
        
    }
    
    
}
