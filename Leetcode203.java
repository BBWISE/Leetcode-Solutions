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

/*
    ALGORITHM           
    Creat a storage variable (linkedList)  ==== DONE
    Iterate the Linked list and store all unequal values into the new storage variable  ==== DONE
    Iterate the new storage variable from right to left to store in a returnable list (ListNode)
*/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        LinkedList <Integer> storage = new LinkedList<Integer>();
        ListNode output = null;
        while(head!= null){
            if(head.val!=val){
                storage.add(head.val);
            }
            head = head.next;
        }
        
        if(storage.size()>0){
            ListNode former = null;
            for(int i=(storage.size()-1);i>=0;i--){
                ListNode present  = new ListNode(storage.get(i),former);
                output = present;
                former = present;
            }
        }
        return output;
    }      
}