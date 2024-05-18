package Q7;

public class FirstNonRepeatingElement {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		int result = findElement(arr, arr.length);
		System.out.println("The First Non Repeating Element is - "+result);
	}

	private static int findElement(int[] arr, int n) {
		for(int i = 0; i< n ; i++) {
			int flag = 0;
			for(int j = i+1; j<n ; j++) {
				if(arr[i]==arr[j]) {
					flag = 1;
				}
				
			}
			if(flag == 0) {
				return arr[i];
			}
		} 
		return 0;
	}
}
