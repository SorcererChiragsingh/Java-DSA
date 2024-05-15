// Leetcode:- https://leetcode.com/problems/next-permutation/description/
// Leet Code Question no. 31
// Next Permutation Problem DSA
// Solution:- https://www.youtube.com/watch?v=IhsUbEMfIbY&ab_channel=AlgorithmsMadeEasy; https://www.youtube.com/watch?v=JDOXKqF60RQ&ab_channel=takeUforward

// Medium
// 
import java.util.Arrays;

public class NextPermutation 
{
    public static void main(String[] args) 
    {
        int[] nums = {1, 1, 5, 4, 6};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Corrected to print the modified array
    }

    public static void nextPermutation(int[] nums) 
    {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) 
        {
            i--;
        }
        if (i >= 0) 
        {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        reverse(nums, i + 1);
    }
    
    private static void swap(int[] nums, int i, int j) // Changed to static
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private static void reverse(int[] nums, int start) // Changed to static
    {
        int end = nums.length - 1;
        while (start < end) 
        {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
