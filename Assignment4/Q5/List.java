package Q5;

public class List {
	
	public static class Node
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
	public List()
	{
		head=null;
	}
	public void add(int value)
	{
		Node nn= new Node(value);
		if(head==null)
		{
			head=nn;
		}
		else if(head.data>value)
		{
			nn.next=head;
			head=nn;
		}
		else
		{
			Node trav=head;
			while(trav.next!=null&&trav.next.data<value)
			{
				trav=trav.next;
			}
			nn.next=trav.next;
			trav.next=nn;
			
		}
	}
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
}
