// Leetcode:- https://leetcode.com/problems/fibonacci-number/description/
// Leet Code Question no. 509
// Fibonacci Number Problem DSA
// Solution:- 


// Recursion; Math; Dynamic Programming; Memoization Problem

// Easy

// T.C = o(n)
// S.C = o(n)

// The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.


/**
Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */

public class FibonacciNumber 
{
    public int a=0,b=1,c;
    public int fib(int n) 
    {
        if(n<2) return n;
        return fibnoci(n);
        
    }
    public int fibnoci(int n)
    {
        
        if(n>1)
        {
            c=a+b;
            a=b;
            b=c;
            fibnoci(n-1);
        } 
         
      return c; 
    }
    public static void main(String[] args) 
    {
        FibonacciNumber fibonacci = new FibonacciNumber();
        int n = 10; // Example value for Fibonacci sequence

        System.out.println("Fibonacci of " + n + " (recursive): " + fibonacci.fib(n));
        System.out.println("Fibonacci of " + n + " (iterative): " + fibonacci.fibnoci(n));
    }
}
