package patterns;

public class PriviousPattern4 {
public static void main(String args[]) {
int n=6;
int count=5;
 for(int i=0;i<=n;i++) {
	 for(int j=1;j<=i;j++) {
		 if(i%2!=0) {
			 if(i==1) {
				 System.out.print(" ");
			 }else {
				 System.out.print("* ");
			 }
		 }else {
			 if(i==2&&j==2) {
				 count=25;
				 System.out.print(count+" ");
				 count+=5;
			 } 
			 
			 else {
				 System.out.print(count+" ");
				 count+=5;
			 }
		 }
	 }
	 System.out.println();
 }
}
	
}











/*
 * public class test{
    public static void main(String args[]){
     int n=6;
      int count=5;
     for(int i=1;i<=n;i++){
     
      for(int j=1;j<=i;j++){
        if(i%2!=0){
          if(i==1){
            System.out.print(" ");
          }else{
            System.out.print("*  ");
          }
        }else{
          if(i==2 && j==2){
            count=25;
            System.out.print(count+" ");
            count+=5;
          }else{
            System.out.print(count+" ");
            count+=5;
          }
        }
      }
      System.out.println();

     }
    
     
    
         }
    }
 * */
 