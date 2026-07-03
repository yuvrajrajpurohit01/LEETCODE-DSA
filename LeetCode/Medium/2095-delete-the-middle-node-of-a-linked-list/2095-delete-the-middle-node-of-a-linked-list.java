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
    public ListNode deleteMiddle(ListNode head) {
        int cnt = 0 ;
        ListNode temp = head;

        while(temp!= null){
            cnt++;
            temp = temp.next;
        }
        if(cnt ==0 || cnt == 1){
            return null;
        }
        temp = head;

        int mid = cnt/2;
        int c = 0;

        while(c<mid-1){
            temp = temp.next;
            c++;
        }
        temp.next = temp.next.next;
        return head;
    }
}