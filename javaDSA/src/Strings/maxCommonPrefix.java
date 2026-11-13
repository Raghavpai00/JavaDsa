package Strings;
import java.util.*;
public class maxCommonPrefix {
public String longestCommonPrefix(String[]str) {
	StringBuilder sb=new StringBuilder();
	Arrays.sort(str);
	
	char[]first=str[0].toCharArray();
	char[]last=str[str.length-1].toCharArray();
	
	for(int i=0;i<first.length;i++) {
		if(first[i]!=last[i]) 
			break;
		sb.append(first[i]);
	
	}
	return sb.toString();
}
	
	public static void main(String args[]) {
		 maxCommonPrefix obj=new  maxCommonPrefix();
		 String str[]= {"clap","clove","club"};
		 System.out.println(obj.longestCommonPrefix(str));
}
}
