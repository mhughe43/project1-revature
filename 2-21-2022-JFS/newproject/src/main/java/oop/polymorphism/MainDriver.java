package oop.polymorphism;

public class MainDriver {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass(98, "old", "Fart");


        ParentClass obj = new ChildClass(12, "pee", "wee");

        System.out.println(((ChildClass)obj).firstname);
    }
}
