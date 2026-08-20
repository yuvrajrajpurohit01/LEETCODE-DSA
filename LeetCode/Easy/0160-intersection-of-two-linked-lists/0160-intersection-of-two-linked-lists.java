/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode temp = headB;

        ArrayList<ListNode> a1 = new ArrayList<>();
        ArrayList<ListNode> a2 = new ArrayList<>();

        while(temp1 != null){
            a1.add(temp1);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            a2.add(temp2);
            temp2 = temp2.next;
        }

        int cnt = 0;
        boolean found = false;

        for (int i = 0; i < a1.size() && !found; i++) {
            for (int j = 0; j < a2.size(); j++) {

                if (a1.get(i) == a2.get(j)) {
                    cnt = j;
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            return null;
        }

        while (cnt > 0) {
            temp = temp.next;
            cnt--;
        }

        return temp;
    }
}