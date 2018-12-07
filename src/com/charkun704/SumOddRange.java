package com.charkun704;

public class SumOddRange {

//    public static void main(String[] args) {
//        System.out.println(sumOdd(100,-100));
//    }

    public static boolean isOdd(int number){
        int remainder = number%2;
        if(remainder==1)return true;
        else return false;
    }
    public static int sumOdd(int start, int end){
        if(end<start || start < 0) return -1;
        else{
            int sum = 0;
            for (int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}