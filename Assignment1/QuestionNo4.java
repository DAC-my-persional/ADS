import java.util.*;

class Empolyee{
	private int empid;
	private String name;
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Empolyee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public Empolyee() {

	}
	public void accept(Scanner sc) {
		System.out.println("Enter Employee Id: ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name=sc.next();
		System.out.println("Enter Employee Salary: ");
		salary=sc.nextDouble();
	}
	public void display() {
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+name);
		System.out.println("Enter Employee Salary: "+salary);
	}
}


public class QuestionNo4 {
	
	public static int SearchbyEmployeeId(Empolyee arr[],int key){
		for(int i=0;i<arr.length;i++) {
		if(arr[i].getEmpid()==key) 
			return i;	
		}
		return -1;
	}
	public static int SearchbyName(Empolyee arr[],String key){
		for(int i=0;i<arr.length;i++) {
		if(arr[i].getName().equals(key)) 
			return i;	
		}
		return -1;
	}
	public static int SearchbySalary(Empolyee arr[],Double key){
		for(int i=0;i<arr.length;i++) {
		if((Double.compare(arr[i].getSalary(), key))==0)
			return i;	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Empolyee e[]=new Empolyee[5];
		
				
		Empolyee arr[] = new Empolyee[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Empolyee();
			arr[i].accept(sc);
		    
		}
		int choice;
		
		do {
		Category cat;
		Category[] V=Category.values();
		for (Category category : V) {
			System.out.println(category.ordinal()+". "+category.name());
		}
		
		System.out.println("Enter your choice :");
		choice=sc.nextInt();
		switch (choice) {
		case 0:
			System.out.println("Thank You!!!");
			break;
		case 1:
		{
			System.out.println("enter Id that you want to search :");
			int key=sc.nextInt();
			int x=SearchbyEmployeeId(arr, key);
			if(x==-1)
				System.out.println("ID is not found!");
			System.out.println("ID is found at index :"+x);
		}
			break;
		case 2:
		{
			System.out.println("Enter Name of Employee :");
			String name=sc.next();
			int x=SearchbyName(arr, name);
			if(x==-1)
				System.out.println("Name is not found!");
			System.out.println("Name is found at index :"+x);
		}
			break;
		case 3:
		{
			System.out.println("Enter Name of Employee :");
			double salary=sc.nextDouble();
			int x=SearchbySalary(arr, salary);
			if(x==-1)
				System.out.println("Salary is not found!");
			System.out.println("Salary is found at index :"+x);
		}
			break;
		default:
			break;
		}
	}while(choice!=0);
		}

}
