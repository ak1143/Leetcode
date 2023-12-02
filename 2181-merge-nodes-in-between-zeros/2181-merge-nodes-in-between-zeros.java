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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ListNode next=head.next;
        
        while(next!=null){
            int sum=0;
            while(next.val!=0){
                sum+=next.val;
                next=next.next;
            }
            ListNode newNode =new ListNode(sum);
            curr.next=newNode;
            curr=curr.next;
            
            next=next.next;
        }return head.next;
    }
}