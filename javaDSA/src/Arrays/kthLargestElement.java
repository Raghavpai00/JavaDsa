package Arrays;

public class kthLargestElement {
public static void main(String args[]) {
	 
	int arr[]= {45,78,95,47,65,20,14,47,69};
	System.out.println("The orignal array is:");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i] +",");
	}
	int temp=0;
	int k=3;
	//SORTING BY DESC
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println();
	System.out.println("the sorted array is:");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+",");
	}
	System.out.println();
	System.out.println("the "+k+" th largest element of array is "+arr[k-1]);
}
}
