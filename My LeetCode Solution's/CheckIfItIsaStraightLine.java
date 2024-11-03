// Leetcode:- https://leetcode.com/problems/check-if-it-is-a-straight-line/description/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 1232
// Check If It Is a Straight Line Problem DSA
// Solution:- 

// https://leetcode.com/problems/check-if-it-is-a-straight-line/solutions/3173000/solution-in-java
// Array; Math; Geometry Problem
// Easy

// T.C = o(n) 
// S.C = o(n) 
/**
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
Check if these points make a straight line in the XY plane.
*/

/**
 Example:

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
 */

 public class CheckIfItIsaStraightLine 
 {
    public static void main(String[] args) 
    {
        CheckIfItIsaStraightLine checker = new CheckIfItIsaStraightLine();

        int[][] coordinates1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};  // Expected: true
        int[][] coordinates2 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}};  // Expected: false
        int[][] coordinates3 = {{1, 2}, {1, 3}, {1, 4}};          // Expected: true (vertical line)

        System.out.println("Test 1: " + checker.checkStraightLine(coordinates1)); // true
        System.out.println("Test 2: " + checker.checkStraightLine(coordinates2)); // false
        System.out.println("Test 3: " + checker.checkStraightLine(coordinates3)); // true
    }

    public boolean checkStraightLine(int[][] coordinates) 
    {
        // Base case: if there are only two points, they always form a straight line
        if (coordinates.length == 2) 
        {
            return true;
        }

        // Calculate the slope between the first two points
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        
        int dx = x1 - x0;
        int dy = y1 - y0;

        // Check each subsequent point to see if it has the same slope
        for (int i = 2; i < coordinates.length; i++) 
        {
            int x = coordinates[i][0], y = coordinates[i][1];

            // Cross-multiply to avoid division and floating-point issues
            if (dy * (x - x0) != dx * (y - y0)) 
            {
                return false;
            }
        }

        return true;
    }
}
