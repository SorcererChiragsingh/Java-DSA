// Leetcode:- https://leetcode.com/problems/add-binary/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 67
// Add Binary Problem DSA
// Solution:- 

// https://leetcode.com/problems/add-binary/solutions/1679423/well-detailed-explaination-java-c-python-easy-for-mind-to-accept-it
// https://leetcode.com/problems/add-binary/solutions/24488/short-ac-solution-in-java-with-explanation
// Math; String; Bit Manipulation; Simulation Problem
// Easy

// T.C = o(n) 
// S.C = o(n) 
/**
Given two binary strings a and b, return their sum as a binary string.
*/

/**
 Example:

Input: a = "11", b = "1"
Output: "100"
 */

 public class AddBinary 
 {
    public static void main(String[] args) 
    {
        AddBinary addBinary = new AddBinary();
        
        // Example binary numbers
        String binary1 = "1010";
        String binary2 = "1101";
        
        // Adding the binary numbers
        String result = addBinary.addBinary(binary1, binary2);
        
        // Printing the result
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + result);
    }
    public String addBinary(String a, String b) 
    {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        // Traverse both strings from the end towards the beginning
        while (i >= 0 || j >= 0) 
        {
            int sum = carry;

            // Add corresponding digit from 'a' if available
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            
            // Add corresponding digit from 'b' if available
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            // Append the current bit (0 or 1) to the result
            sb.append(sum % 2);

            // Update the carry
            carry = sum / 2;
        }

        // If there's a remaining carry, append it
        if (carry != 0) 
        {
            sb.append(carry);
        }

        // The result is currently reversed, so reverse it back
        return sb.reverse().toString();
    }
}
