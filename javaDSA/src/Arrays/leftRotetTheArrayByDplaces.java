package Arrays;

public class leftRotetTheArrayByDplaces {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
int n=arr.length;
int d=5;
int temp[]= new int[d];
		 d=d%n;
for(int i=0;i<d;i++) {
	temp[i]=arr[i];
}for(int i=d;i<n;i++) {
	arr[i-d]=arr[i];
}for(int i=0;i<d;i++) {
	arr[n-d+i]=temp[i];
}for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}

}
}
