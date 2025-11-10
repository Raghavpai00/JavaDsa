package Strings;

public class ReverseWordsInAString {
static String ReverseWord(String str) {
	str=str.trim();
	
	String words[]=str.split("\\s+");
	
	StringBuilder sb=new StringBuilder();
	for(int i=words.length-1;i>=0;i--) {
		sb.append(words[i]);
		if(i!=0) {
			sb.append(" ");
		}
	}
	
	return sb.toString();
	}
public static void main(String args[]) {
	String input ="Sky is the limit";
	String output=ReverseWord(input);
	System.out.println(output);
}
}
