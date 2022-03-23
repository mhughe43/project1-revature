package oop.inheritance;

//this is the parent class
public class Pokemon {
    Integer id; //kevin uses wrapper classes because he personally likes it
    String name;
    Integer health;


    void takeDamage(){
        health = health - 10;
    }


}
