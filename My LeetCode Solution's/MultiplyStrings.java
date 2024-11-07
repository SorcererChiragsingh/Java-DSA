// Leetcode:- https://leetcode.com/problems/multiply-strings/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 43
// Multiply Strings Problem DSA
// Solution:- 

// https://leetcode.com/problems/multiply-strings/solutions/1563541/java-easy-clean-solution-w-detailed-example-basic-math-tc-o-mn-sc-o-m-n (4ms)
// Math; String; Simulation Problem
// Medium

// T.C = o((m * n), where m is the length of num1 and n is the length of num2. Each digit in num1 is multiplied by each digit in num2. 
// S.C = o(m + n), for the result array used to store intermediate sums. 
/**
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

/**
 Example:

Input: num1 = "2", num2 = "3"
Output: "6"
 */

 public class MultiplyStrings 
{
    public static void main(String[] args) 
    {
        MultiplyStrings multiplyStrings = new MultiplyStrings();

        // Example numbers as strings
        String num1 = "123";
        String num2 = "456";

        // Multiplying the numbers
        String result = multiplyStrings.multiply(num1, num2);

        // Printing the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }
    public String multiply(String num1, String num2) 
    {
        // Check for null input
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Input numbers are invalid");
        }

        int m = num1.length();
        int n = num2.length();

        // Base cases for zero and one
        if (m == 0 || n == 0 || "0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        if ("1".equals(num1)) {
            return num2;
        }
        if ("1".equals(num2)) {
            return num1;
        }

        // Result array to store intermediate products; max length can be m + n
        int[] result = new int[m + n];

        // Multiply each digit in num1 by each in num2 and accumulate in result array
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) 
            {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                // Add to current position in result array, including carry-over
                product += result[i + j + 1];
                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }

        // Convert result array to string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (sb.length() == 0 && r == 0) 
            {
                continue; // Skip leading zeros
            }
            sb.append(r);
        }

        return sb.toString();
    }
}
