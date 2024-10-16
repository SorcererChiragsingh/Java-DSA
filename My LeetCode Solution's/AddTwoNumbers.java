// Leetcode:- https://leetcode.com/problems/add-two-numbers/description/
// Leet Code Question no. 2
// Add Two Numbers Problem DSA
// Solution:- 


// Recursion / LinkedList Problem

// Easy

// T.C = o(max(m,n))
// S.C = o(max(m,n))

/**
Example 1:
 Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */

 public class AddTwoNumbers 
 {
    public static void main(String[] args) 
    {
        // Creating two linked lists representing two numbers
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3); // Represents the number 342

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4); // Represents the number 465

        // Adding the two numbers
        AddTwoNumbers adder = new AddTwoNumbers();
        ListNode result = adder.addTwoNumbers(l1, l2);

        // Printing the resulting list
        System.out.print("Sum: ");
        while (result != null) 
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) 
        {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}

class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/**
public class AddTwoNumbers 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) 
        {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
    
}
*/