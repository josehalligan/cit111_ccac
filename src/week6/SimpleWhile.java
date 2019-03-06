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
public class SimpleWhile {
    public static void main(String[] args) {
        int numLoops = 0;
        int userLoops;
        String phrase;
        Scanner scanner = new Scanner (System.in);
        phrase = scanner.next();
        System.out.println("How many loops shall I print?");
        userLoops = scanner.nextInt();
        while(numLoops < userLoops){
            System.out.println(phrase + " " + numLoops);
            numLoops = numLoops + 1;
        } // close while
        System.out.println("...After the while loop");
    } 
} // close class
