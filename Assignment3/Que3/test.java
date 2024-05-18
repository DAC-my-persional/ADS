package Que3;

import java.util.Scanner;

public class test {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Stack st= new Stack(size);
		
		for(int i=0;i<size;i++)
		{
			st.push(arr[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			arr[i]=st.pop();
		}
		
		for(int a:arr)
		{
			System.out.println("The element is: "+a);
		}
		
	}
}
