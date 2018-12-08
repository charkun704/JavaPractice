package com.charkun704;

public class NumberPalindrome {
//    public static void main(String[] args) {
//        System.out.println(isPalindrome(-707));
//    }
    public static boolean isPalindrome(int number){
        if(number<0) number *= -1;
        int reverse = 0;
        int num = number;
//        int i = 0;

        while(num>0){
//            i++;
//            System.out.println("LOOP #"+i);
            int lastDigit = num % 10;
//            System.out.println(lastDigit);
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
//        System.out.println(reverse);
        if(reverse == number) return true;
        else return false;
    }
}
