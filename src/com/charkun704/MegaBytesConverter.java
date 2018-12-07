package com.charkun704;

public class MegaBytesConverter {
    /*
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(3000);
    }
    */
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }
    }
}
