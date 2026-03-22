package coding;

public class ContainsDuplicate {
	
	public static boolean isContainDuplicates(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int arr[]= {4,1,2,3,4};
		System.out.println(isContainDuplicates(arr));
	}
}
