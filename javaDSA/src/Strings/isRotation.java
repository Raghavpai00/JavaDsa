package Strings;

public class isRotation {
	public static boolean rotation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
	String combined=str1+str2;
	return combined.contains(str2);
	}
public static void main(String args[]) {
	String str1="ABCD";
	String str2="CBAD";
	
	if(rotation(str1,str2)) {
	System.out.println("String is rotation");	
	}else {
		System.out.println("String is not rotation");
	}
}
}
