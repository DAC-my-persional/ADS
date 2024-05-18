package Q5;

import java.util.Scanner;

public class BinarySearchDescending {

	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired element - ");
		int element = sc.nextInt();
		int result = binarySearch(arr ,arr.length,element);
		System.out.println("Index of the Element - " + result);
		
	}
	
	public static int binarySearch(int arr[], int N, int key) {
		
		int left = 0, right = N-1, mid;
		while(left <= right) {
			
			mid = (left + right)/2;
			if(key == arr[mid])
				return mid;
			else if(key > arr[mid])
				right = mid - 1;	
			else
				left = mid + 1;
		}
		return -1;
	}

}
