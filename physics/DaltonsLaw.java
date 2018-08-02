package com.revision.physics;

public class DaltonsLaw {

    public double daltonsLaw(double atm) {
        double oxy = 0.21;
        double nit = 0.79;
        double oxyCalc = atm * oxy;
        double nitroCalc = atm * nit;
        double dalton = (oxyCalc + nitroCalc);


        return dalton;
    }


    public double calcOxyPress(double atmosphere) {
        double oxy = 0.21;
        double calc = oxy * atmosphere;
        return calc;
    }

    public double calcNitrPress(double atmosphere) {
        double nit = 0.79;
        double calc = nit * atmosphere; //
        return calc;
    }

    public int enterDepth(int depth) {
        int atmosphere = 0;

        if (depth < 10) {
            atmosphere = 1;
        } else if ((depth >= 10) && (depth < 20)) {
            atmosphere = 2;
        } else if ((depth >= 20) && (depth < 30)) {
            atmosphere = 3;
        } else if ((depth >= 30) && (depth < 40)) {
            atmosphere = 4;
        } else if ((depth >= 40) && (depth < 50)) {
            atmosphere = 5;
        } else atmosphere = 6;
        return atmosphere;
    }

}
