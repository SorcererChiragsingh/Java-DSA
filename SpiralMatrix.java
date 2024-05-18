// Leetcode:- https://leetcode.com/problems/spiral-matrix/description/
// Leet Code Question no. 54
// Spiral Matrix Problem DSA
// Solution:- https://www.youtube.com/watch?v=3Zv-s9UUrFM&ab_channel=takeUforward ; https://www.youtube.com/watch?v=1CdolnvxLs0&ab_channel=CodeHelp-byBabbar

// Medium
// Print the matrix in spiral manner
// https://github.com/loveBabbar/CodeHelp-DSA-Busted-Series/blob/main/Lecture023%202D%20arrays/SpiralPrint.java
// https://leetcode.com/problems/spiral-matrix/solutions/3503396/java-code
// https://leetcode.com/problems/spiral-matrix/solutions/20599/super-simple-and-easy-to-understand-solution

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix // class:- SpiralMatrix
{
    public List<Integer> spiralOrder(int[][] matrix) // Method:- spiralOrder
    {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) // If the matrix is empty (i.e., has zero rows), the function returns the empty list "res".
        {
            return res; // "res" is an ArrayList that will store the elements of the matrix in spiral order.
        }
        
        int rowBegin = 0;  // rowBegin is initialized to 0, representing the starting row.
        int rowEnd = matrix.length-1;  // rowEnd is initialized to the last row index (matrix.length - 1).
        int colBegin = 0;   // colBegin is initialized to 0, representing the starting column.
        int colEnd = matrix[0].length - 1;  // colEnd is initialized to the last column index (matrix[0].length - 1).
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) // The while loop continues as long as the current boundaries are valid (rowBegin <= rowEnd and colBegin <= colEnd).
        {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) 
            {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) 
            {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) 
            {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) 
                {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) 
            {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) 
                {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res; // The function returns the list res which contains the elements of the matrix in spiral order.
    }
    // Main Function
    public static void main(String[] args) 
    {
        SpiralMatrix SpiralMatrix = new SpiralMatrix();
        
        int[][] matrix = 
        {
            {1, 2, 3,4,5,6},
            {20,21,22,23,24,7},
            {19,32,33,34,25,8},
            {18,31,36,35,26,9},
            {17,30,29,28,27,10},
            {16,15,14,13,12,11}
        };
        
        List<Integer> res = SpiralMatrix.spiralOrder(matrix);
        
        System.out.println("Spiral order: " + res);
    }
}

/**
 Traverse Right:-

Iterate from colBegin to colEnd along the rowBegin row.
Add each element to res.
Move the rowBegin boundary down by incrementing rowBegin.

Traverse Down:-

Iterate from rowBegin to rowEnd along the colEnd column.
Add each element to res.
Move the colEnd boundary left by decrementing colEnd.

Traverse Left (if rowBegin <= rowEnd):-

Iterate from colEnd to colBegin along the rowEnd row.
Add each element to res.
Move the rowEnd boundary up by decrementing rowEnd.

Traverse Up (if colBegin <= colEnd):-

Iterate from rowEnd to rowBegin along the colBegin column.
Add each element to res.
Move the colBegin boundary right by incrementing colBegin.

 */
