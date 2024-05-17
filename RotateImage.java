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


/**
 This line of code is part of the nested loop used to transpose the matrix: for (int j = i; j < matrix[0].length; j++)
 Here’s a breakdown of what this line does:

Context
This line is inside the outer loop, which iterates over the rows of the matrix: for (int i = 0; i < matrix.length; i++)

Explanation:-

*Initialization (int j = i): The inner loop starts with j equal to i. 
This ensures that the loop only processes the upper triangular part of the matrix, including the diagonal. 
This is necessary to avoid swapping elements twice.

*Condition (j < matrix[0].length): The loop continues as long as j is less than the number of columns in the matrix. 
(matrix[0].length) gives the number of columns (since the matrix is a square matrix, the number of columns is the same as the number of rows).

*Increment (j++): After each iteration, j is incremented by 1.


*Purpose
By starting j at i and iterating up to the end of the row, 
this loop effectively swaps the element at position (i, j) with the element at position (j, i) without swapping the same elements twice.

*Example
For a 3x3 matrix, during the first iteration (i = 0), j will go from 0 to 2. The loop will swap:

(0,0) with (0,0) (no actual change)
(0,1) with (1,0)
(0,2) with (2,0)
During the second iteration (i = 1), j will go from 1 to 2. The loop will swap:

(1,1) with (1,1) (no actual change)
(1,2) with (2,1)
During the third iteration (i = 2), j will be 2. The loop will swap:

(2,2) with (2,2) (no actual change)
This ensures that the entire matrix is transposed correctly without redundant swaps.
 */
