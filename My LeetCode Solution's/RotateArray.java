// Leetcode:- https://leetcode.com/problems/rotate-array/description/
// Leet Code Question no. 189
// Rotate Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=a8rSdfcHouw&ab_channel=CollegeWallah

// Array; Math; Two Pointers Problem
// Medium

// T.C = o()
// S.C = o()

/**
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*/

/**
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
public class RotateArray  
{
    public static void main(String[] args) 
    {
        RotateArray ra = new RotateArray();
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7};  // Example array
        int k = 3;  // Number of rotations
        
        ra.rotate(nums, k);
        
        System.out.println("Array after rotation: ");
        for (int num : nums) 
        {
            System.out.print(num + " ");
        }
    }
    // Reverse Function
    public void reverse(int []nums, int start, int end)
    {
        while (start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
    // Main
    public void rotate(int []nums, int k)
    {
        int n = nums.length;
        k = k % n;
        reverse (nums, 0, n-1);
        reverse (nums, 0, k-1);
        reverse (nums, k, n-1);

    }

}
   