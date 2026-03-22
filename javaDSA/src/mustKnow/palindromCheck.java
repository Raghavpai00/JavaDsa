package mustKnow;

public class palindromCheck {
public static void main(String args[]) {
	String str="racecar";
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev+=str.charAt(i);
	}
	if(str.equals(rev)) {
		System.out.println("String is palindrom");
	}else {
		System.out.println("String is not palindrom");
	}
}
}
