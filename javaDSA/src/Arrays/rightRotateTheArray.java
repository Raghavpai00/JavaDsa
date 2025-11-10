package Arrays;

public class rightRotateTheArray {
public static void main(String args[]) {
	
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	 int d=4;
	 int n=arr.length;
	 d=d%n;
	 int temp[]=new int[d];
	  
	 for(int i=0;i<d;i++) {
		 temp[i]=arr[n-d+i];
	 }for(int i=n-1;i>=d;i--) {
		 arr[i]=arr[i-d];
	 }for(int i=0;i<d;i++) {
		 arr[i]=temp[i];
	 }for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 
}
}
