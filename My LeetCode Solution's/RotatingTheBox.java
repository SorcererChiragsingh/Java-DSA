// Leetcode:- https://leetcode.com/problems/rotating-the-box/description/?envType=daily-question&envId=2024-11-23
// Leet Code Question no. 1861
// Rotating the Box Problem DSA
// Youtube Solution:- https://www.youtube.com/watch?v=LZr1w0LVzFw&ab_channel=NeetCodeIO  ;  https://www.youtube.com/watch?v=6zDLIE0-9AU&ab_channel=codestorywithMIK

// https://leetcode.com/problems/rotating-the-box/solutions/6074461/ultimate-diagram-explanation-beginner-recommended (7ms)(Beats 79.67%)
// https://leetcode.com/problems/rotating-the-box/solutions/6073397/video-short-and-simple (7ms)(Beats 79.67%)
// Array; Two Pointers; Matrix Problem
// Medium

// T.C = O(n x m), //  
// S.C = O(1), //  

/**
- You are given an m x n matrix of characters box representing a side-view of a box. Each cell of the box is one of the following:
A stone '#'
A stationary obstacle '*'
Empty '.'

- The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. 
Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions. 
- It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.
- Return an n x m matrix representing the box after the rotation described above. 
*/

/**
 Example:

Input: box = [["#",".","#"]]
Output: [["."],
         ["#"],
         ["#"]]
*/

// Method using Matrix Transformation for rotation.

public class RotatingTheBox 
{
    public static void main(String[] args) // main class
    {
        RotatingTheBox solution = new RotatingTheBox();
        
        // Example input box
        char[][] box = {
            {'#', '.', '#'},
            {'#', '#', '*'},
            {'#', '*', '.'}
        };
        
        // Rotate the box
        char[][] rotatedBox = solution.rotateTheBox(box);
        
        // Print the rotated box
        for (char[] row : rotatedBox) 
        {
            for (char c : row) 
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public char[][] rotateTheBox(char[][] box) // algo
    {
        int m = box.length;
        int n = box[0].length;
            
        // Step 1: Simulate the gravity for each row
        for (char[] row : box) 
        {
            int dropPos = n - 1;
                
            for (int currPos = n - 1; currPos >= 0; currPos--) 
            {
                if (row[currPos] == '*') 
                {
                    dropPos = currPos - 1; // Reset the drop position when hitting an obstacle
                } 
                else if (row[currPos] == '#') 
                {
                    // Swap the current stone with the position where it drops
                    char temp = row[dropPos];
                    row[dropPos] = row[currPos];
                    row[currPos] = temp;
                    dropPos--; // Move drop position to the left
                }
            }
        }
            
        // Step 2: Rotate the box clockwise
        char[][] rotatedBox = new char[n][m];
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                rotatedBox[j][m - 1 - i] = box[i][j];
            }
        }
            
        return rotatedBox;
    }

}

/**
class Solution {
    public char[][] rotateTheBox(char[][] box) {
    int m = box.length, n = box[0].length;    
    char ans[][] = new char[n][m];
    for(char d[] : ans)
    Arrays.fill(d, '.');
   

    for(int i=0; i<m; i++)
    {
     int minIndex  = n-1;   
     for(int j=n-1; j>=0; j--)
     {
      if(box[i][j]=='#')
      {
      ans[minIndex][m-i-1] = '#';
      minIndex--;
      }
      if(box[i][j]=='*')
      {
      minIndex = j-1;
      ans[j][m-i-1] = '*';
      }  
     } 
    }
    return ans;
  }
}
 */