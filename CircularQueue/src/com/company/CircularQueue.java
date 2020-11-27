package com.company;

public class CircularQueue {

    int []arr=null;
    int capacity=3;
    int front=0;
    int rear=-1;
    int size=0;
    public CircularQueue()
    {
        this.arr=new int[capacity];
    }
    public CircularQueue(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int[capacity];
    }
    public void enqueue(int data)
    {
        if(size()==capacity)
        {
            System.out.println("Queue is full can't insert");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=data;
        size++;
        System.out.println(data+" enqueued into the queue");
        System.out.println("After insertion rear is "+rear);

    }
    public void dequeue()
    {
        if(size()==0)
        {
            System.out.println("Queue is empty");
            return;
        }
        int data=arr[front];
        front=(front+1)%capacity;
        size--;
        System.out.println(data+" dequeue from the queue");
        System.out.println("After dequeue from the queue front is "+front);
    }
    public int size()
    {
        return size;
    }

    public static void main(String[] args) {
	// write your code here
        CircularQueue cq=new CircularQueue();
        cq.enqueue(11);
        cq.enqueue(22);
        cq.enqueue(33);
        cq.enqueue(44);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();

    }
}
