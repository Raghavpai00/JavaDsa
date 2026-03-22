package coding;

public class bestTimeToBuyAndSellStock {
	public static void main(String args[]) {
	//int[] prices = {7, 1, 5, 3, 6, 4};
		int prices[]= {7,5,4,9,8,1,3};
    int minPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    int buyDay=0;
    int sellDay=0;
    int tempBuyDay=0;
    
    for(int i=0;i<prices.length;i++) {
    	if(prices[i]<minPrice) {
    		minPrice=prices[i];
    		tempBuyDay=i;
    	}
    	if((prices[i]-minPrice)>maxProfit) {
    		maxProfit=prices[i]-minPrice;
    		buyDay=tempBuyDay+1;
    		sellDay=i;
    	}
    }
    System.out.println("Buy On Day "+buyDay);
    System.out.println("sell on day "+(sellDay+1));
    System.out.println("maximum profit "+maxProfit);
}
}