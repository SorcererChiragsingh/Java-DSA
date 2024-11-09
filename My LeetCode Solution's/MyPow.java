// Leetcode:- https://leetcode.com/problems/powx-n/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 50
// Pow(x, n) Problem DSA
// Solution:- 

// https://leetcode.com/problems/powx-n/solutions/5389007/video-explanation 
// Math; Recursion Problem
// Medium

// T.C = O(logn), // In each recursive call, the exponent n is reduced by half, either by dividing by 2 or subtracting 1 and dividing by 2 (in the case of odd numbers). This halving results in logarithmic time complexity, specifically O(logn).
// S.C = O(logn), // The recursion depth is proportional to the number of times we can halve n until it reaches 0, which is also O(logn). This depth represents the stack space required by the recursive calls.
/**
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
*/

/**
 Example:

Input: x = 2.00000, n = 10
Output: 1024.00000

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

 public class MyPow 
 {
    public static void main(String[] args)
    {
        MyPow calculator = new MyPow();
        
        double x = 2.0;
        int n = 10;
        double result = calculator.myPow(x, n);
        
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    public double myPow(double x, int n) // Handle the case when n is Integer.MIN_VALUE
    {
        long exponent = n;  // Cast to long to avoid overflow issues
        return binaryExp(x, exponent);
    }

    private double binaryExp(double x, long n) 
    {
        if (n == 0) {  // Base case: any number raised to the power of 0 is 1
            return 1;
        }
        if (n < 0) { // If the exponent is negative, use the reciprocal of x
            return 1.0 / binaryExp(x, -n);
        }
        if (n % 2 == 1) { // Perform binary exponentiation
            return x * binaryExp(x * x, (n - 1) / 2);
        } else {
            return binaryExp(x * x, n / 2);
        }
    }
}
