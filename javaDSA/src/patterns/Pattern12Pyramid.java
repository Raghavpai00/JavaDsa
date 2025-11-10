package patterns;

public class Pattern12Pyramid {
public static void main(String args[]) {
	int n=12;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=1+n-i;j++) {
			System.out.print(" ");
		}for(int j=1;j<=i;j++) {
			System.out.print(i);
			if(i<10) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
