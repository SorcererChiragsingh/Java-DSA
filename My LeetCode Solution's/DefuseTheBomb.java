// Leetcode:- https://leetcode.com/problems/defuse-the-bomb/description/?envType=daily-question&envId=2024-11-18
// Leet Code Question no. 1652
// Defuse the Bomb Problem DSA
// Solution:- https://www.youtube.com/watch?v=nc2-IYXhwo8&ab_channel=CodeThoughts (0ms)(Beats 100%)

// https://leetcode.com/problems/defuse-the-bomb/solutions/6056652/let-s-understand-with-simple-example-sliding-widow-with-added-youtube-solution
// Array; Sliding Window Problem
// Easy

// T.C = O(n), //  The time complexity of the decrypt method is O(n), where n is the size of the code array.
// S.C = O(n), //  The space complexity of the method is O(n), The ans array of size n is used to store the results, contributing O(n).

/**
- You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.

- To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.

If k > 0, replace the ith number with the sum of the next k numbers.
If k < 0, replace the ith number with the sum of the previous k numbers.
If k == 0, replace the ith number with 0.
- As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

- Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
*/

/**
 Example:

Input: code = [5,7,1,4], k = 3
Output: [12,10,16,13]
Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
*/

// Method using Sliding Window Technique.

import java.util.Arrays;

public class DefuseTheBomb 
{
    public static void main(String[] args)
    {
        // Create an instance of the DefuseTheBomb class
        DefuseTheBomb dtb = new DefuseTheBomb();

        // Test case 1: Positive k
        int[] code1 = {5, 7, 1, 4};
        int k1 = 3;
        int[] result1 = dtb.decrypt(code1, k1);
        System.out.println("Input: " + Arrays.toString(code1) + ", k = " + k1);
        System.out.println("Output: " + Arrays.toString(result1)); // Expected output: [12, 10, 16, 13]

        // Test case 2: Negative k
        int[] code2 = {2, 4, 9, 3};
        int k2 = -2;
        int[] result2 = dtb.decrypt(code2, k2);
        System.out.println("\nInput: " + Arrays.toString(code2) + ", k = " + k2);
        System.out.println("Output: " + Arrays.toString(result2)); // Expected output: [12, 5, 6, 13]

        // Test case 3: k = 0
        int[] code3 = {1, 2, 3, 4};
        int k3 = 0;
        int[] result3 = dtb.decrypt(code3, k3);
        System.out.println("\nInput: " + Arrays.toString(code3) + ", k = " + k3);
        System.out.println("Output: " + Arrays.toString(result3)); // Expected output: [0, 0, 0, 0]

        // Test case 4: Edge case with a single element
        int[] code4 = {10};
        int k4 = 1;
        int[] result4 = dtb.decrypt(code4, k4);
        System.out.println("\nInput: " + Arrays.toString(code4) + ", k = " + k4);
        System.out.println("Output: " + Arrays.toString(result4)); // Expected output: [0]

        // Test case 5: Large k
        int[] code5 = {1, 2, 3, 4};
        int k5 = 5;
        int[] result5 = dtb.decrypt(code5, k5);
        System.out.println("\nInput: " + Arrays.toString(code5) + ", k = " + k5);
        System.out.println("Output: " + Arrays.toString(result5)); // Circular behavior
    }
    public int[] decrypt(int[] code, int k) // algo starts from here
    {
        int n = code.length;     
    int ans[] = new int[n];
    int start = 0, end =0; 
    if(k==0)
    return ans; 

    if(k>0)
    {
        start = 1;
        end = k ; 
    }
    else
    {
        start = n-Math.abs(k);
        end = n-1;
    }
    int sum = 0; 
    for(int i=start; i<=end; i++)
    sum += code[i];

    for(int i=0; i<n; i++)
    {
       ans[i] = sum ; 
       sum = sum - code[(start)%n];
       sum = sum + code[(end+1)%n]; 
       start++; 
       end++;  
    }
     return ans;
    }
}
