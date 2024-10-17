// Leetcode:- https://leetcode.com/problems/max-consecutive-ones/
// Leet Code Question no. 485
// Max Consecutive Ones Problem DSA
// Solution:- https://www.youtube.com/watch?v=bYWLJb3vCWY&t=365s&ab_channel=takeUforward ; https://www.youtube.com/watch?v=pPVE4KZ1hsU&ab_channel=Technosage


// Easy

/**
Given a binary array nums, return the maximum number of consecutive 1's in the array.
*/

/**
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/
public class MaxConsecutiveOnes 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 1) 
            {
                cnt++;
            } else 
            {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    
    }
}
