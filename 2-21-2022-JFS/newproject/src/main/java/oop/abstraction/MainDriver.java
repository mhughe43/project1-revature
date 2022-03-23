package oop.abstraction;

public class MainDriver {
    public static void main(String[] args) {
        Truck semiTruck = new SemiTruck();
        semiTruck.drive();
        semiTruck.speed();
        System.out.println(Truck.yearMade);




    }
}
