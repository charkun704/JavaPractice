package com.charkun704;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0)return -1;
        int copyNumber =number;
        int lastNumber = 0;
        int firstNumber = 0;

        lastNumber = number % 10;

        while(number>0){
            if(number != copyNumber && (number<10 && number>-1)){
                firstNumber = number;
            }
            number/=10;
        }
        return lastNumber + firstNumber;
    }
}
