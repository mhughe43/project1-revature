package oop.polymorphism;

public class ChildClass extends ParentClass {
    int age;
    String firstname;
    String lastname;

    public ChildClass(int age, String firstname, String lastname){
        this.age = age;
        this.firstname=firstname;
        this.lastname=lastname;
    }

    /*
    * Overriding?
    *   is when a child method has the same signature as a parent class
    * */

    public void drink(){
        System.out.println("I'm drinking a caprisun because I'm a child");
    }

}

