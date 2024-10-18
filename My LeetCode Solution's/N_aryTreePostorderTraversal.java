// Leetcode:- https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/?envType=daily-question&envId=2024-08-26
// Leet Code Question no. 590
// N-ary Tree Postorder Traversal  Problem DSA
// Solution:- 

// https://leetcode.com/problems/n-ary-tree-postorder-traversal/solutions/5691517/simple-java-c-code

// Stack, Tree, Depth-First Search Problem

/*
->Recursive
->Iterative
->Morris
 */

// Easy

// T.C = o(n)
// S.C = o(n)
/**
Given the root of an n-ary tree, return the postorder traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
*/
import java.util.ArrayList;
import java.util.List;

/**
Example:

Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]
*/

// Follow up: Recursive solution is trivial, could you do it iteratively?

 /*
 Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Node 
{
    public int val;
    public List<Node> children;

    // Default constructor
    public Node() 
    {
        this.children = new ArrayList<>();  // Initialize the children list
    }

    // Constructor with a value
    public Node(int _val) 
    {
        this.val = _val;
        this.children = new ArrayList<>();  // Initialize the children list
    }

    // Constructor with a value and a list of children
    public Node(int _val, List<Node> _children) 
    {
        this.val = _val;
        this.children = _children;
    }
}

public class N_aryTreePostorderTraversal 
{

    public List<Integer> postorder(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) 
        {
            return list;
        }
        help(list, root);
        return list;
    }

    private void help(ArrayList<Integer> list, Node root) 
    {
        for (Node child : root.children) 
        {
            help(list, child);
        }
        list.add(root.val);  // Add the root value after all children have been processed
    }

    public static void main(String[] args) 
    {
        // Create the tree: 
        //        1
        //      / | \
        //     3  2  4
        //    / \
        //   5   6
        Node root = new Node(1);
        Node child1 = new Node(3);
        Node child2 = new Node(2);
        Node child3 = new Node(4);
        Node child4 = new Node(5);
        Node child5 = new Node(6);

        // Add children to child1
        child1.children.add(child4);
        child1.children.add(child5);

        // Add children to root
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Perform postorder traversal
        N_aryTreePostorderTraversal solution = new N_aryTreePostorderTraversal();
        List<Integer> result = solution.postorder(root);

        // Output should be [5, 6, 3, 2, 4, 1]
        System.out.println(result);
    }
}
