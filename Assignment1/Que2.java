package Assignment_1;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
	int p=n;
		int rem,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			
			n=n/10;
			
		}
		if(p==sum)
		{
			System.out.println("is a pallindrome");
		}
		else
		{
			System.out.println("not a pallindrome");
		}
		
	}

}
