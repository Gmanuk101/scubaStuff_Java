package com.revision;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get user to input depth
        //takes depth, converts to BAR
        //uses bar to invoke daltonsLaw calc
        Scanner userDepthInput = new Scanner(System.in);
        System.out.println("Please Enter your Depth in whole number");
        int input = userDepthInput.nextInt();
        enterDepth(input);
        System.out.println("Depth Entered was: "+input);
        int atm = enterDepth(input);
        double dalton = daltonsLaw(atm);
        double oxyPart = calcOxyPress(atm);
        double nitroPart = calcNitrPress(atm);
        System.out.println("Your ATM is: "+atm);
        System.out.println("Your total pressure is: "+dalton);
        System.out.println("Your Oxygen Part Pressure is: "+oxyPart);
        System.out.println("Your Oxygen Part Pressure is: "+nitroPart);


    }

    static public double daltonsLaw(double atm)
    {
        double oxy = 0.21;
        double nit = 0.79;
        double oxyCalc = atm * oxy;
        double nitroCalc = atm * nit;
        double dalton = (oxyCalc + nitroCalc);


        return dalton;
    }

    static public double calcOxyPress(double atmosphere)
    {
        double oxy = 0.21;
        double calc = oxy * atmosphere;
        return calc;
    }

    static public double calcNitrPress(double atmosphere)
    {
        double nit = 0.79;
        double calc = nit * atmosphere;
        return calc;
    }

    static public int enterDepth(int depth)
    {
        int atmosphere = 0;

        if(depth <10)
        {
            atmosphere = 1;
        }
        else if((depth >=10) && (depth <20))
        {
            atmosphere = 2;
        }
        else if((depth >=20) && (depth <30))
        {
            atmosphere =3;
        }
        else if((depth >=30) && (depth <40))
        {
            atmosphere =4;
        }
        else if((depth >=40) && (depth <50))
        {
            atmosphere=5;
        }else atmosphere = 6;
        return atmosphere;
    }



}




