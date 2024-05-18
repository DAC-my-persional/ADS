package Que2;

import java.util.Arrays;

public class Stack {

	private int size;
	private int top;
	private int max;
	private int arr[];

	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
	    top=-1;
		
	}
	
	public void push(int value)
	{
		top++;
		
		arr[top]=value;
		
		if(max<=value)
		{
			max=value;
		}
	}
	
	public int pop()
	{
	return arr[top--];
		
	}
	
	public int peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public int maxItem()
	{
		return max;
	}
	public void displayArr()
	{
		System.out.println("the greatest element is: "+max);
	}
}
