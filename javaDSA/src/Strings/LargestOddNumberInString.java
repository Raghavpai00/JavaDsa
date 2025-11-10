package Strings;

public class LargestOddNumberInString {
	public static String largestOddNumber(String str){
        for(int i=str.length()-1;i>=0;i--){
            char d=str.charAt(i);
            if((d-'0')%2!=0){
                return str.substring(0,i+1);
            
            }
        }
        return"";
    }
    public static void main(String[] args) {
        String input="45978";
        String output=largestOddNumber(input);
        System.out.println(output);
    }
}




