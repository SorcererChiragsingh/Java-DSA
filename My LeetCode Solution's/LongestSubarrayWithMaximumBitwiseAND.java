// Leetcode:- https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/description/?envType=daily-question&envId=2024-09-14
// Leet Code Question no. 2419
// Longest Subarray With Maximum Bitwise AND Problem DSA
// Solution:- https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/solutions/5784657/simple-for-beginners-with-explanation

// Array; Bit Manipulation; Brainteaser

// Medium

// T.C = o(n)
// S.C = o(1)

/**
You are given an integer array nums of size n.
Consider a non-empty subarray from nums that has the maximum possible bitwise AND.
In other words, let k be the maximum value of the bitwise AND of any subarray of nums. Then, only subarrays with a bitwise AND equal to k should be considered.
Return the length of the longest such subarray.
The bitwise AND of an array is the bitwise AND of all the numbers in it.
A subarray is a contiguous sequence of elements within an array.
*/

/**
 Example 1:
Input: nums = [1,2,3,3,2,2]
Output: 2

Explanation:
The maximum possible bitwise AND of a subarray is 3.
The longest subarray with that value is [3,3], so we return 2. 

 */

public class LongestSubarrayWithMaximumBitwiseAND 
{
    public static void main(String[] args) 
    {
        LongestSubarrayWithMaximumBitwiseAND obj = new LongestSubarrayWithMaximumBitwiseAND();
        
        int[] nums = {1, 2, 3, 3, 2, 2}; // Example input array
        int result = obj.longestSubarray(nums);
        
        System.out.println("The length of the longest subarray with maximum bitwise AND is: " + result);
    }
    public int longestSubarray(int[] nums) 
    {
        int length = 0;
        int max = 0;

        // 1st loop to get largest value of nums array
        for(int i=0; i<nums.length; i++)
        {
            max = Math.max(max,nums[i]);
        }

        // 2nd loop to get max count of largest value
        int count=0; // current count of max value
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==max)
            {
                count++;
                length = Math.max(length,count);
            }else
            {
                count = 0;
            }
        }
        return length;
    }
}
