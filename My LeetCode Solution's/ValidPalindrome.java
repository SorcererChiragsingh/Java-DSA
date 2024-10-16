// Leetcode:- https://leetcode.com/problems/valid-palindrome/description/
// Leet Code Question no. 125
// Valid Palindrome Problem DSA
// Solution:- 

// 
// Recursion; Two Pointers; String Problem

// Easy

// T.C = o()
// S.C = o()

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

/**
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

 public class ValidPalindrome 
 {

    // Method to clean the string: remove non-alphanumeric characters and convert to lowercase
    private String cleanString(String s) 
    {
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Method to check if the string is a palindrome
    public boolean isPalindrome(String s) 
    {
        String cleanedString = cleanString(s); // Clean the input string
        int n = cleanedString.length(); // Get the length of the cleaned string

        // Check if the cleaned string is a palindrome by comparing characters
        for (int i = 0; i < n / 2; i++) 
        {
            if (cleanedString.charAt(i) != cleanedString.charAt(n - 1 - i)) 
            {
                return false; // If mismatch is found, return false
            }
        }
        return true; // Return true if no mismatch is found
    }
}
