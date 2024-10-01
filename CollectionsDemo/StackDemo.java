package CollectionsDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //Follows LIFO policy
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);

    }
}