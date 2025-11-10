package Arrays;
import java.util.*;
public class unionOfTwoArrays {
public static void main(String args[]) {
	int arr1[]= {1,1,2,3,4,4,5};
	int arr2[]= {3,3,4,5,6,7,8};
	Set<Integer> st=new TreeSet<>();
	for(int i=0;i<arr1.length;i++) {
		st.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++) {
		st.add(arr2[i]);
	}
	int union[]=new int[st.size()];
	int i=0;
	for(int x:st) {
		union[i++]=x;
	}
//System.out.print(Arrays.toString(union));
	for(int k=0;k<union.length;k++) {
		System.out.print(union[k]+" ");
	}
}
}
