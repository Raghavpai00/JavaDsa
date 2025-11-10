package Arrays;

public class moveAllZerosAtTheEndOfArray {
public static void main(String args[]) {
	int arr[]= {1,4,7,0,2,3,5,0,1,4,9,3,0};
	int n=arr.length;
	int j=0;
	int temp[]=new int[n];
	
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			temp[j++]=arr[i];
		}
	}
	while(j<n) {
		temp[j++]=0;
	}
	for(int i=0;i<j;i++) {
		System.out.print(temp[i]+" ");
	}
}
}
