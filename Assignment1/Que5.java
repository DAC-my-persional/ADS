package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Que5 {
	
	public static int binarySearchFunRec(int arr[],int left,int right,int key)
	{
		if(left>right)
			return -1;
		int mid=(left+right)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(arr[mid]>key)
		{
			return binarySearchFunRec(arr,left,mid-1,key);
		}
		else
		{
			return binarySearchFunRec(arr,mid+1,right,key);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter elements of an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int passes=0,compr=0;
		
		//bubble sort
		
		for(int i=0;i<n-1;i++)
		{passes++;
			for(int j=0;j<n-i-1;j++)
			{ compr++;
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("passes: "+passes);
		System.out.println("compr: "+compr);
		System.out.println("array after bubble sorting: "+Arrays.toString(arr));
		
		System.out.println("Enter key to find: ");
		int key=sc.nextInt();
		int left=0,right=n-1;
		int k=binarySearchFunRec(arr,left,right,key);
		
		
		if(k!=-1)
		{
			System.out.println("Element found at index "+k);
		}
		else
		{
			System.out.println("element not found!!!");
		}
	}

	}


