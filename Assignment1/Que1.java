package Assignment_1;

import java.util.Scanner;

public class Que1 {
	
	public static int linearSearchFun(int arr[],int n,int key)
	{int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				count=i;
			}
		}
		if(count>0)
		{
			return count;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[] = {12,33,12,90,34};
		System.out.println("Enter key to find:");
		int key=sc.nextInt();
		int k=linearSearchFun(arr,arr.length,key);
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


