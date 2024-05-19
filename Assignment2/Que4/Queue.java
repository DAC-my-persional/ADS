package Que4;

import java.util.Arrays;

public class Queue {

	int arr[];
	int rear;
	int front;
	int size;
	
	public Queue(int size)
	{
		this.size=size;
		rear=front=0;
		arr=new int[size];
	}
	public void push(int value)
	{
		if(isFull())
		{
			System.err.println("Array is full!!!!");
		}
		else
		{
			arr[rear]=value;
			rear++;
		}
	}
	public int pop()
	{if(isEmpty())
	{
		System.err.println("Array is empty!!!");
		return -1;
	}
	else
	{
		front++;
		return arr[front-1];
	}
		
	}
	public int peek()
	{
		return arr[front];
	}
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}
		return false;
	}
	public boolean isEmpty()
	{
		return rear==front;
	}
	@Override
	public String toString() {
		return "Queue [arr=" + Arrays.toString(arr) + "]";
	}
	
}
