package codingchallenges.piglatin;

public class PigLatin {
    public String encrypt(String sentence) {
        //check if its a valid sentence
        if (!isValidSentence(sentence)) {
            return "Invalid Sentence";
        }

        StringBuilder pigSentence = new StringBuilder();

        //split the sentence into a words array
        String[] words = sentence.split(" ");

        //convert each word into pig latin
        for (String word : words) {
            pigSentence
                    .append(word.substring(1)) //icaela
                    .append(word.charAt(0))// M
                    .append("ay "); //ay
        }

        return pigSentence.deleteCharAt(pigSentence.length() - 1).toString();
    }

    public boolean isValidSentence(String sentence) {
        String[] words = sentence.split(" ");
        Boolean isValid = true;

        for (String word : words) {//Hello

            for (int c = 0; c < word.length(); c++) {//H e l l o
                if (!Character.isLetter(word.charAt(c))) {
                    isValid = false;
                }
            }

        }
        return isValid;
    }
}
