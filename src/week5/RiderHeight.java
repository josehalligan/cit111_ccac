/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author jose.halligan
 */
public class RiderHeight {
    
    public static void main(String[] args) {
        int riderHeight;
        Scanner keyboardScanner = new Scanner(System.in);
        //ask the user for their height
        riderHeight = keyboardScanner.nextInt();
       
        final int MIN_HEIGHT = 137;
        System.out.println("Welcome to the Phantom Train ride! Enter your height in CM:");
        if ( riderHeight >= MIN_HEIGHT) {
           System.out.println ("Your height of "+ riderHeight + "  means you can ride");
        } else {
            
           System.out.println("Sorry, Shorty come back after doing some growing");
        }
            
            
        
    }
}
