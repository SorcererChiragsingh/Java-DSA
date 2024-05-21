// Leetcode:- https://leetcode.com/problems/plus-one/description/
// Leet Code Question no. 66
// Plus One Problem DSA
// Solution:- https://www.youtube.com/watch?v=8fbzKTSCvzo&ab_channel=Codebix ; https://www.youtube.com/watch?v=iBk_JyxxuN8&t=312s&ab_channel=Technosage

// 
// Basic Maths Problem

// Easy

// T.C = o(n)
// S.C = o(n)
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
        for (int i= n-1 ; i>=0 ; i--) // checking from the right side.
        {
            if ( digits[i] != 9)
            {
                digits[i]++;
                break;
            }
            else 
            {
                digits[i]=0;
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
