// Leetcode:- https://leetcode.com/problems/missing-number/description/
// Leet Code Question no. 268
// Missing Number Problem DSA
// Solution:- https://www.youtube.com/watch?v=cuNX7rijdt8&ab_channel=Technosage

// Easy
public class MissingNumber 
{
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
