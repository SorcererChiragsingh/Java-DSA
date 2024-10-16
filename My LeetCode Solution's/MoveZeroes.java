// Leetcode:- https://leetcode.com/problems/move-zeroes/description/
// Leet Code Question no. 283
// Move Zeros to end Problem DSA
// Solution:- https://www.youtube.com/watch?v=AgiGd763srg&ab_channel=Technosage


class MoveZeroes 
{
    public void moveZeroes(int[] nums) 
    {
        int count =0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i]!=0)
            {
                nums[count++]=nums[i];
            }
        }
        while (count < nums.length)
        {
            nums [count ++]=0;
        }
    }
}