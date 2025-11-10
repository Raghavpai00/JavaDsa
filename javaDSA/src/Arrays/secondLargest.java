package Arrays;

public class secondLargest {
public static void main(String args[]) {
	int arr[]= {67,89,45,12,04,69,48,93,21,85};
	
	int max=Integer.MIN_VALUE;
	int smax=Integer.MIN_VALUE;
	
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			smax=max;
			max=arr[i];
		}else if(arr[i]>smax && arr[i]!=max) {
			smax=arr[i];
		}
	}
	System.out.println("the largest element is "+max);
	if(smax==Integer.MIN_VALUE) {
		System.out.println("second largest is not present");
	}else {
		System.out.println("second largest is "+smax);
	}
	
}
}
