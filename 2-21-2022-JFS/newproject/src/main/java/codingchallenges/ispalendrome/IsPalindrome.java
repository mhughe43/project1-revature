package codingchallenges.ispalendrome;

public class IsPalindrome {
    //one way to do that
   /* public boolean isPalindrome(String word){

        for(int i = 0; i<word.length(); i++){
            //word.charAt(i) first letter in string
            //word.CharAt(word.length() -1 -i) last letter in string
            if(word.charAt(i) != word.charAt(word.length() -1 - i));
            return false;
        }
            return true;
    }
*/
//another way
    public static Boolean isPalindrome(String word){
        word = word.toLowerCase();
        StringBuilder test = new StringBuilder(word);
        test.reverse();
        return test.toString().equals(word);
    }

}
