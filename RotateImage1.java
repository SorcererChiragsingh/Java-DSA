// Leetcode:- https://leetcode.com/problems/rotate-image/description/
// Leet Code Question no. 48 
// Rotate Image Problem DSA
// Solution:- https://www.youtube.com/watch?v=Z0R2u6gd3GU&ab_channel=takeUforward

// Medium
// 


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
