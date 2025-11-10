package Arrays;

public class LinearSearch {
public static void main(String args[]) {
	int arr[]={4,5,6,8,9,12,56,47,89};
	 int num=56;
	 boolean found=false;
	 
	 for(int i=0;i<=arr.length-1;i++) {
		 if(arr[i]==num) {
			 found=true;
			 System.out.print("the "+num+" is present at index:"+i);
		 }
	 }if(found!=true) {
		 System.out.print("-1");
	 }
}
}
