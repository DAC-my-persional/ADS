package Q3;

import java.util.Scanner;

public class BinarySearch {
	static int count =0;
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired element - ");
		int element = sc.nextInt();
		int result = SearchElement(arr ,arr.length,element, 0 , arr.length-1);
		System.out.println("Total Comparisons  - " + result);
		
	}
	
	
	public static int SearchElement(int arr[] , int n, int element , int left, int right) {
			
		count+=1;
			if(left > right) {
				return -1;
			}
			int mid = (right+left)/2;
			if(arr[mid] == element) {
				return count;
			}else if(arr[mid]>element) {
				return SearchElement(arr, n, element, left, mid-1);
				
			}else {
				return SearchElement(arr, n, element, mid+1, right);
			}
		
	}

}
