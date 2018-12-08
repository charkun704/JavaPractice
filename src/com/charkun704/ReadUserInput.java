package com.charkun704;
import java.util.Scanner;
/*
This class is reads user input, checks if its a int, creats a sum of ints.
 */
public class ReadUserInput {
//    public static void main(String[] args) {
//        userInput();
//    }

    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        while(i < 3){
            int order = i + 1;
            System.out.println("Enter number #"+order+":");
            boolean isAnInt = sc.hasNextInt();

            if(isAnInt){ int num = sc.nextInt(); i++; sum+=num; }
            else{ System.out.println("Not an integer, try again."); }
            sc.nextLine(); // handle endline
        }
        System.out.println("Sum is "+sum+".");
        sc.close();
    }
}
