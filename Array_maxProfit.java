import java.util.*;

public class Array_maxProfit {
    // Find and return the maximum profit you can achieve.
    public static int maxProfit(int[] prices) {
    int totalProfit = 0;
    for(int sell=1; sell < prices.length; sell++){
        if(prices[sell] > prices[sell - 1]){
            totalProfit += prices[sell] - prices[sell - 1];
        }
       
    }
    return totalProfit;
    

}

public static int maximumProfit(int[] prices){
    int minPrice = prices[0];
    int maxProfit = 0;

    for(int sell = 0; sell < prices.length; sell++){
        minPrice = Math.min(minPrice , prices[sell]);
        maxProfit = Math.max(maxProfit , prices[sell] - minPrice);
    }
    return maxProfit;
}

public static void main(String[] args){
    int[] prices = {7,1,5,3,6,4};
    int profit = maxProfit(prices);
    int maxprofit = maximumProfit(prices);
    System.out.println("Max Profit: " + profit);
    System.out.println("Max Profit: " + maxprofit);

    

}

}