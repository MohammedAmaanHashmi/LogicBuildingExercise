package com.questions;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Apple");   //4
        stack.push("Banana"); //3
        stack.push("Orange"); //2
        stack.push("Mango"); //top
//        System.out.println(stack);
//        String topElement = stack.peek();
//        System.out.println(topElement);
//        String elementOutFromStack = stack.pop();
//        System.out.println(elementOutFromStack);
//        topElement = stack.peek();
//        System.out.println(topElement);
//        stack.pop();
//        System.out.println(stack.isEmpty());
        int position = stack.search("Cherry");
        System.out.println(position);
        stack.search("Apple");

        stack.pop();//remove the top element from the stack and return it back to you

        stack.peek();//it doesnt remove the top element from the stack but returns the value

        stack.isEmpty();//true -if empty else its gonna return false!

        int position2 = stack.search("apple"); //position topelement 1,2,3,4 if the element is not
        //found the position will be -1

        System.out.println(position2);

    }
}
