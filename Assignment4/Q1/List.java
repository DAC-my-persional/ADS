package Q1;

public class List {
	
	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List()
	{
		head=null;
		tail=null;
	}
	
	public void display()
	{
//		Node trav= head;
//		System.out.println("List: ");
//		while(trav!=null)
//		{
//			System.out.println(trav.data);
//			trav=trav.next;
//		}
//		System.out.println("");
		
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) {
			
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	public void addFirst(int val)
	{	
		Node newnode= new Node(val);
		if(isEmpty())
		{
			head=tail=newnode;
		}
		else
		{
			
			newnode.next=head;
			head=newnode;
		}
		
	}
	
	public void addLast(int val)
	{
		Node newnode=new Node(val);
		if(isEmpty())
		{
			head=tail=newnode;
		}
		else
		{
			
			tail.next=newnode;
			tail=newnode;
		}
	}
	public void deleteFirst()
	{if(head==tail)
	{
		head=tail=null;
	}
	else if(isEmpty())
		{
			return;
		}
		else
		{
			head=head.next;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}
		else if(head==tail)
		{
			head=tail=null;
		}
		else
		{
			Node trav=head;
			while(trav.next!=tail)
			{
				trav=trav.next;
			}
			trav.next=null;
		}
	}

	public boolean isEmpty()
	{
		return head==null&& tail==null;
	}
	
}
