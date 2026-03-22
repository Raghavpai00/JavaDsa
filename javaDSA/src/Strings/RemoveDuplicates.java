package Strings;

public class RemoveDuplicates {
public static void main(String args[]) {
	 String str="programing";
	 char arr[]=str.toCharArray();
	 StringBuilder sb=new StringBuilder();
	 for(int i=0;i<arr.length;i++) {
		 boolean isRepeated=false;
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]) {
				 isRepeated=true;
				 break;
			 }
		 }
		 if(!isRepeated) {
			 sb.append(arr[i]);
		 }
	 }
	 System.out.println(sb);
}
}
