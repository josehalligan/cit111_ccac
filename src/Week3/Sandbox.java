/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author jose.halligan
 */
public class Sandbox {
    public static void main(String[] args) {
        int age;
        Scanner keyboardScanner = new Scanner(System.in);
        
        // ask the user for an interger, store in variable age
        age = keyboardScanner.nextInt();
        System.out.println("you entered age of: " + age);
}
