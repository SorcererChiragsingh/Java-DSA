// Leetcode:- https://leetcode.com/problems/kth-largest-element-in-an-array/description/
// Leet Code Question no. 215
// Kth Largest Element in an Array Problem DSA
// Solution:- https://www.youtube.com/watch?v=ockS2ZKh7j8&ab_channel=AlgorithmsMadeEasy


import java.util.Arrays;

{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums [nums.length-k];
    }
}