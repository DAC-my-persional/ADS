package Emp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e;
		List l1=new List();
		Scanner sc= new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 to Add a employee");
			System.out.println("Enter 2 to display employees: ");
			System.out.println("Enter 3 to employee by name: ");
			System.out.println("Enter 4 to update salary");
			System.out.println("Enter 5 to delete by id");
			System.out.println("Enter choice: ");
			
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thankyou");
				break;
			case 1:
				e=new Emp();
				e.accept(sc);
				l1.add(e);
				break;
			case 2:
				l1.display();
				break;
			case 3:
				System.out.println("Search by name");
				System.out.println("Enter name :");
				String name=sc.next();
				e=l1.searchByName(name);
				System.out.println(e);
				break;
			case 4:
				System.out.println("Update sal: ");
				System.out.println("Enter emp id: ");
				int id=sc.nextInt();
				System.out.println("Enter sal to update: ");
				double sal=sc.nextDouble();
				int i=l1.updateSal(id, sal);
				if(i==1)
				{
					System.out.println("Updated successFully");
				}
				else
				{
					System.out.println("id not found!!!!");
				}
				break;
			case 5:
				System.out.println("Enter id to delete: ");
				int id1=sc.nextInt();
				int i1=l1.deleteEmp(id1);
				if(i1==1)
				{
					System.out.println("deleted successFully");
				}
				else
				{
					System.out.println("id not found!!!!");
				}
				
				
				break;
			}
		}
		while(choice!=0);
	}

}
