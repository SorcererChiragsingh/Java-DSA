// Leetcode:- https://leetcode.com/problems/spiral-matrix-iv/description/?envType=daily-question&envId=2024-09-09
// Leet Code Question no. 2326
// Spiral Matrix IV Problem DSA
// Solution:- 

// https://leetcode.com/problems/spiral-matrix-iv/solutions/5758107/beats-100-explained-with-video-c-java-python-simulation-explained-in-detail
// Array ,Linked List ,Matrix ,Simulation

// Medium

// T.C = o(rows×columns)
// S.C = o(rows×columns)

// You are given two integers m and n, which represent the dimensions of a matrix.
// You are also given the head of a linked list of integers.
// Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. 
// If there are remaining empty spaces, fill them with -1.

// Return the generated matrix.
/**
 Example 1:

Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
Explanation: The diagram above shows how the values are printed in the matrix.
Note that the remaining spaces in the matrix are filled with -1.

 */

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */ 
class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val) 
    {
        this.val = val;
        this.next = null;
    }
}

public class SpiralMatrix4 
{
    public int[][] spiralMatrix(int rows, int columns, ListNode head) 
    {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) 
        {
            matrix[i] = new int [columns];
            Arrays.fill(matrix[i], -1);
        }

        int topRow = 0, bottomRow = rows - 1, leftColumn = 0, rightColumn = columns - 1;
        while (head != null) 
        {
        // Traverse from left to right across the top row
            for (int col = leftColumn; col <= rightColumn && head != null; col++) 
            {
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;

        // Traverse from top to bottom along the right column
            for (int row = topRow; row <= bottomRow && head != null; row++) 
            {
                matrix[row][rightColumn] = head.val;
                head = head.next;
            }
            rightColumn--;

        // Traverse from right to left along the bottom row
            for (int col = rightColumn; col >= leftColumn && head != null; col--) 
            {
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;

        // Traverse from bottom to top along the left column
            for (int row = bottomRow; row >= topRow && head != null; row--) 
            {
                matrix[row][leftColumn] = head.val;
                head = head.next;
            }
            leftColumn++;
        }

        return matrix;
    }
    public static void main(String[] args) 
    {
        // Creating a linked list with the values: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        // Define the matrix dimensions
        int rows = 3;
        int columns = 4;

        // Create an instance of SpiralMatrix4 and call spiralMatrix method
        SpiralMatrix4 sm = new SpiralMatrix4();
        int[][] result = sm.spiralMatrix(rows, columns, head);

        // Print the result
        for (int[] row : result) 
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
