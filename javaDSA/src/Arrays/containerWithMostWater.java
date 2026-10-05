package Arrays;

public class containerWithMostWater {
	public static int container(int arr[]) {
		
		int mostWater=0;
		int leftIndex=0;
		int rightIndex=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				int width=j-i;
				int height=Math.min(arr[i],arr[j]);
				int area=width*height;
				
				//mostWater=Math.max(mostWater, area);
				
				
				if(area>mostWater) {
					mostWater=area;
					leftIndex=i;
					rightIndex=j;
				}
			}
		}
		System.out.println("leftIndex :"+leftIndex);
		System.out.println("rightIndex:"+rightIndex);
		
		return mostWater;
	}
public static void main(String args[]) {
	int arr[]={1,8,6,2,5,4,8,3,7};
	
	System.out.println(container(arr));
}
}
