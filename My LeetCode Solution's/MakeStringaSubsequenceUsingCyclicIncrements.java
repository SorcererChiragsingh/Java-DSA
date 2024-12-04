// Leetcode:- https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/?envType=daily-question&envId=2024-12-04
// Leet Code Question no. 2825
// Make String a Subsequence Using Cyclic Increments Problem DSA
// Youtube Solution:- https://www.youtube.com/watch?v=8-6Mqs-p2I8 ; 

//  (7ms)(Beats 43.44%)
// Two Pointers; String; Simulation Problem
// Medium

// T.C = O(Min(M,N)),
// S.C = O(1), 

/**
- You are given two 0-indexed strings str1 and str2.

- In an operation, you select a set of indices in str1, and for each index i in the set, increment str1[i] to the next character cyclically. 
That is 'a' becomes 'b', 'b' becomes 'c', and so on, and 'z' becomes 'a'.
- Return true if it is possible to make str2 a subsequence of str1 by performing the operation at most once, and false otherwise.
- Note: A subsequence of a string is a new string that is formed from the original string by deleting some (possibly none) of the characters without disturbing the relative positions of the remaining characters.
*/

/**
 Example:

Input: str1 = "abc", str2 = "ad"
Output: true
Explanation: Select index 2 in str1.
Increment str1[2] to become 'd'. 
Hence, str1 becomes "abd" and str2 is now a subsequence. Therefore, true is returned.

*/

// Method using 2 Pointers
// 

public class MakeStringaSubsequenceUsingCyclicIncrements 
{
    public static void main(String[] args) // main class
    {
        // Instantiate the MakeStringaSubsequenceUsingCyclicIncrements class
        MakeStringaSubsequenceUsingCyclicIncrements checker = new MakeStringaSubsequenceUsingCyclicIncrements();

        // Example inputs
        String str1 = "abcde";
        String str2 = "ace";

        // Call the canMakeSubsequence method and store the result
        boolean result = checker.canMakeSubsequence(str1, str2);

        // Print the inputs and the result
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Can Make Subsequence: " + result);
    }
    public boolean canMakeSubsequence(String str1, String str2) // algo starts here
    {
        int m = str1.length();
        int n = str2.length();
        
        if (n > m) {
            return false;
        }
        
        int i = 0;
        int j = 0;
        
        while (i < m && j < n) 
        {
            if ((str1.charAt(i) == str2.charAt(j)) || 
                (str1.charAt(i) + 1 == str2.charAt(j)) || 
                (str1.charAt(i) - 25 == str2.charAt(j))) {
                j++;
            }
            i++;
        }
        
        return j == n;
    }
}
