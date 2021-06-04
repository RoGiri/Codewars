public class Reversewords {
    public static String reverseWords(final String original)
    {
       StringBuilder word = new StringBuilder(); //initialize word
       StringBuilder outcome = new StringBuilder();  //initialize outcome

        for( int i = 0 ; i < original.length(); i++){ // loop through the string
            if(Character.isWhitespace(original.charAt(i))  ){ // check for white space character
                outcome.append(reverse(word.toString())).append(" "); // reverse the word stored in the word

                word = new StringBuilder(); // empty the variable word
            }
            else {
                word.append((original.charAt(i)));
            }
        }
        outcome.append(reverse(word.toString())); // reverse the last word
        return outcome.toString(); // return outcome
    }


    public static String reverse (String s ) {
        StringBuilder reverseWord  = new StringBuilder();
        for(int j = s.length()-1 ; j >=0 ; j--){ // loop though the string (word )

            char temp = s.charAt(j); // temporary store the character
            reverseWord.append(temp); // add character to the reverseWord

        }

        return reverseWord.toString(); // return the reverse word
    }
}
