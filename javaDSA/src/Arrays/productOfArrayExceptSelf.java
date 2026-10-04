package Arrays;

public class productOfArrayExceptSelf {
public static void main(String args[]) {
	int arr[]= {1,2,3,4};
	int n=arr.length;
	int total=1;
	int temp[]=new int[n];
	
	for(int i=0;i<n;i++) {
		total*=arr[i];
	}
	for(int i=0;i<n;i++) {
		temp[i]=total/arr[i];
	}
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]);
	}
}
}
