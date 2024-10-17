// Leetcode:- https://leetcode.com/problems/kth-largest-element-in-an-array/description/
// Leet Code Question no. 215
// Kth Largest Element in an Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=ockS2ZKh7j8&ab_channel=AlgorithmsMadeEasy; https://leetcode.com/problems/kth-largest-element-in-an-array/solutions/5031301/easy-solution-using-hashmap-beats-72-32-of-users-with-java-easy-approach

// Meddium

/**
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?
*/

/**
Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
*/

/**
Approach One:-
* With Sorting
 
import java.util.Arrays;

{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums [nums.length-k];
    }
}
 */
import java.util.HashMap;

public class KthLargestElement 
{
    public static void main(String[] args) 
    {
        // Initialize an array and a value for k
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // Create an instance of KthLargestElement
        KthLargestElement finder = new KthLargestElement();

        // Find the kth largest element
        int result = finder.findKthLargest(nums, k);

        // Print the result
        System.out.println("The " + k + "th largest element is: " + result);
    }

    public int findKthLargest(int[] nums, int k) 
    {
        int main_max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            if (hm.containsKey(nums[i])) 
            {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else 
            {
                hm.put(nums[i], 1);
            }
            main_max = Math.max(main_max, nums[i]);
        }
        if (hm.size() == 1) 
        {
            return main_max;
        }
        k -= hm.get(main_max);
        while (k > 0) 
        {
            main_max--;
            if (hm.containsKey(main_max)) 
            {
                k -= hm.get(main_max);
            }
        }
        return main_max;
    }
}