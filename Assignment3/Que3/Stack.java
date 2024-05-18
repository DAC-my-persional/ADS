package Que3;

public class Stack {
	private int  size;
	private int arr[];
	private int top;
	
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
}
