package Strings;

import java.util.*;

public class LongestCommonPrefix {
	public static String LongestCommonPrefix(String strs[]) {
		  Arrays.sort(strs);
		String str1=strs[0];
		String str2=strs[strs.length-1];
		int index=0;
		for(int i=index;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				index++;
			}
			else {
				 break;
			}
			
		}
		return index==0?" ":str1.substring(0,index);	
		}
public static void main(String args[]) {
	 String strs[]= {"flower","flow","fliht"};
	 System.out.println(LongestCommonPrefix(strs));
	
}
}
