package Assignment_1;

import java.util.Scanner;

public class Que3A {
	
	public static int binarySearchFun(int arr[],int left,int right,int key)
	{	int mid;
	int c=0;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==key)
			{c++;
			System.out.println(c);
				return mid;
			}
			else if(arr[mid]<key)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[] = {12,33,88,90,34};
		System.out.println("Enter key to find:");
		int key=sc.nextInt();
		int left=0,right=arr.length-1;
		int k=binarySearchFun(arr,left,right,key);
		if(k!=-1)
		{
			System.out.println("element is at "+k);
		}
		else
		{
			System.out.println("element not found!!!");
		}
		
	}
}
