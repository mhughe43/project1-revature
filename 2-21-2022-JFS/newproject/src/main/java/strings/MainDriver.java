package strings;

public class MainDriver {
    public static void main(String[] args) {
        /*
        * String
        *  -it is an array of character
        *  -string is a class, not a primitive data type
        * - immutable, it can't be changed
        * */

        String str= "Hello Strings!";
        str = "Hello!";
        //both of these are strings now in the string pool


        /*
        * StringBuffer is mutable and it is synchronized (threadsafe)*/

        StringBuffer sbuff = new StringBuffer("In the end");
        sbuff.append(", it doesn't even matter");
        System.out.println(sbuff);

        /*
        * StringBuilder is mutable and is not synchronized (not threadsafe)
        * */

        StringBuilder sbuild= new StringBuilder("oh hello");
        sbuild.append(" good bye");
        System.out.println(sbuild);
        System.out.println(isPalindrome("racecar"));


        Object obj = new Object();
        //obj.equals(); compared value and same datatype
        //obj.toString(); string representation of the object
        //obj.hashcode() converts the object to a numerical value

        User user = new User();
        user.firstname = "albert";
        user.lastname = "marks";

        System.out.println(user);

        Class child = new Class();
        System.out.println(child.toString());


    }

    public static Boolean isPalindrome(String word){
        String reverseWord = new StringBuilder(word).reverse().toString();
                return word.equals(reverseWord);
    }

}
