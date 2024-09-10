// Leetcode:- https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/?envType=daily-question&envId=2024-09-10
// Leet Code Question no. 2807
// Insert Greatest Common Divisors in Linked List Problem DSA
// Solution:- 

// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/solutions/5764192/best-solution-beats-100-with-proof-all-languages-easy-explained
// Linked List, Math, NumberTheory

// Medium

// T.C = o(n)
// S.C = o(1)

// Given the head of a linked list head, in which each node contains an integer value.
// Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
// Return the linked list after insertion.
// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

/**
 Example 1:
Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]

Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
There are no more adjacent nodes, so we return the linked list.
 */


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
// Definition for singly-linked list node
class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class InsertGreatestCommonDivisorLinkedList 
{

    public static void main(String[] args) 
    {
        // Create a sample linked list: 18 -> 12 -> 9 -> 3
        ListNode head = new ListNode(18);
        head.next = new ListNode(12);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(3);
        
        // Create an instance of the class and call the method
        InsertGreatestCommonDivisorLinkedList solution = new InsertGreatestCommonDivisorLinkedList();
        ListNode modifiedHead = solution.insertGreatestCommonDivisors(head);
        
        // Print the modified list
        printList(modifiedHead);
    }
    
    // Helper function to print the linked list
    public static void printList(ListNode head) 
    {
        ListNode curr = head;
        while (curr != null) 
        {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Method to insert greatest common divisors between consecutive nodes
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode curr = head;
        while (curr != null && curr.next != null) 
        {
            // Create a new node with the GCD of curr and curr.next
            int gcdValue = gcd(curr.val, curr.next.val);
            ListNode newNode = new ListNode(gcdValue);
            
            // Insert the new node between curr and curr.next
            newNode.next = curr.next;
            curr.next = newNode;
            
            // Move curr two steps forward to avoid infinite loop
            curr = newNode.next;
        }
        return head;
    }
    
    // Helper function to calculate GCD
    public int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return gcd(b, a % b);
    }
}

