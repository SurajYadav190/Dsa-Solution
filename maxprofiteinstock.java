public class maxprofiteinstock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

       for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        maxprofiteinstock obj = new maxprofiteinstock();
        int[] arr = {7,1,5,3,6,4};
        int result = obj.maxProfit(arr);
        System.out.println("Maximum profit: " + result);
        
    }
}
