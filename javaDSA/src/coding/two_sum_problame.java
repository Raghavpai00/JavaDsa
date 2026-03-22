package coding;

public class two_sum_problame {
public static void main(String args[]) {
	int arr[]= {2, 7, 11, 15, 8, 3};
	int n=arr.length;
	int target=10;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j) {
				break;
			}
			if(arr[i]+arr[j]==target) {
				System.out.println("yes it is 2 sum "+arr[i]+"+"+arr[j]+"="+target);
			}
		}
	}
}
}
