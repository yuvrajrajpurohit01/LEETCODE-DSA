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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        int ls = 0;
        while(temp!= null){
            ls++;
            temp = temp.next;
        }
        if(n == ls){
            return head.next;
        }
        temp = dummy;
        int no = ls-n;
        while(no>0){
            temp = temp.next;
            no--;
        }
        temp.next = temp.next.next;
        return head;
    }
}