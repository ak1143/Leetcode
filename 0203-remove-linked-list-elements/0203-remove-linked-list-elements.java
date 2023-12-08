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
    public ListNode removeElements(ListNode head, int val) {
        ListNode Dummy=new ListNode();
        ListNode prev=Dummy;
        Dummy.next=head;
        ListNode next=head;
        
        while(next!=null){
            
            if(next.val==val){
                
                prev.next=next.next;
                
            }else{
                prev=next;
            }
            next=next.next;
            
        }return Dummy.next;
    }
}