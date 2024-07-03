// Leetcode:- https://leetcode.com/problems/two-sum/
// Leet Code Question no. 1
// Two Sums Problem DSA
// Solution:- https://www.youtube.com/watch?v=jYLV2vtnc2E&t=2s&ab_channel=CollegeWallah


//
// Easy

// T.C = o(n)
// S.C = o(n)

class TwoSums 
{
    public int[] twoSum(int[] nums, int target) 
    {
     for(int i =0; i<nums.length; i++)  
     {
        for(int j=i+1; j<nums.length;j++)
        {
            if (nums[i]+nums[j] == target)
            {
                int a[] = {i,j};
                return a;
            }
        }
     } 
     return null;
    }
}