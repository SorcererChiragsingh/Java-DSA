// Leetcode:- https://leetcode.com/problems/merge-two-sorted-lists/description/
// Leet Code Question no. 21
// Merge Two Sorted Lists Problem DSA
// Solution:- 


// Recursion / LinkedList Problem

// Easy

// T.C = o(n)
// S.C = o(n)
/**
 Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/
public class MergeTwoSortedLists 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) 
        {
            if (list1.val > list2.val) 
            {
                cur.next = list2;
                list2 = list2.next;
            } 
            else 
            {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;          
    }
}
/**
T.C = o(m+n)
S.C = o(1)

 class Solution 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
  ListNode ansNode = new ListNode(0);
        ListNode current = ansNode;
        
        while (l1 != null && l2 != null) 
        {
            if (l1.val <= l2.val) 
            {
                current.next = l1;
                l1 = l1.next;
            } else 
             {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        // Append remaining nodes
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        
        return ansNode.next;
    }
}            
 */