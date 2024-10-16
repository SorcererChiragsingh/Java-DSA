// Leetcode:- https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
// Leet Code Question no. 2149
// Rearrange Array Elements by Sign Problem DSA
// Solution:- https://www.youtube.com/watch?v=h4aBagy4Uok; https://leetcode.com/problems/rearrange-array-elements-by-sign/solutions/4723558/beat-100-2-simple-solution-c-python-java-with-explanation

// Medium
// 

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums))); // You should use Arrays.toString() to convert the array to a string representation for printing.
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int positiveIndex = 0, negativeIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                ans[positiveIndex] = num;
                positiveIndex += 2;
            } else if (num < 0) {
                ans[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return ans;
    }
}


