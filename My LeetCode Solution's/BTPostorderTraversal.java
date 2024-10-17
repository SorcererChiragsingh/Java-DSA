// Leetcode:- https://leetcode.com/problems/binary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-08-25
// Leet Code Question no. 145
// Binary Tree Postorder Traversal Problem DSA
// Solution:- 

// https://techgeekyan.blogspot.com/2017/08/leetcode-145-binary-tree-postorder.html

// Stack, Tree, Depth-First Search, Binary Tree Problem

/*
->Recursive
->Iterative
->Morris
 */

// Easy

// T.C = o(n)
// S.C = o(n)

/** 
 Given the root of a binary tree, return the postorder traversal of its nodes' values.
 Recursive solution is trivial, could you do it iteratively?
*/

/**
Input: root = [1,null,2,3]
Output: [3,2,1]
 */

import java.util.ArrayList;
import java.util.List;



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BTPostorderTraversal 
{
    public static void main(String[] args) 
    {
        // Creating a sample binary tree:
        //         1
        //          \
        //           2
        //          /
        //         3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Creating an instance of BTPostorderTraversal
        BTPostorderTraversal traversal = new BTPostorderTraversal();

        // Calling the postorderTraversal method and storing the result
        List<Integer> result = traversal.postorderTraversal(root);

        // Printing the result
        System.out.println(result);  // Output should be [3, 2, 1]
    }

    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) 
    {
        if (root != null) 
        {
            if (root.left != null) 
            {
                helper(root.left, res);
            }
            if (root.right != null) 
            {
                helper(root.right, res);
            }
            res.add(root.val);
        }
    }
}

// Definition for a binary tree node.
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) 
    { 
        val = x; 
    }
}