package Strings;

public class firstNonRepeatingCharecter {
public static void main(String args[]) {
	String str="aabbcddeffg";
	
	char arr[]=str.toCharArray();
	
	for(int i=0;i<arr.length;i++) {
		boolean isUnique=true;
		for(int j=0;j<arr.length;j++) {
			if(i!=j &&  arr[i]==arr[j] ) {
				isUnique=false;
				break;
			}
		}
		if(isUnique) {
			System.out.println("first nonRepeatating charecter is "+arr[i]);
			break;
			
		}
	}

}


}
