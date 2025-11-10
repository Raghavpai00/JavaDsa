package Arrays;

public class MejorityElements {
public static void main(String args[]) {
	int arr[]= {7, 0, 0, 1, 7, 7, 2, 7, 7};
	int maxCount=0;int n=arr.length;int mejority=0;
	
	for(int i=0;i<n;i++) {
		int count=0;
		for(int j=0;j<n;j++) {
			if(arr[j]==arr[i]) 
				count++;
			}
			if(count>maxCount) {
				maxCount=count;
				mejority=arr[i];
			}
		}
	System.out.println("mejority element is "+mejority+" with occurence of "+maxCount +" times "+" in "+n+" size array");
	}
}

