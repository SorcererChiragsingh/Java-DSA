// Leetcode:- https://leetcode.com/problems/maximum-subarray/description/
// Leet Code Question no. 53
// Maximum Subarray Problem DSA
// Solution:- https://www.youtube.com/watch?v=usxn9PV6Fdo&ab_channel=Technosage

// Array; Divide and Conquer; Dynamic Programming
// Medium
// Kadane's algorithm

/**
Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

/**
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
*/
public class MaximumSubArray 
{
    public static void main(String[] args) 
    {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumArr(nums));
    }

    public static int maxSumArr(int[] nums) 
    {
        int sum = 0;
        int max_sum = nums[0]; // nums [0] = first elemnt in a array

        for (int i = 0; i < nums.length; i++) 
        {
            sum = sum + nums[i];
            if (sum > max_sum) 
            {
                max_sum = sum;
            }
            if (sum < 0) 
            {
                sum = 0;
            }

        }
        return max_sum;
    }
}