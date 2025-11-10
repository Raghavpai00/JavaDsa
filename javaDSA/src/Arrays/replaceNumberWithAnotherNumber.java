package Arrays;

public class replaceNumberWithAnotherNumber {
public static void main(String args[]) {
	int arr[]= {1,23,25,45,98,7,6,7,8};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==7) {
			arr[i]=0;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
}
}
