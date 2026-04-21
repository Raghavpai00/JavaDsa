package codingAssesmentProblames;

public class productOfArrayExceptSelf {
public int[] productExceptSelf(int nums[]) {
	
	int n=nums.length;
	int []prefixProductFromStart=new int[n];
	int []prefixProductFromEnd=new int[n];
	int []res=new int[n];
	
	prefixProductFromStart[0]=nums[0];
	for(int i=1;i<n;i++) {
		prefixProductFromStart[i]=prefixProductFromStart[i-1]*nums[i];
		
	}
	prefixProductFromEnd[n-1]=nums[n-1];
	for(int i=n-2;i>=0;i--) {
		prefixProductFromEnd[i]=prefixProductFromEnd[i+1]*nums[i];
	}
	res[0]=prefixProductFromEnd[1];
	res[n-1]=prefixProductFromStart[n-2];
	for(int i=1;i<n-1;i++) {
		res[i]=prefixProductFromStart[i-1]*prefixProductFromEnd[i+1];
	}
return res;
}
public static void main(String args[]) {
	productOfArrayExceptSelf  ps=new productOfArrayExceptSelf ();
	int nums[]= {1,2,3,4};
	int result[] = ps.productExceptSelf(nums);

    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + ",");
    }
}
}