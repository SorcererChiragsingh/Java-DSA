// Leetcode:- https://leetcode.com/problems/maximum-subarray/description/
// Leet Code Question no. 53
// Maximum Subarray Problem DSA
// Solution:- https://www.youtube.com/watch?v=usxn9PV6Fdo&ab_channel=Technosage

// Medium
// Kadane's algorithm

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