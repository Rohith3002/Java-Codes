package CollectionsFramework;

import java.util.Stack;

public class Example5 {
    public static void main(String[] args) {

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        //stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());


    }
}