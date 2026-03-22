package Strings;

import java.util.Arrays;

public class replaceCharWithItsOccurence {
public static void main(String args[]) {
	String input="opentext";
	char charToReplace='t';

	 char str[]=input.toCharArray();
	 int count=1;
	for(int i=0;i<str.length;i++) {
		if(str[i]==charToReplace) {
			str[i]= String.valueOf(count).charAt(0);
			count++;
		}
	} 
	//System.out.println(Arrays.toString(str));
	System.out.println(str);
}
}
