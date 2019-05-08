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
public class BigCat {// open class
    // properties of object
    public int weight;
    public int size;  
    public int lifespan;
    private boolean isCatRunning;
    private double speed;
    
    public void CatRunning() {// opening method CatRunning
        isCatRunning = true;// if the lion is not running then
        System.out.println("ZZZZZZZZzzzzzz");
    }// end Cat running
    
    public void CatNotRunning() {// openng CatNotRunning method
        isCatRunning = false;// if the lion is runing then
        System.out.println("RRRRRRaaaaaawwwwwrrrrrrrr");
    }// end Cat not running
    public boolean checkLionStatus() {//opening checkLionStatus method
        return isCatRunning;
    }// close checkEngineStatus
    public double getSpeedofCat() {// opening getSpeedofCat method
        return speed;
    }// close getSpeedofCat
    public double acceleration(int mphIncrease) {// opening acceleration method
        speed = speed + mphIncrease;
        return speed;
    }// close acceleration
    public double decceleration(int mphDecrease) { // opening decceleration method
        speed = speed - mphDecrease;
        return speed;
}// end method decceleration
}// end Class Big Cat
