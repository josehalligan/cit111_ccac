/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author jose.halligan
 */
public class IfPractice {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner (System.in); 
        int i = inputReader.nextInt();
        int c = inputReader.nextInt();
        boolean check = i > c;
        if (check){
            System.out.println("TRUE: " + i + " is greaer than " + c);
        } else {
            System.out.println("FALSE: " + i + " is less than " + c );
        }// close if/else block
    }// close main method
    
}//close class IfPractice
