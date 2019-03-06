/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author jose.halligan
 */
public class SimpleFor {
    public static void main(String[] args) {
        int userLoops;
        String phrase;
        Scanner scanner = new Scanner (System.in);
            System.out.println("Enter Phrase");
        phrase = scanner.next();
        System.out.println("How many loops shall I print?");
        userLoops = scanner.nextInt();
        for(int numLoops = 0; numLoops < numLoops; numLoops = numLoops + 1){
            System.out.println(phrase + " " + numLoops);
           
        } // close while
        System.out.println("...After the while loop");
    } 
} // close class
