package com.charkun704;

public class LeapYear {
    /*
    public static void main(String[] args) {
        Boolean show;
        show = isLeapYear(2000);
        System.out.println(show);
    }
    */

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) return false;
        int divBy4 = year % 4;
        int divBy100 = year % 100;
        int divBy400 = year % 400;

        if(divBy4 == 0 && divBy100 != 0){ return true;}
        else if(divBy400 == 0){ return true;}
        else return false;
    }
}