// Leetcode:- https://leetcode.com/problems/move-pieces-to-obtain-a-string/description/?envType=daily-question&envId=2024-12-05
// Leet Code Question no. 2337
// Move Pieces to Obtain a String Problem DSA
// Youtube Solution:- https://www.youtube.com/watch?v=OlfIyTpCzvM&ab_channel=codestorywithMIK ; 

//  (15ms)(Beats 66.47%)
// Two Pointers; String Problem
// Medium

// T.C = O(n),
// S.C = O(1), 

/**
- You are given two strings start and target, both of length n. Each string consists only of the characters 'L', 'R', and '_' where:
- The characters 'L' and 'R' represent pieces, 
where a piece 'L' can move to the left only if there is a blank space directly to its left, and a piece 'R' can move to the right only if there is a blank space directly to its right.
- The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
- Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times. Otherwise, return false.
*/

/**
 Example:

Input: start = "_L__R__R_", target = "L______RR"
Output: true
Explanation: We can obtain the string target from start by doing the following moves:
- Move the first piece one step to the left, start becomes equal to "L___R__R_".
- Move the last piece one step to the right, start becomes equal to "L___R___R".
- Move the second piece three steps to the right, start becomes equal to "L______RR".
Since it is possible to get the string target from start, we return true.

*/

// Method using 2 Pointers
// 

public class MovePiecesToObtainaString // class
{
    public static void main(String[] args) 
    {
        MovePiecesToObtainaString solution = new MovePiecesToObtainaString();

        String start1 = "_L__R__R_";
        String target1 = "L______RR";
        System.out.println(solution.canChange(start1, target1)); // Expected output: true

        String start2 = "R_L_";
        String target2 = "__LR";
        System.out.println(solution.canChange(start2, target2)); // Expected output: false

        String start3 = "_R";
        String target3 = "R_";
        System.out.println(solution.canChange(start3, target3)); // Expected output: false
    }
    public boolean canChange(String start, String target) // method
    {
        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) 
        {
            // Skip underscores in the start string
            while (i < n && start.charAt(i) == '_') {
                i++;
            }

            // Skip underscores in the target string
            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            // Check if both pointers have reached the end
            if (i == n || j == n) {
                return i == n && j == n;
            }

            // If the characters at i and j are different, transformation is not possible
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Check for invalid moves
            if (start.charAt(i) == 'L' && i < j) {
                return false;  // 'L' can't move to the right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false;  // 'R' can't move to the left
            }

            // Move both pointers forward
            i++;
            j++;
        }

        return true;
    }
  
}


/** (https://leetcode.com/problems/move-pieces-to-obtain-a-string/solutions/6114504/100-beats-short-simple) (13ms) (Beats 92.35%)
 
* waitL - count waiting L
* waitR - count waiting R 

public class MovePiecesToObtainaString 
{
    public boolean canChange(String start, String target) 
    {
        if (start.equals(target)) {
            return true;
        }
        int waitL = 0;
        int waitR = 0;
        
        for (int i = 0; i < start.length(); i++) {
            char curr = start.charAt(i);
            char goal = target.charAt(i);
            
            if (curr == 'R') {
                if (waitL > 0) {
                    return false;
                }
                waitR++;
            }
            if (goal == 'L') {
                if (waitR > 0) {
                    return false;
                }
                waitL++;
            }
            if (goal == 'R') {
                if (waitR == 0) {
                    return false;
                }
                waitR--;
            }
            if (curr == 'L') {
                if (waitL == 0) {
                    return false;
                }
                waitL--;
            }
        }
        
        return waitL == 0 && waitR == 0;
    }
}
*/