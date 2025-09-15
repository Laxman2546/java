import java.util.Stack;

public class Fifodata {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isEric(s));
    
    }

    public static boolean isEric(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (st.isEmpty()) {
                return false;
            } else if (c == ')' || c == '}' || c == ']') {
                char top = st.peek();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{') {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty() ? true : false;        

    }
}
