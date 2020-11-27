package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue q=new Queue();
        q.enqueue(11);
        q.enqueue(22);
        q.enqueue(33);
        q.enqueue(44);
        q.enqueue(55);
        q.enqueue(66);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
