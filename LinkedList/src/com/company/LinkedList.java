package com.company;

public class LinkedList {

    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }

    Node head;
    Node tail;
    int size=0;
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
        System.out.println(this);
    }
    public void add(int data,int index)
    {
        if(index<0||index>(size-1))
        {
            System.out.println("Index out of range........");
            return;
        }
        Node cur=head;
        Node pre=null;
        int i=0;
        while (cur!=null && i!=index)
        {
            pre=cur;
            cur=cur.next;
            i++;
        }
        Node newNode=new Node(data);
        if (pre==null)
        {
            newNode.next=head;
            head=newNode;
        }else {
            pre.next=newNode;
            newNode.next=cur;
        }
        size++;
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        Node cur=head;
        while (cur!=null)
        {
            sb.append(cur.data).append(",");
            cur=cur.next;
        }
        if(sb.length()>1)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------------");
        LinkedList ll=new LinkedList();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(01,0);
        ll.add(88,1);
        ll.add(77,4);
       // System.out.println(ll);
    }
}
