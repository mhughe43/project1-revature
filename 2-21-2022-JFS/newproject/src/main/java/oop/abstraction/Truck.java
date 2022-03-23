package oop.abstraction;

/*
*
* What's and interface?
*   - contract between the interface itself and the classes that implement it
*   - can have variables and abstract methods
* */

public interface Truck {

    //variables in an interface are implicitly public, static adn final
    int yearMade = 1992;


    //methods in an interface by default are public and abstract
    void drive();

    void speed();

    //you can have an implementation in an interface using the default keyword
    default void hello(){
        System.out.println("hello!");
    }



    }


