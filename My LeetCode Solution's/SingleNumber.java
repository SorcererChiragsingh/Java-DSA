// Leetcode:- https://leetcode.com/problems/single-number/description/
// Leet Code Question no. 136
// Single Number Problem DSA
// Solution:- https://www.youtube.com/watch?v=dUmaWUPRcLQ&ab_channel=Technosage

// Array; Bit Manipulation Problem
// Easy

// T.C = o()
// S.C = o()

/**
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
/** 
Example 1:
Input: nums = [2,2,1]
Output: 1
*/
public class SingleNumber 
{
    public static void main(String[] args) 
    {
        // Initialize an array where every element appears twice except for one
        int[] nums = {4, 1, 2, 1, 2};

        // Create an instance of SingleNumber
        SingleNumber sn = new SingleNumber();

        // Find the single number
        int single = sn.singleNumber(nums);

        // Print the single number
        System.out.println("The single number is: " + single);
    }

    public int singleNumber(int[] nums) 
    {
        int value = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            value = value ^ nums[i];
        }
        return value;
    }
}

/** 
public class SingleNumber 
{
    public int singleNumber(int[] nums) 
    {
        int value =0;
        for (int i =0; i< nums.length; i++)
        {
            value = value^nums[i];
        }
        return value;
    }
}
*/
