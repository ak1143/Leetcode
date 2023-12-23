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
    
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both slow and fast until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the N-th node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return the modified head
    }
}
