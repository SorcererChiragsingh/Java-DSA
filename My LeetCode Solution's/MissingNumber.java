// Leetcode:- https://leetcode.com/problems/missing-number/description/
// Leet Code Question no. 268
// Missing Number Problem DSA
// Solution:- https://www.youtube.com/watch?v=cuNX7rijdt8&ab_channel=Technosage

// Array; Hash Table; Math; Binary Search; Bit Manipulation; Sorting Problem
// Easy

/**
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

/**
Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.
*/
public class MissingNumber 
{
    public static void main(String[] args) 
    {
        MissingNumber mn = new MissingNumber();
        
        int[] nums = {0, 1, 3};  // Example array
        int missing = mn.missingNumber(nums);
        
        System.out.println("Missing number is: " + missing);
    }
    public int missingNumber(int[] nums) 
    {
       int Sum = 0;
        for (int i =0; i<nums.length; i++)
        {
            Sum = Sum + nums[i];
        }
        int actualSum = (nums.length*(nums.length+1))/2;
        int missingnum = actualSum - Sum;
        return missingnum;
    }
}
