// Leetcode:- https://leetcode.com/problems/maximum-matrix-sum/description/?envType=daily-question&envId=2024-11-24
// Leet Code Question no. 1975
// Maximum Matrix Sum Problem DSA
// Youtube Solution:- https://www.youtube.com/watch?v=ca9ND5_EQxk&ab_channel=codestorywithMIK ;  

//  (ms)(Beats %)
//  (ms)(Beats %)
// Array; Greedy; Matrix Problem
// Medium

// T.C = O(n x m), //  
// S.C = O(1), //  

/**
- You are given an n x n integer matrix. You can do the following operation any number of times:
- Choose any two adjacent elements of matrix and multiply each of them by -1.
- Two elements are considered adjacent if and only if they share a border.
- Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.
*/

/**
 Example:

Input: matrix = [[1,-1],[-1,1]]
Output: 4
Explanation: We can follow the following steps to reach sum equals 4:
- Multiply the 2 elements in the first row by -1.
- Multiply the 2 elements in the first column by -1.
*/

// Method using 

public class MaximumMatrixSum 
{
    public static void main(String[] args) 
    {
        MaximumMatrixSum solution = new MaximumMatrixSum();
        
        int[][] matrix = {
            {1, -2, 3},
            {-4, 5, -6},
            {7, -8, 9}
        };

        long result = solution.maxMatrixSum(matrix);
        System.out.println("Maximum matrix sum: " + result);
    }
    public long maxMatrixSum(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;

        long sum = 0; // To store the sum of absolute values of all elements
        int countNegatives = 0; // To count the number of negative values in the matrix
        int smallestAbsoluteValue = Integer.MAX_VALUE; // To track the smallest absolute value

        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                sum += Math.abs(matrix[i][j]);

                if (matrix[i][j] < 0) 
                {
                    countNegatives++;
                }

                smallestAbsoluteValue = Math.min(smallestAbsoluteValue, Math.abs(matrix[i][j]));
            }
        }

        if (countNegatives % 2 == 0) 
        {
            return sum;
        }

        return sum - 2L * smallestAbsoluteValue;
    }
}
