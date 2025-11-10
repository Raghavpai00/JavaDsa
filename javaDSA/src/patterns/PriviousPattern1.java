package patterns;

public class PriviousPattern1 {
public static void main(String args[]) {
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n-i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=i;j>=i;j--) {
//			System.out.print(j);
//		}
//		for(int j=2;j<=i;j++) {
//			System.out.print(j);//		}
//		System.out.println();
//	}
//	}
//}
	
	
	int n=5;
		int count;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=(n-i);j++) {
				System.out.print("  ");
			}for(int k=1;k<=i;k++) {
				System.out.print(count+" ");
				count++;
			}
			count--;
			for(int l=2;l<=i;l++) {
			    	count--;
				System.out.print(count+" ");
			
			}
			System.out.println();
		}
	    }
	
	
}
/*
 * 
 *  1
   212
  32123
 4321234
543212345 
 * 
 * 
 * */