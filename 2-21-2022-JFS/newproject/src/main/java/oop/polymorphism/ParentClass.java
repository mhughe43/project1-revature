package oop.polymorphism;

public class ParentClass {
    Integer age = 99;
    String firstname = "Old";
    String lastname = "Fart";

    public ParentClass(int age, String firstname, String lastname){
        this.age = age;
        this.firstname=firstname;
        this.lastname=lastname;
    }


    public ParentClass() {

    }

    public void drink(){
        System.out.println("I'm drinking a moscow mule");
    }


}


