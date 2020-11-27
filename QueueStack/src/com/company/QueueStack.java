package com.company;

public class QueueStack {
    public Stack stack_enqueue=null;
    public Stack stack_dequeue=null;
    public int capacity=5;
    public QueueStack()
    {
        stack_enqueue=new Stack(capacity);
        stack_dequeue=new Stack(capacity);
    }
    public QueueStack(int capacity)
    {
        this.capacity=capacity;
        stack_enqueue=new Stack(capacity);
        stack_dequeue=new Stack(capacity);

    }
    public void enqueue(int value)
    {
        if(stack_enqueue.isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        stack_enqueue.push(value);
        System.out.println(value+" enqueue into the queue");
    }
    public void dequeue()
    {
        if(stack_enqueue.isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        while (!stack_enqueue.isEmpty())
        {
            stack_dequeue.push(stack_enqueue.peek());
            stack_enqueue.pop();
        }
        int data=stack_dequeue.peek();
        stack_dequeue.pop();

        while (!stack_dequeue.isEmpty())
        {
            stack_enqueue.push(stack_dequeue.peek());
            stack_dequeue.pop();
        }
        System.out.println(data+" Dequeue from the queue");
    }

    public int rear()
    {
        if(stack_enqueue.isEmpty())
            return Integer.MIN_VALUE;
        return stack_enqueue.peek();
    }
    public int front()
    {
        if(stack_enqueue.isEmpty())
        {
            return Integer.MIN_VALUE;
        }
        while (!stack_enqueue.isEmpty())
        {
            stack_dequeue.push(stack_enqueue.peek());
            stack_enqueue.pop();
        }
        int data=stack_dequeue.peek();
        while (!stack_dequeue.isEmpty())
        {
            stack_enqueue.push(stack_dequeue.peek());
            stack_dequeue.pop();
        }
        return data;
    }
    public boolean isFull()
    {
        return stack_enqueue.isFull();
    }
    public boolean isEmpty()
    {
        return stack_enqueue.isEmpty();
    }

    public int size()
    {
        return stack_enqueue.size();
    }

    public static void main(String[] args) {
	// write your code here
        QueueStack qs=new QueueStack();
        qs.enqueue(11);
        qs.enqueue(22);
        qs.enqueue(33);
        qs.enqueue(44);
        qs.enqueue(55);
        System.out.println("Size of Queue :"+qs.size());
        System.out.println("Is QUeue is empty :"+qs.isEmpty());
        System.out.println("Is queue is full :"+qs.isFull());
        System.out.println("Rear value of the queue is :"+qs.rear());
        System.out.println("Front value of the queue is :"+qs.front());
        qs.enqueue(66);
        qs.dequeue();
        qs.dequeue();
        qs.dequeue();
        qs.dequeue();
        qs.dequeue();
        qs.dequeue();

    }
}
