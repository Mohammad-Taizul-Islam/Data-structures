package com.company;

public class Main {
    int []array=new int[50];
    int arraySize=10;
    public void generateRandomArray()
    {
        for (int i=0;i<arraySize;i++)
        {
            array[i]=(int)(Math.random()*10)+10;
        }
    }
    void printArray()
    {
        for (int i=0;i<arraySize;i++)
        {
            System.out.println("Index = " +i +" number = "+array[i]);
        }
    }
    public int getValueAtIndex(int index)
    {
        if (index<arraySize) return array[index];
        return 0;
    }
    public boolean doesArrayContainsThisValue(int searchValue){
        boolean valueInArray=false;
        for (int i=0;i<arraySize;i++)
        {
            if(array[i]==searchValue)
            {
                valueInArray=true;
            }
        }
        return valueInArray;
    }
    public void deleteIndex(int index)
    {
        if(index<arraySize)
        {
            for (int i=index;i<arraySize-1;i++)
            {
                array[i]=array[i+1];
            }
            arraySize--;
        }
    }
    public void insertValue(int data){
        if(arraySize<array.length)
        {
            array[arraySize++]=data;
        }
    }
    public void linearSearchForValue(int value){
        boolean valueInArray=false;
        String valueWithIndex="";
        System.out.println("Value finding in the following :");
        for (int i=0;i<arraySize;i++)
        {
            if(array[i]==value)
            {
                valueInArray=true;
                valueWithIndex+=i;
            }
        }
        if(!valueInArray)
        {
            System.out.println("None");
        }else {
            System.out.println(valueWithIndex);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main aMain=new Main();
        aMain.generateRandomArray();
        aMain.printArray();
        System.out.println(aMain.getValueAtIndex(3));
        System.out.println(aMain.doesArrayContainsThisValue(13));
        aMain.deleteIndex(1);
        aMain.printArray();
        aMain.insertValue(34);
        aMain.printArray();
        aMain.linearSearchForValue(17);

    }
}
