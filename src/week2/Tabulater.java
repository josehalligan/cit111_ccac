/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author jose.halligan
 */
public class Tabulater {
    public static void main(String[] args) {
        //creat a scanner for gathering user input
        Scanner scanner = new Scanner(System.in);
        
        // declare and initiate our two counter variables to zero
        int totalRespondents = 0;
        int numLinuxUsers = 0;
        
        System.out.println("Linux Users Survey");
        
        //this while loop will proceed indefinitly since the value "true"
        //will always be true, resulthing in an infinite loop while(true){
            System.out.println(">>>>>>Question<<<<<<");
            System.out.println("Do you regularly use Linux software?"
                        + "(Android == Linux!!");
            System.out.println("(Enter 1 for YES and 0 for NO)");
                
            int userResponse = scanner .nextInt()
                
            //display an automated response based on the user's input if (userResponse == 1){
            // subce they indicated that they use linux, increment our counter numLinuxUsers = numLinuxUsers + 1;
            System.out.println("Yeaah! Free Software Users Unit!");
    } else{
           System.out.println("[sad face] Visit unbuntu.com immediately!");
            }    
    
    }             
}
