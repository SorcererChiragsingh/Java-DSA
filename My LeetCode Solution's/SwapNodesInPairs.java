// Leetcode:- https://leetcode.com/problems/swap-nodes-in-pairs/description/
// Leet Code Question no. 24
// Swap Nodes in Pairs Problem DSA
// Youtube Solution:- 

// https://leetcode.com/problems/swap-nodes-in-pairs/solutions/5689972/video-keep-the-second-node-and-next-pair-node (0ms)(Beats 100%)
// Linked List; Recursion Problem
// Medium

// T.C = O(n),
// S.C = O(1), 

/**
- Given a linked list, swap every two adjacent nodes and return its head. 
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

*/

/**
 Example:

Input: head = [1,2,3,4]
Output: [2,1,4,3]

*/

// Method using
// 

public class SwapNodesInPairs 
{
    public static void main(String[] args) 
    {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Instantiate the SwapNodesInPairs class
        SwapNodesInPairs swapper = new SwapNodesInPairs();

        // Call the swapPairs method
        ListNode result = swapper.swapPairs(head);

        // Print the resulting linked list
        printList(result);
    }

    // Method to swap nodes in pairs
    public ListNode swapPairs(ListNode head) 
    {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, cur = head;

        while (cur != null && cur.next != null) 
        {
            ListNode npn = cur.next.next; // Node after the pair
            ListNode second = cur.next; // Second node in the pair

            // Swap the nodes
            second.next = cur;
            cur.next = npn;
            prev.next = second;

            // Move pointers forward
            prev = cur;
            cur = npn;
        }

        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Definition for singly-linked list node
class ListNode 
{
    int val;
    ListNode next;

    // Constructor
    ListNode(int val) 
    {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) 
    {
        this.val = val;
        this.next = next;
    }
}

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