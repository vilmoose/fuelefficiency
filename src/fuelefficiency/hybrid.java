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
public class hybrid extends vehicle{
    public hybrid(){
        super();
    }
    private double a;
    
    public double getDistance(double litres){
        a = litres;
        double perkm = 100/3.8;
        double result = a * perkm;
        return result;
    }
}
