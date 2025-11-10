package patterns;

public class PatternProblame14 {
	public static void main(String[] args) {
	    int n=5;
	    for(int i=1;i<=n;i++){
	        for(int j=0;j<=n-i;j++){
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++){
	            System.out.print(k);
	        }
	        for(int l=i-1;l>=1;l--){
	            System.out.print(l);
	        }
	        System.out.println();
	    }
	    for(int i=n;i>=1;i--){
	        for(int j=1;j<=(13-i)+1;j++){
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++){
	            System.out.print(k);
	        }
	        for(int l=i-1;l>=1;l--){
	            System.out.print(l);
	        }
	        System.out.println();
	    }
	}
}
