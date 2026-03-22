package Strings;

public class ReverseTheString {
public static void main (String args[]) {
	String str="Raghav";
	int length=str.length();
	char[] ch=str.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
}
}
