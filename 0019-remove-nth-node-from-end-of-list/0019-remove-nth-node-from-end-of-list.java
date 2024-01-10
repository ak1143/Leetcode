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
    public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode curr=head;
//         int count=1;
    
//         while(curr!=null){
//             curr=curr.next;
//             count++;
//         }
        
//         curr=head;
//         int target=count-n;
//         count=1;
        
//         while(curr!=null){
        
//             if(count==target){
//                 curr.next=curr.next.next;
//             }count++;
//             curr=curr.next;
//         }
//         return head;
    

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

      
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

      
        slow.next = slow.next.next;

        return dummy.next;
    }
}
