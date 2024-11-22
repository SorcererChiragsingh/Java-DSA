// Leetcode:- https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/description/?envType=daily-question&envId=2024-11-22
// Leet Code Question no. 1072
// Flip Columns For Maximum Number of Equal Rows Problem DSA
// Youtube Solution:- 

// https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/solutions/6070318/beats-100-video-full-explain-simple-short (5ms)(Beats 100%)
// Array; Hash Table; Matrix Problem
// Medium

// T.C = O(n*m), //  
// S.C = O(n), //  

/**
- You are given an m x n binary matrix matrix.

- You can choose any number of columns in the matrix and flip every cell in that column (i.e., Change the value of the cell from 0 to 1 or vice versa).
- Return the maximum number of rows that have all values equal after some number of flips.

*/

/**
 Example:
Input: matrix = [[0,1],[1,1]]
Output: 1
Explanation: After flipping no values, 1 row has all values equal.

*/

// Method using Hash Map

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class FlipColumnsForMaximumNumberofEqualRows 
{
    public static void main(String[] args) 
    {
        FlipColumnsForMaximumNumberofEqualRows solution = new FlipColumnsForMaximumNumberofEqualRows();
        
        int[][] matrix = 
        {
            {0, 1},
            {1, 0},
            {0, 1}
        };
        
        int result = solution.maxEqualRowsAfterFlips(matrix);
        System.out.println("Maximum number of equal rows after flips: " + result);
    }

    public int maxEqualRowsAfterFlips(int[][] matrix) 
    {
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        
        for (int[] row : matrix) 
        {
            // Create two canonical forms for the row
            StringBuilder normal = new StringBuilder();
            StringBuilder flipped = new StringBuilder();
            
            for (int val : row) 
            {
                normal.append(val);
                flipped.append(1 - val);
            }
            
            // Count both representations in the map
            String normalKey = normal.toString();
            String flippedKey = flipped.toString();
            
            map.put(normalKey, map.getOrDefault(normalKey, 0) + 1);
            map.put(flippedKey, map.getOrDefault(flippedKey, 0) + 1);
            
            // Update the maximum count
            maxCount = Math.max(maxCount, Math.max(map.get(normalKey), map.get(flippedKey)));
        }
        
        return maxCount;
    }
}
