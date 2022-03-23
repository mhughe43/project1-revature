package scopes;

/*
* Scope?
*   Where a variable exists within a class.
*
* 4 scopes in java:
* - class/static scope - you cannot access any of the below scopes from this scope
* - object/instance scope - can access static scope but nothing below it
* - method scope - can access object and static scope
* - block scope - can access any of the above
*
*
* */

import org.w3c.dom.ls.LSOutput;

public class MainDriver {
    static int staticVar = 1; //static scope
    int instanceVar =2; //instance scope

    static void staticMethod(){

        /*
        * what variables can i see here?
        *   -static var
        * */

    }

    void instanceMethod(){ //instance scope
        /*
         * what variables can i see here?
         *   -staticVar
         *   -instanceVar
         * */
        int methodVar = 3; //method scope - unique to this method
        if(true){
            int blockVar =4; //block scope
        }

    }

    /*
    * what is casting?
    *   converting one datatype to another
    *
    * if you need to explicitly ct, the syntax is ([datatype to cast to]) before the variable
    * */

    int x = 2;
    double y = x;// widening
    //sout (y)
    //2.0

    double z = 3.3;
    int i = (int) z; //narrowing
    //sout(i)
    //3


}
