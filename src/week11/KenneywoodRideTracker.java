/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Random;

/**
 *
 * @author jose.halligan
 */
public class KenneywoodRideTracker {
    public static int totalRiders = 0;
    private static  int totalFailedAttempts = 0;
    private static int totalSickRiders = 0;
    final static int MinHeight = 60;
    final static int BlackWidow = 58;
    final static int MerryGoRound = 57;
    
    public static void main(String[] args) { 
        System.out.println("Starting Rider Simulation: ");
        rideBlackWidow(68,68);
        printRiderStats();
        
        System.out.println("xxxxxxxxxxxxxx");
        
        rideMerryGoRound (65,54);
        printRiderStats();
        
        System.out.println("xxxxxxxxxxxxxx");
        
        rideBlackWidow(39,67);
       printRiderStats();
        
        System.out.println("xxxxxxxxxxxxxx");
      
    }
    
    public static void rideBlackWidow(int riders, int avgHeight) {     
     if(avgHeight >= MinHeight) { // open if and else statement
         System.out.println("Riding Black Widow!!");
         totalRiders = totalRiders + riders;
         Random rand = new Random();
         int sickriders = rand.nextInt(riders);
         totalSickRiders = totalSickRiders + sickriders;
     } else {
         System.out.println("Permissions to ride Black Widow Denied");
         totalFailedAttempts = totalFailedAttempts + riders;
     } //close to if and else statement
     
    }// close method rideBlackWidow
    
    public static void rideMerryGoRound(int riders,int avgHeight) {
        if(avgHeight >= MinHeight) { // open if and else statement
       System.out.println("Riding the MerryGoRound!!");
         totalRiders = totalRiders + riders;
         Random rand = new Random();
         int sickriders = rand.nextInt(riders);  
         totalSickRiders = totalSickRiders + sickriders;
     } else {
         System.out.println("Permissions to ride the MerryGoRound Denied");
         totalFailedAttempts = totalFailedAttempts + riders;
        }//close if and else statement
    } // close method rideMerryGoRound
    
    public static void printRiderStats(){
        System.out.println("RIDER STATS");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);
    }// close method printRidesStats
        
    
    
}// close class KenneywoodRideTracker
