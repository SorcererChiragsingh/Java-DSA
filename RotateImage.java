// Leetcode:- https://leetcode.com/problems/rotate-image/description/
// Leet Code Question no. 48 
// Rotate Image Problem DSA
// Solution:- https://www.youtube.com/watch?v=Z0R2u6gd3GU&ab_channel=takeUforward

// Medium
// 


public class RotateImage 
{
    public static void rotate(int[][] matrix) 
    {
        // Transpose the matrix 
/**
Transpose the Matrix
The first step in rotating the matrix is to transpose it. Transposing a matrix means converting its rows into columns and columns into rows. 
*/  

/**
 In this nested loop:-
The outer loop iterates over each row i. 
The inner loop iterates over each column j starting from i, ensuring that we only swap elements once.
The elements matrix[i][j] and matrix[j][i] are swapped.
*/      
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = i; j < matrix[0].length; j++) 
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse 
/**
After transposing, the next step is to reverse each row of the matrix. This will complete the 90-degree clockwise rotation.
*/        

/**
 In this nested loop:-
 The outer loop iterates over each row i.
 The inner loop iterates over each element j in the row up to the middle (matrix.length / 2).
 The elements matrix[i][j] and matrix[i][matrix.length - 1 - j] are swapped, effectively reversing the row.
 */
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix.length / 2; j++) 
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
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
