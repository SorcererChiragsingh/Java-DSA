// Leetcode:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Leet Code Question no. 121
// Best Time to Buy and Sell Stock Problem DSA
// Solution:- https://www.youtube.com/watch?v=34WE6kwq49U&ab_channel=AnujBhaiya

// Array; Dynamic Programming Problem
// Easy

/**
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

/**
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
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