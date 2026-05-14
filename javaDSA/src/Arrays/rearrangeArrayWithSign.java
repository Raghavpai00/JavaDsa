package Arrays;

public class rearrangeArrayWithSign {
	public static int[] rearrange(int arr[]) {
		int n=arr.length;
		int ans[]=new int[n];
		
		int posIndex=0;
		int negIndex=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				ans[posIndex]=arr[i];
				posIndex+=2;
			}else {
				ans[negIndex]=arr[i];
				negIndex+=2;
			}
		}
		return ans;
	}
	
	
public static void main(String args[]) {
	int arr[] = {1, 2, -4, -5};
	int []result=rearrange(arr);
	
	for(int nums:result) {
		System.out.print(nums+"  ");
	}
	
}
}
