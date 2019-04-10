/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *Demo of methods with return types
 * @author jose.halligan
 */
public class MethodsWithReturn {
    
    public static void main(String[] args) {
        int initialNumber = 100;
        // calls doubleAValue and store the returned
        // integer in returnedValue
        int returnedValue = doubleAValue(initialNumber);
        System.out.println("Value returned: " + returnedValue);
    }//close main
    
    //a method takes in an interger, doubles it, and returns result
    public static int doubleAValue(int value) {
        int result = value * 2;
        
        return result;
        
    }// close doublesValue
}//close class
