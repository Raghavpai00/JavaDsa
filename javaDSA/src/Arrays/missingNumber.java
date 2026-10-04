package Arrays;

import java.util.HashSet;

public class missingNumber {
public static void main(String args[]) {
int arr[]= {1,2,3,5,7,8};
int n=8;

HashSet <Integer>set=new HashSet<>();

for(int num:arr) {
	set.add(num);
}
for(int i=1;i<n;i++) {
	if(!set.contains(i)) {
		System.out.println("missing number is: "+i);
	}
}
}
}
