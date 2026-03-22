package Strings;

public class sortTheString {
public static void main(String args[]) {
	String str="programing";
	char temp;
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(new String(arr));
	System.out.println(arr);
}
}
