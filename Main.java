package com.revision;

import com.revision.physics.DaltonsLaw;

import java.util.Scanner;

public class Main {

    private static DaltonsLaw depth = new DaltonsLaw();
    private static String depthMessage = "You entered a depth of: ";
    private static String atmLevelMessage = "Your ATM Level is: ";
    private static String oxyMessage = "Your Oxygen Partial Pressure will be: ";
    private static String nitroMessage = "Your Nitrogen Partial Pressure will be: ";
    private static String totalPressureMessage = "Your Total Pressure in BAR is: ";


    public static void main(String[] args) {

        System.out.println("Please Enter Your Depth:");
        //set up scanner object to handle user input
        Scanner userDepthInput = new Scanner(System.in);
        int depthInput = userDepthInput.nextInt();

        //return to atmospheric rating from enterDepth() method
        double atmosLevel = depth.enterDepth(depthInput);

        //create variables to store atmosphere, oxt, nitro and total pressures

        double oxyLeve = depth.calcOxyPress(atmosLevel);
        double nitroLevel = depth.calcNitrPress(atmosLevel);
        double totalPressure = depth.daltonsLaw(atmosLevel);
        System.out.println(depthMessage + depthInput);
        System.out.println(atmLevelMessage + atmosLevel);
        System.out.println(oxyMessage + oxyLeve);
        System.out.println(nitroMessage + nitroLevel);
        System.out.println(totalPressureMessage + totalPressure);

    }//end main


}//end class




