package Q8;

import java.util.Scanner;

public class RankOfX {
	public static void main(String[] args) {
		int arr[] = {655, 78, 23, 55 , 21, 9 , 55 , 655, 78, 78, 23};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired element - ");
		int element = sc.nextInt();
		int occur = 1;
		int result = SearchElement(arr , arr.length , element , occur);
		if(result == -1) {
			System.out.println(occur+"th Occurance Not Present in the Array!");
		}else {
			System.out.println("Rank of "+ element +" - " + result);
		}
		
	}

 		
	public static int SearchElement(int arr[] , int n , int element , int occur) {
		int count = 0;
		int index = 0;
		for(int i = 0; i< arr.length ; i++) {

			if(arr[i] == element ) {
				count += 1;	
			}	
			if(count == occur) {
				index = i;
				break;
			}
		}
		if(count == 0) {
			index = -1;
		}
		return index;
	}
}
