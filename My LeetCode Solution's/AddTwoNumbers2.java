// Leetcode:- https://leetcode.com/problems/add-two-numbers-ii/description/?envType=study-plan-v2&envId=programming-skills
// Leet Code Question no. 445
// Add Two Numbers II Problem DSA
// Solution:- https://www.youtube.com/watch?v=KMS0WFxrsT8&ab_channel=NikhilLohia (3ms)(Beats 39.83%)

// https://leetcode.com/problems/add-two-numbers-ii/solutions/3777742/beats-100-java-easy-solution
// Math; LinkedList; Stack Problem
// Medium

// T.C = O(n + m), //  The recursive addition process goes through each node once, again in O(n + m) time.
// S.C = O(n + m), // {Stack memory used while calling function recursively.} The new linked list created to store the sum result, which will have a maximum of max(n, m) + 1 nodes (to account for any extra carry node).

/**
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

/**
 Example:

Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]
*/

// using recursion

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
public class AddTwoNumbers2 
{
    public static void main(String[] args) 
    {
        // Creating first number as a linked list: 7 -> 2 -> 4 -> 3 represents the number 7243
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        // Creating second number as a linked list: 5 -> 6 -> 4 represents the number 564
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Instantiate AddTwoNumbers2 and call the addTwoNumbers method
        AddTwoNumbers2 adder = new AddTwoNumbers2();
        ListNode result = adder.addTwoNumbers(l1, l2);

        // Print the result linked list
        System.out.print("Sum: ");
        printList(result);
    }

    // Helper method to print the linked list
    private static void printList(ListNode node) 
    {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        // Step 1: Calculate lengths of both lists
        int size1 = getSize(l1);
        int size2 = getSize(l2);

        // Step 2: Make recursive call to add numbers
        ListNode result = new ListNode(0);
        int carry = (size1 > size2) ? helper(l1, l2, result, size1, size2) : helper(l2, l1, result, size2, size1);

        // Step 3: If there's a carry left, add it to the front of the list
        if (carry == 1) {
            ListNode head = new ListNode(1);
            head.next = result;
            return head;
        }
        return result;
    }

    // Helper method to get the size of a linked list
    private int getSize(ListNode node) 
    {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    // Recursive helper function to add numbers from the two lists
    private int helper(ListNode l1, ListNode l2, ListNode result, int size1, int size2) 
    {
        if (size1 == 0) return 0;

        // Advance to the next digit and set up a new node for the next result digit
        if (size1 > size2) {
            result.next = new ListNode(0);
            result.val = l1.val + helper(l1.next, l2, result.next, size1 - 1, size2);
        } else if (size1 == size2) {
            result.next = new ListNode(0);
            result.val = l1.val + l2.val + helper(l1.next, l2.next, result.next, size1 - 1, size2 - 1);
        }

        // Handle carry-over if the result digit is >= 10
        if (result.val >= 10) {
            result.val -= 10;
            return 1;
        }
        return 0;
    }

    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


//////////////////////////////////////////////////////////////////////
/** youtuber solution
public class AddTwoNumbers2 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {

    if (l1 == null) return l2;
    if (l2 == null) return l1;

    Stack<Integer> list1 = new Stack<>();
    Stack<Integer> list2 = new Stack<>();

    while (l1 != null) {
      list1.push(l1.val);
      l1 = l1.next;
    }

    while (l2 != null) {
      list2.push(l2.val);
      l2 = l2.next;
    }

    int carry = 0;
    ListNode answer = new ListNode(0);
    while (!list1.empty() && !list2.empty()) {
      int sum = list1.pop() + list2.pop() + carry;
      if (sum >= 10) {
        answer.val = sum % 10;
        carry = 1;
      } else {
        answer.val = sum;
        carry = 0;
      }
      ListNode res = answer;
      answer = new ListNode(0);
      answer.next = res;
    }

    if (list1.size() == 0 && list2.size() == 0) {
      if (carry == 1) {
        answer.val = 1;
        return answer;
      }
      return answer.next;
    }

    Stack<Integer> remainingElements = list1.size() == 0 ? list2 : list1;
    while (!remainingElements.empty()) {
      int sum = remainingElements.pop() + carry;
      if (sum >= 10) {
        answer.val = sum % 10;
        carry = 1;
      } else {
        answer.val = sum;
        carry = 0;
      }
      ListNode res = answer;
      answer = new ListNode(0);
      answer.next = res;
    }

    if (carry == 1) {
      answer.val = 1;
      return answer;
    }
    return answer.next;
  }

}

*/