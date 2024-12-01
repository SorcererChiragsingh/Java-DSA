// Leetcode:- https://leetcode.com/problems/climbing-stairs/description/
// Leet Code Question no. 70
// Climbing Stairs Problem DSA
// Youtube Solution:- 

// https://leetcode.com/problems/climbing-stairs/solutions/6034553/video-2-way-solutions-with-o-n-space-o-1-space  (0ms)(Beats 100%)
// Linked List; Recursion Problem
// Medium

// T.C = O(n),
// S.C = O(n), 

/**
- You are climbing a staircase. It takes n steps to reach the top.

- Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*/

/**
 Example:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

*/

// Method using
// 

public class ClimbingStairs 
{
    public int climbStairs(int n) 
    {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) 
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];        
    }
}
