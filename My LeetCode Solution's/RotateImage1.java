// Leetcode:- https://leetcode.com/problems/rotate-image/description/
// Leet Code Question no. 48 
// Rotate Image Problem DSA
// Solution:- https://www.youtube.com/watch?v=Z0R2u6gd3GU&ab_channel=takeUforward

// Array; Math; Matrix Problems
// Medium
// T.C = o()
// S.C = o()

/**
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

/**
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
*/
public class RotateImage1 
{
    public static void rotate(int[][] matrix) 
    {
        int n = matrix.length; // Define n

        // Transpose the matrix
        for(int i = 0; i < n; i++) 
        {
            for(int j = i; j < n; j++) 
            {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n / 2; j++) 
            {
                // Swap elements in the row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
     // Main Function
     public static void main(String args[]) 
     {
         int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
         rotate(arr);
         System.out.println("Rotated Image");
         for (int i = 0; i < arr.length; i++) 
         {
             for (int j = 0; j < arr.length; j++) 
             {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
 
     }
}
