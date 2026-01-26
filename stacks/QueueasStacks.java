package stacks;

import java.util.HashSet;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;
    private HashSet<Integer> hs;
    public MyQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
        hs = new HashSet<>();

    }

    public void push(int x) {
        firstStack.push(x);

    }

    public int pop() {
        if(firstStack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        secondStack.push(firstStack.pop());
        
        return secondStack.peek();    
    }

    public int peek() {
        return firstStack.peek();
    }
      public boolean empty() {
          return firstStack.isEmpty() && secondStack.isEmpty();
    }
    
}

public class QueueasStacks {
    public static void main(String[] args) {
       MyQueue qu = new MyQueue();
    }
}
