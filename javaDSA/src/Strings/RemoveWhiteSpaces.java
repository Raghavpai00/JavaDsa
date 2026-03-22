package Strings;

public class RemoveWhiteSpaces {
public static void main(String args[]) {
	String str="j  a  va st  a r";
	int length=str.length()-1;
	char ch[]=str.toCharArray();
	
	for(int i=0;i<=length;i++) {
		if(str.charAt(i)==' ') {
			continue;
		}else {
			System.out.print(str.charAt(i));
		}
	}
}
}
