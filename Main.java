package com.revision;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static com.revision.physics.DaltonsLaw.*;

public class Main {

    public static void main(String[] args) {
        //get user to input depth
        //takes depth, converts to BAR
        //uses bar to invoke daltonsLaw calc
        Scanner userDepthInput = new Scanner(System.in);
        System.out.println("Please Enter your Depth in whole number");
        int input = userDepthInput.nextInt();//
        enterDepth(input);
        System.out.println("Depth Entered was: "+input);
        int atm = enterDepth(input);
        double dalton = daltonsLaw(atm);
        double oxyPart = calcOxyPress(atm);
        double nitroPart = calcNitrPress(atm);
        System.out.println("Your ATM is: "+atm);
        System.out.println("Your total pressure is: "+dalton);
        System.out.println("Your Oxygen Part Pressure is: "+oxyPart);
        System.out.println("Your Nirtorgen Part Pressure is: "+nitroPart);


    }




}




