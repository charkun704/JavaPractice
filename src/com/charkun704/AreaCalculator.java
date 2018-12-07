package com.charkun704;

public class AreaCalculator {
    /*
    public static void main(String[] args) {
        System.out.println(area(5));
    }
    */
    public static double area(double radius){
        if(radius < 0) return -1;
        double area = radius * radius * 3.14159;
        return area;
    }

    public static double area(double x, double y){
        if(x<0 || y<0) return -1;
        double area = x * y;
        return area;
    }
}
