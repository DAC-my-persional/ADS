package Que1;

public class Stack1 {
	private int size;
	private int top;
	private int arr[];
	
	
	public Stack1(int size)
	{
		this.size=size;
		arr= new int[size];
		top=size;
	}
	
	public void push(int value)
	{
		top--;
		arr[top]=value;
	}
	
	public int pop()
	{
		return arr[top++];	
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isFull()
	{
		return top==0;
	}
	
	public boolean isEmpty()
	{
		return top==size;
	}
	
}
