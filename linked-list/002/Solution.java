/**
 * 删除链表的倒数第N个节点
 *
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode() {
 *     }
 *
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copyHead = head;
        int len = 0;
        while (copyHead != null) {
            len++;
            copyHead = copyHead.next;
        }
        int removeIndex = len - n;
        if (removeIndex == 0) {
            return head.next;
        }
        ListNode removeHead = head;
        for (int i = 0; i < removeIndex - 1; i++) {
            removeHead = removeHead.next;
        }
        removeHead.next = removeHead.next.next;
        return head;
    }

}

