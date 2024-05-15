// Leetcode:- https://leetcode.com/problems/set-matrix-zeroes/description/
// Leet Code Question no. 73
// Set Matrix Zeroes Problem DSA
// Solution:-

// Medium
// 

public class SetMatrixZeroes 
{
    public void setZeroes(int[][] matrix)
    {
        // Purpose of fr and fc
       // fr (first row): This flag is set to true if any element in the first row of the matrix is zero.
       // fc (first column): This flag is set to true if any element in the first column of the matrix is zero.
        boolean fr = false, fc = false;
/** 
 Initial Scan and Flag Setting:

The first nested for loop iterates through each element of the matrix.
If an element is zero (matrix[i][j] == 0), the corresponding first row element (matrix[0][j]) and first column element (matrix[i][0]) are set to zero.
Additionally, if the zero is found in the first row (i == 0), fr is set to "true".
If the zero is found in the first column (j == 0), fc is set to "true".
*/   
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if (matrix[i][j] == 0) 
                {
                    if (i == 0) fr = true;
                    if (j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
/**
 
*/        
        for (int i = 1; i < matrix.length; i++) 
        {
            for (int j = 1; j < matrix[0].length; j++) 
            {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) 
                {
                    matrix[i][j] = 0;
                }
            }
        }
/**
Setting First Row and Column Zeroes if Necessary:

Finally, based on the flags fr and fc, the first row and first column are set to zero if needed.
*/        
        if (fr) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                matrix[0][j] = 0;
            }
        }
        if (fc) 
        {
            for (int i = 0; i < matrix.length; i++) 
            {
                matrix[i][0] = 0;
            }
        }     
    }
// Main function
    public static void main(String[] args) 
    {
        SetMatrixZeroes obj = new SetMatrixZeroes();
        
        // Example matrix
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        obj.setZeroes(matrix);

        System.out.println("Matrix After setZeroes:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int elem : row) 
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
