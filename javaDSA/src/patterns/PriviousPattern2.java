package patterns;

public class PriviousPattern2 {
public static void main(String args[]) {
//	int n=7;
//	for(int i=1;i<=n;i++) {
//		int count=i*10;
//		for(int j=1;j<=i;j++) {
//	        if(i%2==0) {
//			System.out.print(count+" ");
//			count+=5;
//		}else  {
//			if(i==1) {
//			System.out.print("*");
//			}else {
//				if(j==1) {
//					System.out.print(count+" ");
//				}else {
//					System.out.print("* ");
//				}
//			}
//		}
//	}
//		System.out.println();	}
//	
	
	int n=7;
	for(int i=1;i<=n;i++) {
		int count =i*10;
		for(int j=1;j<=i;j++) {
			if(i%2==0) {
				System.out.print(count+" ");
				count+=5;
			}else {
				if(i==1) {
					System.out.print("* ");
				}else {
					if(j==1) {
						System.out.print(count+" ");
					}else {
						System.out.print("*  ");
					}
				}
			}
		}
		System.out.println();
	}
}
}
