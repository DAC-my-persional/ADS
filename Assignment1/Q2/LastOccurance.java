package Q2;

import java.util.Scanner;

public class LastOccurance {

	public static void main(String[] args) {
		int arr[] = {655, 78, 23, 78, 23, 655, 55, 21, 9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired element - ");
		int element = sc.nextInt();
		
		int result = SearchElement(arr , arr.length , element);
		System.out.println("The Desired element is at the index - " + result);
		
	}
 		
	public static int SearchElement(int arr[] , int n , int element) {
		
		for(int i = arr.length-1; i> 0 ; i--) {
			if(element == arr[i]) {
				return i;
			}	
		}
		return -1;
	}

}
