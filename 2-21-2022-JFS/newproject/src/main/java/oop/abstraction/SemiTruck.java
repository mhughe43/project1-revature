package oop.abstraction;

public class SemiTruck implements Truck{


    @Override
    public void drive() {
        System.out.println("VVVVVRROOOOOOOOMMMMM");
    }

    public void honk(){
        System.out.println("honk!!");
    }

    public void speed(){
        int mph = 10;
        System.out.println(mph);
    }

}
