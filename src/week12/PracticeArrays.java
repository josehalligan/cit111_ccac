/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;

/**
 *
 * @author jose.halligan
 */
public class PracticeArrays {
    public static void main(String[] args){
    String[] cars = new String[5];
    cars[0] = " Dodge Caliber";
    cars[1] = " Chevy Sonic LT";
    cars[2] = " KIA Optima";
    cars[3] = " Jeep Canedo";     
    cars[4] = null;
    
   UserInteraction(cars); 
   int counter = 0; 
   while (counter < cars.length){
       System.out.println("Value at bin index " + counter + " is " + cars[counter]);
       counter = counter + 1;
   }// end while
    
   // loop over array with for loop
   // for(initialize ; boolean check ; incrment )
   // for (runs once at start ; checked each time ; run after each loop;)
   
   for (int i = 0;i < cars.length ; i = i + 1) {
   System.out.println("Value at bin index " + i + " is " + cars[i]);
   }// close for
}//close of main
    
// a method that takes in a String[] and allws user to puopulate values
public static void UserInteraction(String[] inputArray) {
    //display size of the array to user
    String [] arr = new String[5];
    
    
    // ask user which bin they want to access
    System.out.println(" Which car would you like to access?");
    // make a Scanner object
     Scanner keyboardScanner = new Scanner (System.in);
    // read in an in with scan.nextInt()
     int userinput = keyboardScanner.nextInt();
    //modify user input to work with 0-indexed arrays (subract 1)
      userinput = userinput - 1; 
    // look up value in array
    // display to user
    System.out.println("Value at bin index" + userinput + inputArray[userinput]);
}// close User Interaction
    
}// close PracticeArrays   
      
