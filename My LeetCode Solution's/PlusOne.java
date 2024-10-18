// Leetcode:- https://leetcode.com/problems/plus-one/description/
// Leet Code Question no. 66
// Plus One Problem DSA
// Solution:- https://www.youtube.com/watch?v=8fbzKTSCvzo&ab_channel=Codebix ; https://www.youtube.com/watch?v=iBk_JyxxuN8&t=312s&ab_channel=Technosage

// Array; Maths Problem
// Easy

// T.C = o(n)
// S.C = o(n)

/**
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
*/

/**
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/
import java.util.Arrays;

public class PlusOne 
{
    public static void main(String[] args) 
    {
        int [] digits = {0,0};
        // int [] digits = {4,9,9,9,9}; 
        // int [] digits = {9,9,9,9};  
        // int [] digits = {1,2,3}; 
        // int [] digits = {5,8,2,7,7,9}; 
        System.out.println(Arrays.toString(plusOne(digits)));
        
    }
    public static int [] plusOne (int [] digits)
    {
        int n = digits.length;
        for (int i= n-1 ; i>=0 ; i--) // checking from the right side.(Going form right to left)
        {
            if ( digits[i] != 9) // checking for numbers 1 to 8
            {
                digits[i]++;
                break;
            }
            else         // If number is 9 then,
            {
                digits[i]=0;  // replace it with 0, then again traverse in above loop. 
            }
        }
        if (digits[0]==0)  // if index 0 pe value 0 h to 
    {
        int [] idx = new int [n+1];  // create a new array of size +1 from previous array
        idx[0]=1; // and put 1 at index 0 in new array.
        return idx;
    }
    return digits;
    }
    
}
