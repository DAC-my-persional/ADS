package Assignment_1;

import java.util.Scanner;

public class Que3 {
	
	public static int linearSearchFun(int arr[],int n,int key)
	{int compr=0,c=0;
		for(int i=0;i<n;i++)
		{compr++;
			if(arr[i]==key)
			{
				c=i;
				break;
			}
		}
		if(c>0)
		{
			System.out.println("no. of comparison: "+compr);
			return c;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[] = {12,33,88,90,34};
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
