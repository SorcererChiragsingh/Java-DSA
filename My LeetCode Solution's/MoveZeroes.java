// Leetcode:- https://leetcode.com/problems/move-zeroes/description/
// Leet Code Question no. 283
// Move Zeros to end Problem DSA
// Solution:- https://www.youtube.com/watch?v=AgiGd763srg&ab_channel=Technosage

// Array; Two Pointers Problems
// Easy

// T.C = o()
// S.C = o()

/**
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/

/**
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
class MoveZeroes 
{
    public static void main(String[] args) 
    {
        MoveZeroes mz = new MoveZeroes();
        
        int[] nums = {0, 1, 0, 3, 12};  // Example array
        mz.moveZeroes(nums);
        
        System.out.println("Array after moving zeroes: ");
        for (int num : nums) 
        {
            System.out.print(num + " ");
        }
    }
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