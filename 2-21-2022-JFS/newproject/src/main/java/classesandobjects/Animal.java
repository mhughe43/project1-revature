package classesandobjects;

public class Animal {
    /////////////////// STATE (variables) ////////////////
    String name;
    int health = 0;

    ///////////////// BEHAVIORS (methods) ///////////////
    int heal(int healthToAdd){
        health = health + healthToAdd;
        return health;
    }

    ///////////////// CONSTRUCTOR /////////////////////

    public Animal(String animalsName, int originalHealth){
        System.out.println("2 arguments ran");
        name = animalsName;
        health = originalHealth;

    }

    public Animal(String animalsName){
        System.out.println("1 argument ran");
        name = animalsName;
    }
}
