/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import javax.swing.JOptionPane;

/**
 *
 * @author vifeh1685
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the amount of gas in litres: ");
        double fuel = Double.parseDouble(input);
        
        car c1 = new car();
        truck t1 = new truck();
        hybrid h1 = new hybrid();
        motorcycle m1 = new motorcycle();
        
        System.out.println("_______________________________________________");
        System.out.println("On " + fuel + "L of gas the vehicles can drive:");
        System.out.println("Car = " + c1.getDistance(fuel) + "L");
        System.out.println("Truck = " + t1.getDistance(fuel) + "L");
        System.out.println("Hybrid = " + h1.getDistance(fuel)+ "L");
        System.out.println("Motorcycle = " + m1.getDistance(fuel)+ "L");
        
    }
    
}
