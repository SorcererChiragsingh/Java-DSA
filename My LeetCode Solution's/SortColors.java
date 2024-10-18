// Leetcode:- https://leetcode.com/problems/sort-colors/description/
// Leet Code Question no. 75
// Sort Colors Problem DSA
// Solution:- https://www.youtube.com/watch?v=HuS-ZsnEdbc&ab_channel=Codebix

// Array; Two Pointers; Sorting Problem
// Medium

// T.C = o()
// S.C = o()

/**
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
*/

/** 
Example 1:
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/

public class SortColors 
{
    public static void main(String[] args) 
    {
        // Initialize an array with colors (0, 1, 2)
        int[] nums = {2, 0, 2, 1, 1, 0};

        // Create an instance of SortColors
        SortColors sorter = new SortColors();

        // Sort the colors
        sorter.sortColors(nums);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : nums) 
        {
            System.out.print(num + " ");
        }
    }

    public void sortColors(int[] nums) 
    {
        int l = 0, i = 0, r = nums.length - 1;
        while (i <= r) 
        {
            if (nums[i] == 0)
                Swap(nums, l++, i++);
            else if (nums[i] == 2)
                Swap(nums, i, r--);
            else
                i++;
        }
    }

    private void Swap(int[] nums, int p1, int p2) 
    {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}

/** 
public class SortColors 
{
     public void sortColors(int[] nums) 
    {
        int l= 0, i=0, r = nums.length-1;
        while(i<=r)
        {
            if (nums[i] == 0)
            Swap(nums, l++, i++);
            else if (nums[i] ==2)
            Swap ( nums, i, r--);
            else i++;
        }
    }
    private void Swap ( int[]nums, int p1, int p2)
    {
        int temp = nums[p1];
        nums[p1]= nums[p2];
        nums[p2]= temp;
    }
}
*/