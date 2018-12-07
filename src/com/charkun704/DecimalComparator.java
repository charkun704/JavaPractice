package com.charkun704;

import java.math.RoundingMode;
import java.text.*;

public class DecimalComparator {
    /*
    public static void main(String[] args) {
        Boolean show;
        show = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(show);
        show = areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(show);
        show = areEqualByThreeDecimalPlaces(3,3);
        System.out.println(show);
    }
    */
     public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble){

        DecimalFormat df = new DecimalFormat(".000");
        df.setRoundingMode(RoundingMode.DOWN);
        double a = Double.parseDouble(df.format(firstDouble));
        //System.out.println(a);
        double b = Double.parseDouble(df.format(secondDouble));
        //System.out.println(b);

        if (a==b) return true;
        else return false;
     }
}