import java.util.*;

public class ContainsDuplicateParam {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;

                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Duplicate parentheses
                if (count == 0) {
                    return true;
                }

                s.pop(); // remove '('

            } else {
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "((a+b))"; // true
        String str2 = "(a-b)";  // false

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}