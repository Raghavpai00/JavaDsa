package Arrays;

public class checkIfArrayIsSortedOrNot {
public static void main(String args[]) {
	
	int arr[]= {10,10,20,30,30,40,50,60,70,70,80,90,100};
	boolean isSorted=true;
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]<arr[i-1]) {
			isSorted=false;
			break;
		}
	}
	System.out.println(isSorted);
}
}
