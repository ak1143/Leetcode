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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode n1=head;
        ListNode n2=head;
        
        while(n2.next!=null){        
            if(n2.val>n2.next.val){
                n2=n2.next;
            }else if(n1.val<n2.next.val){
                n1=n2.next;
                n2=n2.next;
            }
            else{
                ListNode tmp=n1;
                n2=n2.next;
                while(tmp.next!=n2){
                    if(tmp.next.val<n2.val){
                        break;
                    }
                    tmp=tmp.next;
                }
                tmp.next=n2;
            }
        }
        return n1;
    }
}