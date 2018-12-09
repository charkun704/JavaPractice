package com.charkun704;
import java.util.Scanner;
/*
This class will take in user defined int and print min and max. The loop will be infinite and break with invalid entry.
 */
public class MinMaxInput {
    /*
    public static void main(String[] args) {
        minMaxLoop();
    }*/

    public static void minMaxLoop(){
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true){
            System.out.println("Enter integer value.");
            boolean validEntry = sc.hasNextInt();

            if(validEntry){
                int currentInt = sc.nextInt();
                if(currentInt > max){ max = currentInt; }
                if(currentInt < min){ min = currentInt; }
            }else{
                System.out.println("ERROR: INTEGER NOT FOUND");
                break;
            }

            sc.nextLine();
        }

        System.out.println("MIN: " + min + " MAX: " + max);
        sc.close();
    }
}
