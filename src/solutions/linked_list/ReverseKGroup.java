package solutions.linked_list;

import solutions.Solution;

/**
 * The {@code ReverseKGroup} class reverses nodes in a linked list in groups of size k.
 * <p>
 * Link: <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/description">
 * https://leetcode.com/problems/reverse-nodes-in-k-group/description</a>
 */
public class ReverseKGroup implements Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy, prev = dummy, next = dummy;
        int count = 0;

        // Count the total number of nodes
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Reverse nodes in groups of k
        while (count >= k) {
            curr = prev.next;  // first node of the group
            next = curr.next;  // node after current

            // Reverse the k-group
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            // Move prev pointer to the end of the reversed group
            prev = curr;
            count -= k;
        }

        return dummy.next;
    }


    @Override
    public void run() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        int k = 2;
        ListNode result = reverseKGroup(head, k);

        System.out.print("Reversed in groups of " + k + ": ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
