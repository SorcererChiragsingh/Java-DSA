// Leetcode:- https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
// Leet Code Question no. 2149
// Rearrange Array Elements by Sign Problem DSA
// Solution:- https://www.youtube.com/watch?v=h4aBagy4Uok; https://leetcode.com/problems/rearrange-array-elements-by-sign/solutions/4723558/beat-100-2-simple-solution-c-python-java-with-explanation

// Array; Two Pointers; Simulation Problem
// Medium

// T.C= o()
// S.C= o()
/**
*You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
*You should return the array of nums such that the the array follows the given conditions:
- Every consecutive pair of integers have opposite signs.
- For all integers with the same sign, the order in which they were present in nums is preserved.
- The rearranged array begins with a positive integer.

*Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
*/
/**
Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
*/

import java.util.Arrays;

public class RearrangeArray 
{
    public static void main(String[] args) 
    {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums))); // You should use Arrays.toString() to convert the array to a string representation for printing.
    }

    public static int[] rearrangeArray(int[] nums) 
    {
        int n = nums.length;
        int[] ans = new int[n];
        int positiveIndex = 0, negativeIndex = 1;

        for (int num : nums) 
        {
            if (num > 0) 
            {
                ans[positiveIndex] = num;
                positiveIndex += 2;
            } 
            else if (num < 0) 
            {
                ans[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return ans;
    }
}


