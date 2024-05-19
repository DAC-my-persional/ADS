package Assignment_2;

import java.util.Arrays;

public class Que3 {

	public static void insertionSort(Employee arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			Employee temp=arr[i];
			int j=i-1;
			while(j>=0&& arr[j].salary>temp.salary)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[] = {new Employee(1,"Anil",20000.0), new Employee(2,"Kriti",25000.00),new Employee(3,"Sumit",40000.00)};
		insertionSort(arr,arr.length);
		System.out.println("Sorted array on the basis of salary: "+Arrays.toString(arr));
	}

}

class Employee{
	int empid;
	String name;
	double salary;
	
	public Employee() {}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}