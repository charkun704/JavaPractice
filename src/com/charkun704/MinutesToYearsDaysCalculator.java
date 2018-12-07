package com.charkun704;

public class MinutesToYearsDaysCalculator {
    /*
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    */
    public static void printYearsAndDays(long minutes){
        if(minutes<0) System.out.println("Invalid Value");
        else {
            int hours, days, years, remainingMinutes, remainingHours, remainingDays;

            hours = (int) minutes / 60;
            remainingMinutes = (int) minutes % 60;

            days = hours / 24;
            remainingHours = hours % 24;

            years = days / 365;
            remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
