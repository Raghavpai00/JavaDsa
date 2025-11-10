package Strings;

public class RemoveOutermostParanthesis {


    public static String RemoveOutermostParenthesis(String str){
        StringBuilder ans=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                count--;
            }if(count!=0){
                ans.append(str.charAt(i));
            }if(str.charAt(i)=='('){
                count++;
            }
        }
    return ans.toString();
    }
     public static void main(String args[]){
        // String input = "(()())(())(()(()))";
    	 String input="(AB)(C)(D(E))";
         String output=RemoveOutermostParenthesis(input);
         System.out.println(output);
         
}
}
