package coding;

public class anagramCheck {
public static void main(String args[]) {
	
	String s="listen";
	String t="silenter";
	
	int s1=s.length();
	int t1=t.length();
	boolean isAnagram=false;
	
	int arr[]=new int[26];
	
	if(s1!=t1) {
		isAnagram=false;
	}
	for(int i=0;i<s1;i++) {
		arr[s.charAt(i)-'a']++;
	}
	for(int j=0;j<t1;j++) {
		arr[t.charAt(j)-'a']--;
		if(arr[t.charAt(j)-'a']<0) {
			isAnagram=false;
		}else {
			isAnagram=true;
		}
	}
	System.out.print(isAnagram);
}
}
