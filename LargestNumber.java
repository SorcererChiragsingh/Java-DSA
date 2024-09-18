// Leetcode:- https://leetcode.com/problems/largest-number/description/?envType=daily-question&envId=2024-09-18
// Leet Code Question no. 179
// Largest Number Problem DSA
// Solution:- https://www.youtube.com/watch?v=ccBj78YBJmg

// https://leetcode.com/problems/largest-number/solutions/5802828/greedy-approach-ka-proof-kya-hai-yeh-bhi-pata-hona-chahiye-lets-understand-it

// Array; String; Greedy; Sorting Problem
// 

// Medium

// T.C = o()
// S.C = o()

// Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
// Since the result may be very large, so you need to return a string instead of an integer.

/**
 Example 1:
 
Input: nums = [10,2]
Output: "210"
 */

/**
 Example 2:
 
Input: nums = [3,30,34,5,9]
Output: "9534330"
 */ 

 // https://leetcode.com/problems/largest-number/solutions/5802529/beats-99-of-the-users
import java.util.Arrays;
public class LargestNumber 
{
    public String largestNumber(int[] nums) 
    {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            numStrs[i] = String.valueOf(nums[i]);
        }

        // Sort the strings based on custom comparator
        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the largest number is 0, return "0"
        if (numStrs[0].equals("0")) 
        {
            return "0";
        }

        // Concatenate the sorted array to form the largest number
        StringBuilder result = new StringBuilder();
        for (String numStr : numStrs) 
        {
            result.append(numStr);
        }

        return result.toString();
    }
}
