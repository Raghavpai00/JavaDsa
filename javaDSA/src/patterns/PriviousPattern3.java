package patterns;

public class PriviousPattern3 {
public static void main(String []args) {

	
	int n=6;
	for(int i=1;i<=n;i++) {
		int count=(i*100)-100;
		for(int j=1;j<=i;j++) {
			if(i%2!=0) {
				System.out.print("* ");
			}else {
				if(i==2 && j==2) {
					count=0;
					System.out.print(count+" ");
				}else {
					
					System.out.print(count+" ");
					count+=100;
				}
			}
		}
		System.out.println();
	}
	
}
}
