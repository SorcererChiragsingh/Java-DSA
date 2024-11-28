// Leetcode:- https://leetcode.com/problems/minimum-obstacle-removal-to-reach-corner/description/?envType=daily-question&envId=2024-11-28
// Leet Code Question no. 2290
// Minimum Obstacle Removal to Reach Corner Problem DSA
// Youtube Solution:- 

//  (ms)(Beats 1%)
// Array; Binary Search; Divide and Conquer Problem
// Hard

// T.C = O(),
// S.C = O(), 

/**
- You are given a 0-indexed 2D integer array grid of size m x n. Each cell has one of two values:
- 0 represents an empty cell,
- 1 represents an obstacle that may be removed.
- You can move up, down, left, or right from and to an empty cell.
- Return the minimum number of obstacles to remove so you can move from the upper left corner (0, 0) to the lower right corner (m - 1, n - 1).
*/

/**
 Example:
Input: grid = [[0,1,1],[1,1,0],[1,1,0]]
Output: 2
Explanation: We can remove the obstacles at (0, 1) and (0, 2) to create a path from (0, 0) to (2, 2).
It can be shown that we need to remove at least 2 obstacles, so we return 2.
Note that there may be other ways to remove 2 obstacles to create a path.

*/

// Method using
// Graph

public class MinimumObstacleRemovalToReachCorner
{
    
}


/*
- Approach (Using Dijkstra's Algorothm - Assuming obstacle with edge weight 1 and empty with 0)
- T.C : O(m*n log(m*n))
- S.C : O(m*n)

public class MinimumObstacleRemovalToReachCorner
{

    public int minimumObstacles(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;

        int[][] result = new int[m][n];
        for (int[] row : result) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        result[0][0] = 0;

        // Min-heap to store {obstacleCount, {i, j}}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0});  // {obstacleCount, i, j}

        // Directions for moving up, down, left, and right
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int obstacleCount = current[0];
            int i = current[1];
            int j = current[2];

            for (int[] dir : directions) {
                int x = i + dir[0];
                int y = j + dir[1];

                // Check if (x, y) is within bounds
                if (x >= 0 && x < m && y >= 0 && y < n) {
                    int wt = (grid[x][y] == 1) ? 1 : 0;

                    if (obstacleCount + wt < result[x][y]) {
                        result[x][y] = obstacleCount + wt;
                        pq.offer(new int[]{obstacleCount + wt, x, y});
                    }
                }
            }
        }

        return result[m - 1][n - 1];
    }
}

*/