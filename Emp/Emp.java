package Emp;

import java.util.Objects;
import java.util.Scanner;

public class Emp {
	
	private int empId;
	private String name;
	private double salary;
	
	public Emp()
	{
		
	}

	public Emp(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
	public void accept(Scanner sc)
	{
		System.out.println("Enter empid: ");
		empId=sc.nextInt();
		System.out.println("Enter emp name: ");
		name=sc.next();
		System.out.println("Enter emp salary: ");
		salary=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empId == other.empId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	
}
