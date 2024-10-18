// Leetcode:- https://leetcode.com/problems/merge-two-sorted-lists/description/
// Leet Code Question no. 21
// Merge Two Sorted Lists Problem DSA
// Solution:- 

// Recursion / LinkedList Problem
// Easy

/**
T.C = o(m+n)
S.C = o(1)
*/

/**
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
*/

/**
Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/
public class MergeTwoSortedLists 
{
    public static void main(String[] args) 
    {
        // Creating two sorted lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merging the two lists
        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        ListNode mergedList = merger.mergeTwoLists(list1, list2);

        // Printing the merged list
        System.out.print("Merged List: ");
        while (mergedList != null) 
        {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

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
            } else 
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

class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


/**
 
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

*/