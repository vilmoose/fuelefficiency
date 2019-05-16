/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author vifeh1685
 */
public class vehicle extends FuelEfficiency{
    private double fuel1;
   
    public double getDistance(double amount){
        fuel1 = amount;
        return fuel1;
    }
}
