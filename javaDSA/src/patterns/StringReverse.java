package patterns;

public class StringReverse {
public static void main(String args[]) {
	String str="jayant is sleeping";
	String str2[]=str.split(" ");
	String words=" ";
	
	for(int i=str2.length-1;i>=0;i--) {
		words+=str2[i]+" ";
	}
	System.out.print(words);
}
}
