package com.charkun704;

public class TeenNumberChecker {
    /*
    public static void main(String[] args) {
        boolean show;
        show = hasTeen(9,99,19);
        System.out.println(show);
        show = hasTeen(23,15,42);
        System.out.println(show);
        show = hasTeen(22,23,24);
        System.out.println(show);
    }
    */
    public static boolean hasTeen(int a, int b, int c){
        if(a>12 && a<20) return true;
        if(b>12 && b<20) return true;
        if(c>12 && c<20) return true;
        else return false;
    }
}