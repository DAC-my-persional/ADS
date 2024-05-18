package Q3;

public class Queue {
	
	private int rear;
	private int front;
	private int size;
	private int arr[];
	private int count=0;
	
	public Queue(int size)
	{
		this.size=size;
		arr=new int[size];
		rear=front=-1;
	}
	
	public void push(int value)
	{
		rear=(rear+1)%size;
		arr[rear]=value;
		count++;
	}
	public int  pop()
	{
		int data=arr[(front+1)%size];
		front=(front+1)%size;
		if(front==rear)
		{
			front=rear=-1;
		}
		count--;
		return data;
	}
	public int peek()
	{
		return arr[(front+1)%size];
	}
	public boolean isEmpty()
	{
		return rear==front&& rear==-1;
	}
	public boolean isFull()
	{
		return ((rear==size-1&&front==-1)||(rear==front&& rear!=-1));
	}
	
	public void displayCount()
	{
		System.out.println("count: "+count);
	}
	
	
	
	
	
}
