// Leetcode:- https://leetcode.com/problems/shortest-palindrome/?envType=daily-question&envId=2024-09-20
// Leet Code Question no. 214
// Shortest Palindrome Problem DSA
// Solution:- https://www.youtube.com/watch?v=EV1WFTAr4LQ&ab_channel=CodeThoughts

// https://leetcode.com/problems/shortest-palindrome/solutions/5810352/beats-100-beginner-friendly-python3-java-c-c-ruby-go-javascript
// String; Rolling Hash; String Matching; Hash Function

// Easy

// T.C = o(n)
// S.C = o(n) 

// You are given a string s. You can convert s to a palindrome by adding characters in front of it.
// Return the shortest palindrome you can find by performing this transformation.

/**
 Example 1:

Input: s = "aacecaaa"
Output: "aaacecaaa"

 */

 class shortestPalindrome
 {
    public String shortestpalindrome(String s) 
    {
        int count = kmp(new StringBuilder(s).reverse().toString(), s);
        return new StringBuilder(s.substring(count)).reverse().toString() + s;
    }

    private int kmp(String txt, String patt) 
    {
        String newString = patt + '#' + txt;
        int[] pi = new int[newString.length()];
        int i = 1, k = 0;
        while (i < newString.length()) 
        {
            if (newString.charAt(i) == newString.charAt(k)) 
            {
                k++;
                pi[i] = k;
                i++;
            } else 
            {
                if (k > 0) 
                {
                    k = pi[k - 1];
                } else 
                {
                    pi[i] = 0;
                    i++;
                }
            }
        }
        return pi[newString.length() - 1];
    }

    public static void main(String[] args) 
    {
        shortestPalindrome obj = new shortestPalindrome();
        String s = "aacecaaa";
        String result = obj.shortestpalindrome(s);
        System.out.println("Shortest Palindrome: " + result);
    }
}