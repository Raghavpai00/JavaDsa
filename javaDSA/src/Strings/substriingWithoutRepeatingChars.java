package Strings;
import java.util.HashSet;
import java.util.Set;

public class substriingWithoutRepeatingChars {
	public static String longest(String str) {
		int left=0;
		int maxLength=0;
		int startIndex=0;
		
		Set <Character>set=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(i));
			
			int length=i-left+1;
			if(length>maxLength) {
				maxLength=length;
				startIndex=left;
			}
		}
		return "maxLength is: "+maxLength+" substring is: "+str.substring(startIndex,startIndex+maxLength);
	}
public static void main(String args[]) {
	 String str = "abcdefghiabcjklmnopqrstuv";
     System.out.println(longest(str));
}
}
