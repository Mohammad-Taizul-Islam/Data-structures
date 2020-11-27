public class Queue {
    int []arr=null;
    int capacity=5;
    int front=0;
    int rear=-1;
    public Queue()
    {
        this.arr=new int[capacity];
    }
    public Queue(int capacity)
    {
        this.capacity=capacity;
        this.arr=new int[capacity];
    }
    public void enqueue(int data)
    {
        if(isFull())
        {
            System.err.println("Queue is full can't insert");
            return;
        }
        arr[++rear]=data;
        System.out.println(data +" Enqueued into the queue ");

    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.err.println("Queue is empty");
            return;
        }
        int data=arr[front];
        for (int i=front;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear--;
        System.out.println(data + " Dequeue from the queue");
    }
    public int size()
    {
        return rear+1;
    }
    public boolean isFull()
    {
        return size()==capacity;
    }
    public boolean isEmpty()
    {
        return front==size();
    }
}
