package Q3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {655, 78, 23, 55 , 21, 9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired element - ");
		int element = sc.nextInt();
		
		int result = SearchElement(arr , arr.length , element);
		System.out.println("Total comparisions - " + result);
		
	}
 		
	public static int SearchElement(int arr[] , int n , int element) {
		int count = 0;
		for(int i = 0; i< arr.length ; i++) {
			count += 1;
			if(element == arr[i]) {
				break;
			}	
			
		}
		return count;
	}

}
