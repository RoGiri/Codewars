import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        Stack<Character> characters = new Stack<>();
        for (char c : parens.toCharArray()) {

            if (c == '(') {
                characters.push(c);
            }

            else if (c == ')' && !characters.isEmpty() && characters.peek() == '(') {
                characters.pop();
            }
            else if(c == ')' && characters.isEmpty() ){
                return false;

            }
            else {
                continue;
            }

        }
        return characters.isEmpty();
    }

}

