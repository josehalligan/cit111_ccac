/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsweek;


/**
 *
 * @author jose.halligan
 */
public class CatLand {
    public static void main(String[] args) { //open main
        BigCat Lion = new BigCat(); // new object
        // establishing the weight and size of my object 
        Lion.weight = 400; 
        Lion.size = 5;
        Lion.lifespan = 12;
        
        
        displayBigCatStats(Lion);// calling displayBigCatStats method 
        //calling the methods made
        Lion.CatRunning();
        Lion.acceleration(50);
        Lion.decceleration(15);
   
        
        displayBigCatStats(Lion);
        Lion.CatNotRunning();
        displayBigCatStats(Lion); 
       
    }// close main
    
    public static void displayBigCatStats(BigCat anyBigCat){// open method displayBigCatsStats
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");// seperation of the stats
        System.out.println("LION FACTS");
        System.out.println("Weight of Lion: " + anyBigCat.weight + " pounds");
        System.out.println("Size of Lion: " + anyBigCat.size + " feet");
        System.out.println("Average Lifespan of Lion: " + anyBigCat.lifespan + " years in the wild");
        System.out.println("Is the Lion Running?: " + anyBigCat.checkLionStatus());
        System.out.println("Current Speed: " + anyBigCat.getSpeedofCat() + " mph"); 
    }//end method displayBigCatsStats
    
}// close class
