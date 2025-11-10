package Arrays;

public class LargestElementOfArray {
public static void main(String args[]) {
	int arr[]= {50,40,30,20,10};
	int max=arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];	
	}
	}
	System.out.println(max);
}
}