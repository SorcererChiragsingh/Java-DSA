// Leetcode:- https://leetcode.com/problems/longest-palindrome/description/
// Leet Code Question no. 409
// Longest Palindrome Problem DSA
// Solution:- 

// 
// Hash Map & Greedy Problem

// Easy

// T.C = o(n)
// S.C = o(n)

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome 
{
    public int longestPalindrome(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int count : counts.values()) {
            length += (count / 2) * 2;
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }
        
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}



/**
 class Solution {

    public int longestPalindrome(String s) {

        // Map to store frequency of occurrence of each character

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequencies

        for (char c : s.toCharArray()) {

            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        }

        int res = 0;

        boolean hasOddFrequency = false;

        for (int freq : frequencyMap.values()) {

            // Check is the frequency is even

            if ((freq % 2) == 0) {

                res += freq;

            } else {

                // If the frequency is odd, one occurrence of the

                // character will remain without a match

                res += freq - 1;

                hasOddFrequency = true;

            }

        }

        // If hasOddFrequency is true, we have at least one unmatched

        // character to make the center of an odd length palindrome.

        if (hasOddFrequency) return res + 1;

        return res;

    }

}
 */
