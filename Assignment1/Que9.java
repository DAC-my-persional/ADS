package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Que9 {

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
		
		for(int i=0;i<n-1;i++)
		{passes++;
			for(int j=i+1;j<n;j++)
			{compr++;
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("passes: "+passes);
		System.out.println("compr: "+compr);
		System.out.println("array after selection sorting: "+Arrays.toString(arr));
	}

}
