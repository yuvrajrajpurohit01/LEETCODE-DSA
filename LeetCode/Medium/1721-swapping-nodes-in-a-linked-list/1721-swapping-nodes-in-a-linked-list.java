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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null){
            a.add(temp.val);
            temp=temp.next;
        }
        int first = a.get(k - 1);
        int second = a.get(a.size() - k);

        a.set(k - 1, second);
        a.set(a.size() - k, first);
        temp = head;
        for(int i = 0 ; i<a.size() ; i++){
            temp.val = a.get(i);
            temp = temp.next;
        }
        return head;
    }
}