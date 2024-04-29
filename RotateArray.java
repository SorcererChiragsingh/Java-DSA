// Leetcode:- https://leetcode.com/problems/rotate-array/description/
// Leet Code Question no. 189
// Rotate Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=a8rSdfcHouw&ab_channel=CollegeWallah

//DIFFICULTY:- Medium
public class RotateArray  
{
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
   