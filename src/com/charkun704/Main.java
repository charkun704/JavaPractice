package com.charkun704;
/*
This class will be used to hold all the Main class functions for when it's needed.
 */
public class Main {
    /*
    121018
    Practicing inheritance.
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog= new Dog("Yorkie",8,20,2,4,1,20,"Long silky");
        dog.eat();
        dog.run();
    }


    /*
    Main class for Car class exercise. 120818
     */
//    public static void main(String[] args) {
//
//        Car honda = new Car();
//
//        honda.setModel("civic");
//
//        System.out.println(honda.getModel());
//    }
} // END OF MAIN