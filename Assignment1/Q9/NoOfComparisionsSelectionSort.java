package Q9;

import java.util.Arrays;

public class NoOfComparisionsSelectionSort {
	public static void main(String[] args) {
		
		int arr[] = {655, 78, 23, 55 , 21, 9};
		System.out.println("Unsorted Array-"+Arrays.toString(arr));
		int comparisions = sortSelection(arr , arr.length);
		System.out.println("Nummber of Comparisions - " + comparisions);
	}

	public static int sortSelection(int[] arr, int n) {
		int count = 0;
		for(int i = 0; i < n-1 ; i++ ) {
			for(int j = i+1; j<n; j++) {
				count += 1;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		System.out.println("Sorted Array-"+Arrays.toString(arr));
		
		return count;
	}
}
