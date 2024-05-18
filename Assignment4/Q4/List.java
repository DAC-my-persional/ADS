package Q4;

public class List {

	public static  class Node
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
	
	public void display()
	{
		Node trav= head;
		System.out.println("List:: ");
		while(trav!=null)
		{
			System.out.println(" "+trav.data);
			trav=trav.next;
		}
		System.out.println("");
		
	}
	
	public void addFirst(int value)
	{
		Node nn = new Node(value);
		nn.next=head;
		head= nn;
	}
	public void addLast(int value)
	{
		Node nn= new Node(value);
		Node trav=head;
		while(trav.next!=null)
		{
			trav=trav.next;
		}
		
		trav.next=nn;
	}
	public void deleteFirst()
	{
		head=head.next;
	}
	public void deleteLast()
	{
		Node trav=head;
		while(trav.next.next!=null)
		{
			trav=trav.next;
			
		}
		trav.next=null;
	}
	public void addPos(int val,int pos)
	{	Node nn= new Node(val);
		if(isEmpty())
		{
			head=nn;
		}
		else if(pos<=1)
		{
			addFirst(val);
		}
		else
		{
			Node trav=head;
			for(int i=1;i<pos-1&& trav.next!=null;i++)
			{
			trav=trav.next;	
			}
			nn.next=trav.next;
			trav.next=nn;
			
		}
	}
	public void deletePos(int pos)
	{
		if(isEmpty())
		{
			return;
		}
		else if(pos<=1)
		{
			deleteFirst();
		}
		else
		{
			Node trav=head;
			for(int i=1;i<pos-1&&trav.next.next!=null;i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;
			
		}
	}
	public void reverseDisplay()
	{   System.out.println("Reverse list");
		rDisplay(head);
		System.out.println("");
	}
	public void forwardDisplay()
	{   System.out.println("Forward list");
		fDisplay(head);
		System.out.println("");
	}
	public void rDisplay(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		rDisplay(trav.next);
		System.out.println(trav.data);
	}
	public void fDisplay(Node trav)
	{
		if(trav==null)
		{
			return;
		}
		System.out.println(trav.data);
		fDisplay(trav.next);
	}
	public void reverseList()
	{
		Node t1=head;
		Node t2=head.next;
		while(t2!=null)
		{
			Node t3=t2.next;
			t2.next=t1;
			t1=t2;
			t2=t3;
		}
		head.next=null;
		head=t1;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void deleteAll()
	{
		head=null;
	}
	
	
}
