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
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null){
            arr.add(temp.val);
            temp = temp.next; 
        }
        int n = arr.size();
        for(int i = 0 ; i<arr.size()/2 ; i++){
            int tws = arr.get(i)+arr.get(n-1-i);
            sum = Math.max(tws,sum);
        }
        return sum;
    }
}