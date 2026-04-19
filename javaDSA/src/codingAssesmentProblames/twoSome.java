package codingAssesmentProblames;

public class twoSome {
public int[] twoSome(int nums[],int target){
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]+nums[j]==target) {
				System.out.println(i+","+j);
			}
		}
	}
	return nums;
}
public static void main(String args[]) {
	int nums[]= {2,7,5,8,9,4,3,1};
	int target=9;
	twoSome ts=new twoSome();//this is object creation of the class not method
	int result[]=ts.twoSome(nums, target);
	System.out.println(result[0]+","+result[1]);
}
}
