package Arrays;

public class TwoSumProblame {
public static void main(String args[]) {
	int[] arr = {2, 7, 11, 15, 8, 3};
	int target=10;
	int n=arr.length;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j) {
				continue;
			}
			if(arr[i]+arr[j]==target) {
				System.out.println("yes it is 2 sum "+i+","+j+" is index and "+arr[i]+"+"+arr[j]+"="+target);
			}
		}
		//break;
	}
}
}
