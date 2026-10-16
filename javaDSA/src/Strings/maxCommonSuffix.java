package Strings;
import java.util.*;
public class maxCommonSuffix {
	public String maxCommonPrefix(String strs[]) {
		Arrays.sort(strs);
		
		StringBuilder sb=new StringBuilder();
		
		char[]first=strs[0].toCharArray();
		char[]last=strs[strs.length-1].toCharArray();
		
		for(int i=0;i<first.length;i++) {
			if(first[i]!=last[i])
				break;
			sb.append(first[i]);
		}
		return sb.toString();
	}
public static void main(String args[]) {
	 maxCommonSuffix mcs=new maxCommonSuffix();
	 String strs[]= {"flower","flown","flown"};
	 System.out.println(mcs.maxCommonPrefix(strs));
}
}
