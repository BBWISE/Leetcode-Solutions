/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ArrayList <ListNode> out = new ArrayList<ListNode>();
        while(head!=null){
            if(out.contains(head)) return true;
            else out.add(head);
            head = head.next;
        }
        return false;
    }
}