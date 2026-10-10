package Strings;

import java.util.HashSet;
import java.util.*;

public class longestCommonSubstringWithoutRepeatingChars {
	public static int longest(String str) {
		
		Set <Character> set=new HashSet<>();
		int left=0;
		int maxLength=0;
		
		for(int right=0;right<str.length();right++) {
			while(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			maxLength=Math.max(maxLength,right-left+1);
		}
		return maxLength;
	}
public static void main(String args[]) {
	
	String str="abcdefghiabc";
	System.out.println(longest(str));
}
}
