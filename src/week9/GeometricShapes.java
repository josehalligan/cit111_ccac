/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author jose.halligan
 */
public class GeometricShapes {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner (System.in); 
        //call calcVolumeOfCube Here
        double returnedVolume = keyboardScanner.next();
        // print the inputs and the outputs to the console
        System.out.println("Volume of a cube: " + returnedVolume);
        
        // call calcVolumeOfCylinder
        returnedVolume = keyboardScanner.next();
        // print the inputs and the outputs 
        System.out.println("Volume of a Cylinder: " + returnedVolume);
        
        // call calcAreaOfTrapezoid
        double returnedArea = keyboardScanner.next();
        // print the inputs and outputs
        System.out.println("Area of a Trapezoid: " + returnedArea);
                
        
    }// close main
    public static double calcVolumeOfCube(double sideLength) {
        // raise side length to 3 and return the result
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;//place holder
    }// close double calcVolumeOfCube
    
    public static double calcVolumeOfCylinder(double radius, double height) {
        double calcVolume = Math.PI*radius*height;
        return calcVolume;
    }// close calcVolumeOfCylinder
    public static double calcAreaOfTrapezoid(double area, double base, double height) {
        double calcArea =((area + base) / 2 * height);     
        return calcArea;
    }// close double calAreaOfTrapezoid
    
    
}// close class
