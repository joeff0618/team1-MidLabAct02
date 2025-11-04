package solutions.linked_list;

import solutions.Solution;

/**
 * The {@code AddTwoNumbers} class adds two numbers represented by linked lists.
 * <p>
 * Link: <a href="https://leetcode.com/problems/add-two-numbers/description">
 * https://leetcode.com/problems/add-two-numbers/description</a>
 */

public class AddTwoNumbers implements Solution {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1, h2 = l2;
        ListNode result = new ListNode(), rh = result;

        int carry = 0;

        while (h1 != null || h2 != null) {
            int temp = 0;

            if (h1 != null) {
                temp += h1.val;
                h1 = h1.next;
            }

            if (h2 != null) {
                temp += h2.val;
                h2 = h2.next;
            }

            if (carry > 0) {
                temp += carry;
                carry = 0;
            }

            if ((temp / 10) >= 1.0) {
                carry = (int) (temp / 10);
                temp %= 10;
            }

            rh.val = temp;
            if (h1 != null || h2 != null) {
                rh.next = new ListNode();
                rh = rh.next;
            }
        }

        if (carry > 0) {
            rh.next = new ListNode(carry);
        }

        return result;
    }


    @Override
    public void run() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Sum: ");
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
        System.out.println();
    }
}
