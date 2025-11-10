package Arrays;

public class numberThatAppearOnce {
public static void main(String args[]) {
	
	int arr[]= {2, 3, 5, 3, 2, 4, 5};
	int count;
	for(int i=0;i<arr.length;i++) {
	count=0;
	for(int j=0;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
		}
	}
	
	if(count==1) {
		System.out.println("the single time occured number is:"+arr[i]);
	}
	}
}
}
