package mustKnow;

public class ReverseAString {
public static void main(String args[]) {
	String str="spring";
	String input=str;
	System.out.println("input:"+input);
	
	System.out.print("output:");
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
}
}
