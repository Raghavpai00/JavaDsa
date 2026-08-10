package map;
import java.util.*;
public class frequencyOfEachChracter {
public static void main(String args[]) {
	String str="programing";
char arr[]=str.toCharArray();

Map<Character,Integer> map=new HashMap<>();

for(char ch:arr) {
	if(!map.containsKey(ch)) {
		map.put(ch,1);
	}else {
		int value=map.get(ch);
		map.put(ch,value+1);
	}
}
System.out.println(map);

}
}
