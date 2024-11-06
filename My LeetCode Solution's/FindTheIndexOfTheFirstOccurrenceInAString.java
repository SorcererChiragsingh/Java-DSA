// Leetcode:- https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 28
// Find the Index of the First Occurrence in a String Problem DSA
// Solution:- 

// 
//  Problem
// Easy

// T.C = o((n - m + 1) * m) worst case
// S.C = o(1) 
/**
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

/**
 Example:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
 */

 public class FindTheIndexOfTheFirstOccurrenceInAString 
 {
    public static void main(String[] args) 
    {
        FindTheIndexOfTheFirstOccurrenceInAString finder = new FindTheIndexOfTheFirstOccurrenceInAString();

        // Example strings
        String haystack = "hello";
        String needle = "ll";

        // Finding the first occurrence
        int result = finder.strStr(haystack, needle);

        // Printing the result
        System.out.println("The first occurrence of \"" + needle + "\" in \"" + haystack + "\" is at index: " + result);
    }
    public int strStr(String haystack, String needle) 
    {
        int haylength = haystack.length();
        int needlelength = needle.length();
        
        // If the needle is longer than the haystack, it cannot be found
        if (haylength < needlelength) {
            return -1;
        }

        // Iterate through haystack up to the point where needle could fully fit
        for (int i = 0; i <= haylength - needlelength; i++) {
            int j = 0;

            // Check if the substring starting from index i matches the needle
            while (j < needlelength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If we have checked all characters in needle, return the start index
            if (j == needlelength) {
                return i;
            }
        }
        
        // Return -1 if needle was not found in haystack
        return -1;
    }
}
