package Arrays;

public class FindMissingNumInAnArray {
public static void main(String arg[]) {
	int arr[]= {1,2,3,4,5,6,7,9,10};
	int n=10;
	for(int i=1;i<n;i++) {
		if(i!=arr[i]){
		System.out.println(i+" :is not present in array");		
		}
	}
	}
}
