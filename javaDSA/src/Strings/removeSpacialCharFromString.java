package Strings;

public class removeSpacialCharFromString {
public static void main (String args[]) {
	String str="r@g%#v";
	int length=str.length();
	char ch[]=str.toCharArray();
	for (int i=0;i<=ch.length-1;i++) {
		if(ch[i]=='@'||ch[i]=='%'||ch[i]=='#') {
			continue;
		}else {
			System.out.print(ch[i]);
		}
	}
	
	
	//Approach 
	System.out.println();
	String plainString=str.replaceAll("[^a-zA-Z0-9]","");
	System.out.print(plainString);
}
}
