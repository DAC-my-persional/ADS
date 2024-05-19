package Assignment_1;

import java.util.Scanner;

public class Que8 {
	
	public static int fun(int arr[],int n)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int j;
			
			for( j=0;j<arr.length;j++)
			{
				if(i!=j&&arr[i]==arr[j])
				{
					break;
				}
			}
			if(j==arr.length)
			{
				return arr[i]	;	 }
			
		}
		return -1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("Enter rank:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=fun(arr,arr.length);
	System.out.println("The first rank  is: "+a);
	}

}
