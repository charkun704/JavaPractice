package com.charkun704;

public class EqualSumChecker {
    /*
    public static void main(String[] args) {
        boolean show;
        show = hasEqualSum(1,1,1);
        System.out.println(show);
        show = hasEqualSum(1,1,2);
        System.out.println(show);
        show = hasEqualSum(1,-1,0);
        System.out.println(show);
    }
    */

    public static boolean hasEqualSum(int a,int b,int c){
        int sum1 = a + b;
        if(sum1==c)return true;
        else return false;
    }
}
