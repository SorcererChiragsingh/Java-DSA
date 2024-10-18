// Leetcode:- https://leetcode.com/problems/reverse-integer/
// Leet Code Question no. 7
// Reverse Integer Problem DSA
// Solution:- https://www.youtube.com/watch?v=V5kYHHRoMlk&ab_channel=Technosage ; https://www.youtube.com/watch?v=0fwrMYPcGQ0&ab_channel=CodeHelp-byBabbar

// Basic Maths Problem
// Medium

// T.C = o(n)
// S.C = o(n)

/**
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned). 
*/

/**
Example 1:

Input: x = 123
Output: 321 
*/
public class ReverseInteger 
{
    public static void main(String[] args)
    {
        System.out.println(reverse(458299653));
    }
    static int reverse(int x) 
    {
        int rev=0;
        while(x!=0)
        {
            int digit=x%10;
            if (rev > Integer. MAX_VALUE/10 || rev < Integer. MIN_VALUE/10)
            {
                return 0;
            }
            rev= (rev*10)+digit;
            x=x/10;
        }


        return rev;
    }
}
