import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        Stack<Character> characters = new Stack<>(); // stack to store the the char
        for (char c : parens.toCharArray()) {// loop though the array

            if (c == '(') {
                characters.push(c); // push the char to the top of the stack
            }

            else if (c == ')' && !characters.isEmpty() && characters.peek() == '(') {
                characters.pop(); // remove the stack if the char is present int eh array
            }
            else if(c == ')' && characters.isEmpty() ){ // check is the stack is empty
                return false; // return false

            }
            else {
                continue; // continue to the next char  if the its not the '(' and ')'
            }

        }
        return characters.isEmpty();
    }

}

