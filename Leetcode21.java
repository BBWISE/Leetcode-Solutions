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
    ALGORITHIM
    1.  Create a storage place (Stack/LinkedList) = Stack      ======== DONE
    2.  Iterate the two list and store the present minimum value into it ======== DONE
    3.  Pop the values from the storage place and convert them to ListNode  ======= DONE
    4.  Return the head of the new ListNode ========== DONE
*/
class Solution {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode output = null;
        if(list1==null && list2==null) return output;
        Stack <Integer> storage = new Stack<Integer>();
        while(list1!=null || list2!=null){
           
            if(list1==null) {
                storage.push(list2.val);
                list2 = list2.next;
            }
            else if(list2==null) {
                storage.push(list1.val);
                list1=list1.next;
            }
            
            else{
                int a=list1.val,b=list2.val;
                if(a<=b){
                    storage.push(a);
                    list1=list1.next;
                }
                else{
                    storage.push(b);
                    list2=list2.next;
                }
                
            }
            
        }
        ListNode former = null;
        while(!(storage.empty())){
            ListNode present  = new ListNode(storage.pop(),former);
            output = present;
            former = present;
        }
        return output;
    }
}