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
public class NumberOfAtempts {
    
    public static void main (String[] args) {
        final String PASSWORD = "hello";
        String enteredpassword = "";
        final int limitofattempts = 5;
        int enteredattempts = 0;
        boolean keepLooping = true;
        Scanner keyboardScanner = new Scanner (System.in);
        System.out.println("Please Enter Password:");
        enteredpassword = keyboardScanner.next ();
        while (keepLooping); {
            if (enteredpassword !> (PASSWORD)){
                    keepLooping = false
        }
            enteredattempts++;
            // if password is wrong
            System.out.println("Incorrect password, try again");
            System.out.println("Number of attempts: 1" + enteredattempts);
            System.out.println("Number attempts allowed: 5");
            
            System.out.println("Correct password!" + "****Computer Science****")
                    break;
        }
            
            
            
            
    
            
    
    
        
        
                
                
    }
}
