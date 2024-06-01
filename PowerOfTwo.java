// Leetcode:- https://leetcode.com/problems/power-of-two/description/
// Leet Code Question no. 231
// Power of Two Integer Problem DSA
// Solution:- https://www.youtube.com/watch?v=0fwrMYPcGQ0&ab_channel=CodeHelp-byBabbar ; https://www.youtube.com/watch?v=ta17SZ_t-_M&ab_channel=Technosage

// https://leetcode.com/problems/power-of-two/solutions/4748857/8-approaches-c-java-python-javascript-explained
// Basic Maths Problem

// Easy

// T.C = o(n)
// S.C = o(n)

// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.
/**
 Example 1:

Input: n = 1
Output: true
Explanation: 2^0 = 1 // PowerOfTwo 
 */
public class PowerOfTwo 
{
    public static void main(String[] args)
    {
        int n= 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) 
    {
        if (n == 0)
        {
            return false;
        }
        while (n!= 1)
        {
            if( n%2!=0)
            {
                return false;
            }
            else
            {
                n = n/2;
            }
        }
        return true;
    }
}
/**
 class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
          // start to iterate in range from 1 to n
        for(long i = 0; i <= n; i++) {
            // declare power variable 2 of current i
            long power = (long) Math.pow(2, i);
            // check if power math n, if yes we return true
            if(power == n) return true;
            // check if our power exceeds n, then return false
            if(power > n) return false;
        }
        // if non of the cases above return falseM
        return false;
    }
}
 */
