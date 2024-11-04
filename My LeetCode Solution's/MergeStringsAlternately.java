// Leetcode:- https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 1768
// Merge Strings Alternately Problem DSA
// Solution:- 

// 
// Math; String; Bit Manipulation; Simulation Problem
// Easy

// T.C = o(n) 
// S.C = o(n) 
/**
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/

/**
 Example:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */

 public class MergeStringsAlternately 
 {
    public static void main(String[] args) 
    {
        MergeStringsAlternately mergeStrings = new MergeStringsAlternately();

// Example words to merge
        String word1 = "abc";
        String word2 = "pqrstu";

// Merging the strings alternately
        String result = mergeStrings.mergeAlternately(word1, word2);

// Printing the result
        System.out.println("Merged string: " + result);
    }
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder result = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int maxLength = Math.max(len1, len2);

        for (int i = 0; i < maxLength; i++) 
        {
            if (i < len1) {
                result.append(word1.charAt(i));
            }
            if (i < len2) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}

