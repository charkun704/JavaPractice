package com.charkun704;

public class BarkingDog {
    /*
    public static void main(String[] args) {
        boolean show;
        show = bark(true,1);
        System.out.println(show);
        show = bark(false,2);
        System.out.println(show);
        show = bark(true,8);
        System.out.println(show);
        show = bark(true,-1);
        System.out.println(show);
        show = bark(true,22);
        System.out.println(show);
    }
    */
    public static boolean bark(boolean barking,int hourOfDay){
        if(barking){
            if(hourOfDay >= 0 && hourOfDay < 8){
                return true;
            }else if(hourOfDay == 23){
                return true;
            }else return false;
        }else return false;
    }
}