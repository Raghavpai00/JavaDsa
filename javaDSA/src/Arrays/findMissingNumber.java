package Arrays;
import java.util.*;

public class findMissingNumber {
public static void main(String args[]) {
	
	int arr[]= {4,8,9,7,5,2,1,6};
	int n=arr.length;
	
	HashSet<Integer> set=new HashSet<>();
	
	for(int i=0;i<n;i++) {
		set.add(arr[i]);
	}
	
	for(int i=0;i<n;i++) {
		if(!set.contains(i)) {
			System.out.println("missing numberr is "+i);
			
		}
		
	}
	
}
}
