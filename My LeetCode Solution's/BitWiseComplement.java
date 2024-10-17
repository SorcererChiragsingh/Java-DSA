// Leetcode:- https://leetcode.com/problems/complement-of-base-10-integer/
// Leet Code Question no. 1009
// Complement of Base 10 Integer Problem DSA
// Solution:- https://www.youtube.com/watch?v=0fwrMYPcGQ0&ab_channel=CodeHelp-byBabbar ; https://www.youtube.com/watch?v=QvmnMDzzGxk&ab_channel=EngineeringDigest

// https://leetcode.com/problems/complement-of-base-10-integer/solutions/4456862/using-bit-masking-beats-100-java

// Basic Maths Problem

// Easy

// T.C = o(n)
// S.C = o(n)

/** 
 The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
 For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 Given an integer n, return its complement.
*/

/**
Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
 */
public class BitWiseComplement 
{
    public static void main(String[] args)
    {
        System.out.println(bitwiseComplement(5));
    }
    public static int bitwiseComplement(int n) 
    {
        if(n==0)
        return 1;
        int mask = 0,temp = n;
        while(n!=0)
        {
            mask=mask<<1;
            mask = mask | 1;
            n=n>>1;
        }
        return (~temp) & mask;
    }

}
