package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack s=new Stack();
        s.push(11);
        s.push(13);
        s.push(19);
        s.push(37);
        s.push(88);
       // s.push(99);
        System.out.println("Before removing elements from stacks");
        System.out.println("Is stack is empty "+s.isEmpty());
        System.out.println("Is stack is full "+s.isFull());
        System.out.println(s.peek()+" peek from stack");
        System.out.println(s.peek()+" peek from stack");
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println("After removing the elements from stack is :");
        System.out.println("Is stack is empty "+s.isEmpty());
        System.out.println("Is stack is full "+s.isFull());
    }
}
