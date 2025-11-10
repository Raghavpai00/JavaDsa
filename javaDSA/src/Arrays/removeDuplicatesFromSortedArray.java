package Arrays;

public class removeDuplicatesFromSortedArray {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,5,6,6,7,7,8,9,10,10,11};
	int j=0;
	int temp[]=new int[arr.length];
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
		}else {
			System.out.println("duplicate element is : "+arr[i]);
		}
			
	}
	System.out.print("distinct array is ");
	temp[j++]=arr[arr.length-1];
	for(int k=0;k<j;k++) {
		System.out.print(temp[k]+" ");
	}
}
}