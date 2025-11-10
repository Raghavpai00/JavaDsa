package problames;

import java.util.*;
public class reverseAString {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);	
System.out.println("enter the string");//sky is the limit
String str=sc.nextLine();
String str2="";
for(int i=str.length()-1;i>=0;i--) {
	str2=str2+str.charAt(i);
}
System.out.print("reversed String is "+str2);
}
}
