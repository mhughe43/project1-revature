package oop.encapsulation;

/*
* encapsulation - the restriction of direct access
* -private class, public getters and setters
*
* we achieve this by using access modifiers
*   -public: can be seen from anywhere
*   -protected: within the same package and subclasses
*   -default: can only be seen within the same package
*   -private: visible only to the class you are in
* */

public class User {
    private int age = 18;

    //getter
    public int getAge() {
        return this.age;
    }

    //setter
    public void setAge(int val) {
        if (val >= 18) {
            this.age = val;
        }

    }
}

