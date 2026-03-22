package Strings;

import java.util.*;

public class occurenceOfCharecter {
public static void main(String args[]) {
	String str="raghav";
	Map<Character,Integer> map=new HashMap();
	 
	char arr[]=str.toCharArray();
	for(char ch:arr) {
		if(! map.containsKey(ch)) {
			map.put(ch,1);
		}else {
			int value=map.get(ch);
			map.put(ch,value+1);
			
		}
	}
	System.out.println(map);
}
}
 