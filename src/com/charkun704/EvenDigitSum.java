package com.charkun704;

public class EvenDigitSum {
//    public static void main(String[] args) {
//        System.out.println(getEvenDigitSum(123456789));
//    }

    public static int getEvenDigitSum(int number){
        if(number<0) return -1;
        int num = number;
        int lastDigit = 0;
        int divBy2 = 0;
        int sum = 0;
        while(num>0){
            divBy2 = num % 2;
            if(divBy2 == 0){
                lastDigit = num % 10;
                sum += lastDigit;
            }
            num/=10;
        }
        return sum;
    }
}