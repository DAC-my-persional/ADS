package Assignment_2;

import java.util.Arrays;

public class Que2 {

	public static int  insertionSort(int arr[],int n)
	{ int cmpr=0;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<temp)
			{   cmpr++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return cmpr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,8,9};
		System.out.println("Array before sorting: "+Arrays.toString(arr));
		int cmpr=insertionSort(arr,arr.length);
		System.out.println("comparison are: "+cmpr);
		System.out.println("Array after sorting: "+Arrays.toString(arr));
		
		
	}

}
