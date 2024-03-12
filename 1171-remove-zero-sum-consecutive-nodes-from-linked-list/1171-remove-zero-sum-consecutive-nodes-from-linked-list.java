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
    public ListNode removeZeroSumSublists(ListNode head) {
        
ListNode dummy = new ListNode(0);
dummy.next = head;

ListNode current = dummy;
int sum = 0;
Map<Integer, ListNode> map = new HashMap<>();

while (current != null) {
    sum += current.val;
    map.put(sum, current);
    current = current.next;
}

sum = 0;
current = dummy;

while (current != null) {
    sum += current.val;
    if (map.containsKey(sum) && map.get(sum) != current) {
        current.next = map.get(sum).next;
    }
    current = current.next;
}

return dummy.next;

    }
}