package Assignment_1;

import java.util.Scanner;

public class Que6 {
	public static int linearSearchFun(int arr[],int n,int key,int l)
	{int count=0,c=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				if(c==l)
					{
					count=i+1;
					}
				c++;
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
		int arr[] = {12,33,12,12,34};
		System.out.println("Enter key to find:");
		int key=sc.nextInt();
		System.out.println("Enter nth occurence:");
		int l=sc.nextInt();
		int k=linearSearchFun(arr,arr.length,key,l);
		k=k-1;
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
