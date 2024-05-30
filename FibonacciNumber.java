// Leetcode:- https://leetcode.com/problems/fibonacci-number/description/
// Leet Code Question no. 509
// Fibonacci Number Problem DSA
// Solution:- 


// Recursion Problem

// Easy

// T.C = o(n)
// S.C = o(n)

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
}
