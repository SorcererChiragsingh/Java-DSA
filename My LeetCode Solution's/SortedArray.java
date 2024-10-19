// Leetcode:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Leet Code Question no. 26
// Remove Duplicates from Sorted Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=JHzdGAh_6mk&ab_channel=CollegeWallah

// Array; Two Pointers Problem
// Easy 

// T.C = o()
// S.C = o()

/**
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
The remaining elements of nums are not important as well as the size of nums.
- Return k.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
*/

/** 
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public class SortedArray 
{
    public static void main(String[] args) 
    {
        // Initialize an array with duplicates
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        // Create an instance of SortedArray
        SortedArray sa = new SortedArray();

        // Remove duplicates and get the new length
        int newLength = sa.removeDuplicates(nums);

        // Print the result
        System.out.println("The new length after removing duplicates is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) 
        {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) 
    {
        if (nums.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < nums.length; i++) // The initial implementation of removeDuplicates had a small bug. The loop should start from i = 1 to avoid comparing the first element with itself. The corrected method is provided above.
        {
            if (nums[j] != nums[i]) 
            {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}


/**class SortedArray 
{
    public int removeDuplicates(int[] nums) 
    {
        int j =0;
        for (int i=0; i < nums.length; i++)
        {
            if(nums[j] != nums[i])
            {
                nums [++j]= nums[i];
            }
        }
        return ++j;
    }
}
*/
