package Arrays;

public class moveAllZerosAtTheStartOfTheArray {
public static void main(String args[]) {
	
	 int arr[]={1,2,0,3,4,0,6,0,1,4,8,0,1,7,9};
	 int n=arr.length;
	 int j=n-1;
	 int temp[]=new int[n];
	 
	 for(int i=n-1;i>=0;i--) {
		 if(arr[i]!=0) {
			 temp[j--]=arr[i];
		 }
	 }
	 
	 for(int i=0;i<n;i++) {
		 System.out.print(temp[i]+" ");
	 }
}
}
