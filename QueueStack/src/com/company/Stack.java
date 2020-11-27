package com.company;

public class Stack {
    int []arr=null;
    int capacity=5;
    int top=-1;
    public Stack()
    {
        this.arr=new int[capacity];
    }
    public Stack(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int[capacity];
    }

    public void  push(int data)
    {
        if(isFull())
        {
           // System.out.println("Stack is full can't insert");
        }
        arr[++top]=data;
        //System.out.println(data+ " inserted into Stack");
    }
    public void pop()
    {
        if(isEmpty())
        {
            //System.out.println("stack is empty");
            return;
        }
        int data=arr[top--];
       // System.out.println(data+" removed from Statck");
    }
    public boolean isFull()
    {
        return (size())==capacity;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return arr[top];
    }
    int size()
    {
        return top+1;
    }
}
