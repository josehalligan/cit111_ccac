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
public class Login {
    
    public static void main(String[] args) {
        final String USER_NAME = "javaghost";
        final String PASSWORD = "ic0d3";        
        String enteredpassword = "" ;
        String enteredusername = "";
        System.out.println("Enter Username");
        // user types in their username
        Scanner keyboardScanner = new Scanner (System.in);
        enteredusername = keyboardScanner.next ();
        System.out.println("Enter Password");
        // user types in their password
        enteredpassword = keyboardScanner.next (); 
        
        
        
        PASSWORD = keyboardScanner.next (); 
        
        
                
    }
    
}
