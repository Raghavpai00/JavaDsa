package codingAssesmentProblames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
	public static List<List<String>> anagramGroup(String []strs){
		Map <String,List<String>> map=new HashMap<>();
		
		for(String word:strs) {
			char[]ch=word.toCharArray();
			Arrays.sort(ch);
			
			String key=new String(ch);
			
			if(!map.containsKey(key)) {
				map.put(key,new ArrayList<>());
			}
			map.get(key).add(word);
		}
		return new ArrayList<>(map.values());
	}
	
	
public static void main(String args[]) {
	
	String []strs= {"eat","tea","tan","ate","nat","bat"};
	System.out.println(anagramGroup(strs));
}
}
 