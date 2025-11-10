package problames;

import java.util.*;
public class ReverseTheSentence {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String str=sc.nextLine();
String[]words=str.split(" ");
String reversed="";
 for(int i=words.length-1;i>=0;i--) {
	 reversed+=words[i]+" ";
 }
 System.out.print(reversed);
}
}
