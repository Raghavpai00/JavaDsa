package Arrays;

import java.util.Arrays;

public class nextPermutationAlgorithm {
public static void nextPermutation(int arr[]) {
	int n=arr.length;
	
	// Step 1: Find break point
	int index=-1;
	
	for(int i=n-2;i>=0;i--) {
		if(arr[i]<arr[i+1]) {
			index=i;
			break;
		}
	}
	 // Step 2: If no break point, reverse whole array
	if(index==-1) {
		reverse(arr,0,n-1);
		return;
	}
	 // Step 3: Find next greater element and swap
	for(int i=n-1;i>0;i--) {
		if(arr[i]>arr[index]) {
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
			break;
		}
	}
	 // Step 4: Reverse remaining part
	reverse(arr,index+1,n-1);
}
	//Reverse function
public static void reverse(int arr[],int start,int end) {
	while(start < end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		start++;
		end--;
	}
}
	public static void main(String args[]) {
		int arr[]= {3,2,1};
		nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}
}
