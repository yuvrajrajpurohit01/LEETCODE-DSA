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
    public int pairSum(ListNode head) {
        int max = 0;
        Stack<Integer> s = new Stack<>();

        ListNode temp = head;

        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            int sum = s.pop()+temp.val;
            max = Math.max(sum,max);
            temp = temp.next;
        }
        return max;
    }
}