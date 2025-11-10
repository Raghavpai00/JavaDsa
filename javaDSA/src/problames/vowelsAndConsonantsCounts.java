
package problames;

public class vowelsAndConsonantsCounts {
public static void main(String args[]) {
	int vowels=0,consonant=0;
	String str="india is my country";
	
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels++;
			}else {
				consonant++;
			}
	}
	System.out.println("String is "+str);
	System.out.println("vowels are "+vowels);
	System.out.println("consonants are "+consonant);
}
}
