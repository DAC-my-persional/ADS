package Emp;

public class List {
	
	public static class Node
	{
		private Emp data;
		private Node next;
		
		public Node(Emp e)
		{
			data=e;
			next=null;
		}
	}
	
	private Node head;
	
	public List()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void deleteAll()
	{
		head=null;
	}
	public void add(Emp e)
	{
		Node nn= new Node(e);
		
		
		nn.next=head;
		head=nn;
		
	}
	public void display()
	{
		Node trav=head;
		System.out.println("List of Employees: ");
		while(trav!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
	public Emp searchByName(String name)
	{
		Node trav= head;
		
		
		while(trav!=null)
		{	
			if(trav.data.getName().equals(name))
			{
				return trav.data;
			}
			else
			{
				trav=trav.next;
			}
			
		}
		return null;
	}
	public int updateSal(int id,double sal)
	{
		Node trav=head;
		while(trav!=null)
		{
			if(trav.data.getEmpId()==id)
			{
				trav.data.setSalary(sal);
				return 1;
			}
			else
			{
				trav=trav.next;
			}
		}
		return -1;
	}
	public int deleteEmp(int id)
	{
		Node trav=head;
		if(isEmpty())
		{
			return -1;
		}
		if(trav.data.getEmpId()==id)
		{
			System.out.println("hello");
			head=null;
			return 1;
		}
		while(trav.next!=null)
		{
			if(trav.next.data.getEmpId()==id)
			{
				trav.next=trav.next.next;
				return 1;
			}
			else
			{
				trav=trav.next;
			}
		}
		return -1;
	}
}
