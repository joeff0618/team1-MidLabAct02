package solutions.linked_list;

import solutions.Solution;

/**
 * The {@code MergeTwoSortedLists} class merges two sorted linked lists into one.
 * <p>
 * Link: <a href="https://leetcode.com/problems/merge-two-sorted-lists/description">
 * https://leetcode.com/problems/merge-two-sorted-lists/description</a>
 */
public class MergeTwoSortedLists implements Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode current = result;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
            list1 = list1.next;
        }

        if(list2 != null){
            current.next = list2;
            list2 = list2.next;
        }
        return result.next;
    }

    @Override
    public void run() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
