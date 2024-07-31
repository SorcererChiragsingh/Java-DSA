// Leetcode:- https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
// Leet Code Question no. 1752
// Check if Array Is Sorted and Rotated Problem DSA
// Solution:- https://www.youtube.com/watch?v=t1GLDWqWVQk&ab_channel=ifelsestatement

// Problem

// Easy 

// T.C = o()
// S.C = o()
/** 
Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
*/

public class SortedAndRotatedArray 
{
    public static void main(String[] args) 
    {
        // Initialize an array
        int[] nums1 = {3, 4, 5, 1, 2}; // Expected output: true
        int[] nums2 = {2, 1, 3, 4};    // Expected output: false

        // Create an instance of SortedAndRotatedArray
        SortedAndRotatedArray checker = new SortedAndRotatedArray();

        // Check if the array is sorted and rotated
        boolean result1 = checker.check(nums1);
        boolean result2 = checker.check(nums2);

        // Print the results
        System.out.println("The array " + java.util.Arrays.toString(nums1) + " is sorted and rotated: " + result1);
        System.out.println("The array " + java.util.Arrays.toString(nums2) + " is sorted and rotated: " + result2);
    }

    public boolean check(int[] nums) 
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] > nums[(i + 1) % nums.length]) 
            {
                count++;
            }
            if (count > 1) 
            {
                return false;
            }
        }
        return true;
    }
}

/** 
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

*/