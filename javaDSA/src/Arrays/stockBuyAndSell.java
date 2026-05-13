package Arrays;

public class stockBuyAndSell {
public static int maximumProfit(int prices[]) {
	int min_Price=prices[0];
	int max_Profit=0;
	
	for(int i=0;i<prices.length;i++) {
		 if(min_Price>prices[i]) {
			 min_Price=prices[i]; 
		 }
		 int profit=prices[i]-min_Price;
		 
		 if(profit>max_Profit) {
			 max_Profit=profit;
		 }
	}
	return max_Profit;
	
}
	public static void main(String args[]) {
	int prices[]= {7, 1, 5, 3, 6, 4};
	
	System.out.println(maximumProfit(prices));
}
}
