package stacks;
import java.util.Stack;

public class Validparantheses{
   
   public static int longestValidParentheses(String s){
    int chCount = 0;    
    Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            s1.push(s.charAt(i));
            if(s1.peek() == '(' && s.charAt(i)== ')' ){
                chCount++;
            }
        }
        return chCount;
   }
   
    public static void main(String[] args){
        String s = "(()";
        int count = longestValidParentheses(s);
        System.out.println(count);
    }
}