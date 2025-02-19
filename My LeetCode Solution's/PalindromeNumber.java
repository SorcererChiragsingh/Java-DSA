// Leetcode:- https://leetcode.com/problems/palindrome-number/description/
// Leet Code Question no. 9
// Palindrome Number Problem DSA
// Solution:- https://www.youtube.com/watch?v=to4Ufp0MU4w&ab_channel=Technosage

// Basic Maths Problem
// Easy

// T.C = o(n)
// S.C = o(n)
/**
Given an integer x, return true if x is a palindrome(An integer is a palindrome when it reads the same forward and backward.
For example, 121 is a palindrome while 123 is not.), and false otherwise.
An Integer is a palindrome when it reads the same backwards as forwards.
*/
/**
 Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(123));
    }
    public static boolean isPalindrome(int x) 
    {
        int temp = x;
       int rev =0;
        while(x>0)
        {
            int digit = x % 10;
            rev = (rev*10) +digit;
            x = x/10;
        }
        if(rev == temp)
        {
            return true;
        }
        return false;
    }
}
