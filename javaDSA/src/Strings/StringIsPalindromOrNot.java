package Strings;

public class StringIsPalindromOrNot {
public static void main(String args[]) {
	String str="racecar";
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev)) {
		System.out.print("true");
	}else {
		System.out.print("false");
	}
}

//String str="";
//char []ch=str.toCharArray();
//boolean flag=true;
//
//for(int i=0;i<=ch.length/2;i++){
//    if(ch[i]!=ch[ch.length-1-i]){
//        flag=false;
//        break;
//    }
//}
//if(flag){
//    System.out.println("string is palindrom");
//}else{
//    System.out.println("String is not palindrom");
//}
//}
//}

}
