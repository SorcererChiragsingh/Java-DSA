// Leetcode:- https://leetcode.com/problems/single-number/description/
// Leet Code Question no. 136
// Single Number Problem DSA
// Solution:- https://www.youtube.com/watch?v=dUmaWUPRcLQ&ab_channel=Technosage


// Easy

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


