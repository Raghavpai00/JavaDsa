package Arrays;

public class SmallestElementOfArray {
public static void main(String args[]) {
	int arr[]= {21,89,75,14,25};
	int min=arr[0];
	
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println(min);
}
}
