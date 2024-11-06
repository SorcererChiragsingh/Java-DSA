// Leetcode:- https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 242
// Valid Anagram Problem DSA
// Solution:- 

// https://leetcode.com/problems/valid-anagram/solutions/5758886/easy-solution-in-java (6ms)
// Hash Table; String; Sorting Problem
// Easy

// T.C = o((n) where n is the length of s (or t). The algorithm passes through each character once.
// S.C = o(1) because the freq array has a fixed size of 26, regardless of the length of s or t.
/**
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/

/**
 Example:

Input: s = "anagram", t = "nagaram"

Output: true
 */

 public class ValidAnagram 
 {
    public static void main(String[] args) 
    {
        ValidAnagram validAnagram = new ValidAnagram();

        // Example strings to test
        String s = "anagram";
        String t = "nagaram";

        // Checking if they are anagrams
        boolean result = validAnagram.isAnagram(s, t);

        // Printing the result
        if (result) 
        {
            System.out.println("\"" + s + "\" and \"" + t + "\" are anagrams.");
        } else {
            System.out.println("\"" + s + "\" and \"" + t + "\" are not anagrams.");
        }
    }
    public boolean isAnagram(String s, String t) 
    {
        // If the lengths are different, they can't be anagrams
        if (s.length() != t.length()) 
        {
            return false;
        }
        
        // Array to count character frequencies for lowercase English letters
        int[] freq = new int[26];
        
        // Increment count for s and decrement for t
        for (int i = 0; i < s.length(); i++) 
        {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        // Check if all counts are zero
        for (int count : freq) 
        {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
