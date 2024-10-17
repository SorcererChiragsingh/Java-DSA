// Leetcode:- https://leetcode.com/problems/fraction-addition-and-subtraction/description/?envType=daily-question&envId=2024-08-23
// Leet Code Question no. 592
// Fraction Addition and Subtraction Problem DSA
// Solution:- https://www.youtube.com/watch?v=Uh-KE4D2MOM ; https://www.youtube.com/watch?v=9_XNknZO4wE

// https://leetcode.com/problems/fraction-addition-and-subtraction/solutions/5677056/clean-code-python-java-c-easily-understandable-and-optimized-codes
// String Problem

// Medium

// T.C = o(n)
// S.C = o(n)

/**
Given a string expression representing an expression of fraction addition and subtraction, return the calculation result in string format.
The final result should be an irreducible fraction. If your final result is an integer, 
change it to the format of a fraction that has a denominator 1. So in this case, 2 should be converted to 2/1.
*/

/**
 Example 1:

Input: expression = "-1/2+1/2"
Output: "0/1"
 */

 public class FractionAdditionSubtraction 
 {
    public static void main(String[] args) 
    {
        FractionAdditionSubtraction fas = new FractionAdditionSubtraction();

        String expression = "-1/2+1/2+1/3";
        String result = fas.fractionAddition(expression);

        System.out.println("Result of " + expression + " is: " + result);
    }
    public String fractionAddition(String expression) 
    {
        int num = 0;
        int den = 1;
        int i = 0;
        int n = expression.length();

        while (i < n) 
        {
            int currentNum = 0;
            int currentDen = 0;
            boolean negative = (expression.charAt(i) == '-');

            while (i < n && (expression.charAt(i) == '-' || expression.charAt(i) == '+')) 
            {
                i++;
            }

            while (i < n && Character.isDigit(expression.charAt(i))) 
            {
                int a = expression.charAt(i) - '0';
                currentNum = (currentNum * 10) + a;
                i++;
            }

            i++; // Skip the '/'

            while (i < n && Character.isDigit(expression.charAt(i))) 
            {
                int a = expression.charAt(i) - '0';
                currentDen = (currentDen * 10) + a;
                i++;
            }

            if (negative) 
            {
                currentNum *= -1;
            }

            num = num * currentDen + den * currentNum;
            den = den * currentDen;
        }

        int gcd = gcd(Math.abs(num), den);
        num /= gcd;
        den /= gcd;

        return num + "/" + den;
    }

    private int gcd(int a, int b) 
    {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
