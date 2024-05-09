// Leetcode:- https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
// Leet Code Question no. 1752
// Check if Array Is Sorted and Rotated Problem DSA
// Solution:- https://www.youtube.com/watch?v=t1GLDWqWVQk&ab_channel=ifelsestatement


public class SortedAndRotatedArray 
{
    public boolean check(int[] nums) 
    {
        int count = 0;
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i] > nums [(i+1) % nums.length])
            {
                count ++;
            }
            if (count >1)
            {
                return false;
            }
        }
        return true;
    }
}
