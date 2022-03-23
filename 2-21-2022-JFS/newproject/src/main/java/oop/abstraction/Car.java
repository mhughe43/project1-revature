package oop.abstraction;

/*
* abstract classes are partially abstract... meaning we can have methods with implementations
* */

public abstract class Car {

    void drive() {
        System.out.println("vroom");
    }

    void honk(){
        System.out.println("meep meep");
    }
}
