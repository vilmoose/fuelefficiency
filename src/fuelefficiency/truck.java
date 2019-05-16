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
public class truck extends vehicle{
    public truck(){
        super();
    }
    private double a;
    
    public double getDistance(double litres){
        a = litres;
        double perkm = 100/14.1;
        double result = a * perkm;
        return result;
    }
}
