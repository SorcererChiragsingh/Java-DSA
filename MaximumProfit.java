// Leetcode:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Leet Code Question no. 121
// Best Time to Buy and Sell Stock Problem DSA
// Solution:- https://www.youtube.com/watch?v=34WE6kwq49U&ab_channel=AnujBhaiya

// Easy
// 

public class MaximumProfit
{
    public static void main(String[] args) 
    {
        int[] nums={3,1,4,8,7,2,5};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) 
    {
       int min_price = prices[0];
        int maxprof = 0;

        for(int i=1;i<prices.length;i++)
        {
            maxprof = Math.max(maxprof,prices[i]-min_price);
            min_price = Math.min(prices[i],min_price);
        }

        return maxprof; 
    }
}