package classesandobjects;

public class MainDriver {
    public static void main(String[] args) {
        //[datatype] variableName = [value];
        Animal animal1 = new Animal("jose", 11); //instantiation
        Animal animal2 = new Animal("liz");
        //Animal animal3 = new Animal() no longer works because we added parameters to animal.
        System.out.println(animal1.heal(10));
        System.out.println(animal1.heal(11));
        System.out.println(animal1.heal(105));
    }

    ////////////// initializer block: called everytime an object is instantiated  ////////////
    {
        System.out.println("initializer");
    }

}
