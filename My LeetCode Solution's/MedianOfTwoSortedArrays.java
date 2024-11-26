// Leetcode:- https://leetcode.com/problems/median-of-two-sorted-arrays/description/
// Leet Code Question no. 4
// Median of Two Sorted Arrays Problem DSA
// Youtube Solution:- 

// https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/5995838/beginner-friendly-step-by-steps-solution-beats-100-user-in-each-solution-of-me (1ms)(Beats 100%)
// Array; Binary Search; Divide and Conquer Problem
// Hard

// T.C = O(Log(Min(M,N))),
// S.C = O(1), 

/**
- Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
- The overall run time complexity should be O(log (m+n)).

*/

/**
 Example:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
*/

// Method using 

public class MedianOfTwoSortedArrays 
{
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0, right = m, halfLen = (m + n + 1) / 2;

        while (left <= right) {
            int i = (left + right) / 2;
            int j = halfLen - i;

            if (i < right && nums1[i] < nums2[j - 1]) {
                left = i + 1;
            } else if (i > left && nums1[i - 1] > nums2[j]) {
                right = i - 1;
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0.0;
    }
}    

/* (5ms)(Beats 29.93%) (https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/4070500/99-journey-from-brute-force-to-most-optimized-three-approaches-easy-to-understand)
public class MedianOfTwoSortedArrays 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        // Get the sizes of both input arrays.
        int n = nums1.length;
        int m = nums2.length;

        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array.
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array.
        int total = merged.length;

        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (double) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}

*/