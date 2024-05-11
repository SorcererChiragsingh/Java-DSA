// Leetcode:- https://leetcode.com/problems/max-consecutive-ones/
// Leet Code Question no. 485
// Max Consecutive Ones Problem DSA
// Solution:- https://www.youtube.com/watch?v=bYWLJb3vCWY&t=365s&ab_channel=takeUforward ; https://www.youtube.com/watch?v=pPVE4KZ1hsU&ab_channel=Technosage


// Easy
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
