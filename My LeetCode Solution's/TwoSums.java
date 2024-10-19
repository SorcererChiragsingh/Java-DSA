// Leetcode:- https://leetcode.com/problems/two-sum/
// Leet Code Question no. 1
// Two Sums Problem DSA
// Solution:- https://www.youtube.com/watch?v=jYLV2vtnc2E&t=2s&ab_channel=CollegeWallah


// Array; Hash Table Problem
// Easy

// T.C = o(n)
// S.C = o(n)

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
/**
 Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
class TwoSums 
{
    public static void main(String[] args) 
    {
        TwoSums ts = new TwoSums();
        
        int[] nums = {2, 7, 11, 15};  // Example array
        int target = 9;  // Example target
        
        int[] result = ts.twoSum(nums, target);
        
        if (result != null) 
        {
            System.out.println("Indices of the two numbers that add up to the target: ");
            System.out.println(result[0] + ", " + result[1]);
        } 
        else 
        {
            System.out.println("No two numbers add up to the target.");
        }
    }
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