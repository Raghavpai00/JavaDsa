package problames;

public class maximumNumberOfArray {
public static void main(String args[]) {
	int arr[]= {42, 7, 19, 73, 4, 56, 11, 3, 29};
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}
	System.out.println("maximum number from the array is "+max);
	
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]<min ) {
			min=arr[i];  
		}
	}
	System.out.println("minimum number of array "+min);
}
}
