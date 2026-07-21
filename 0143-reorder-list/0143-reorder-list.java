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
    public static ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        return slow; 
    }

    public void reorderList(ListNode head) {

     if(head == null || head.next == null)
    return;
        // reverse 2nd half 
        ListNode mid = getmid(head);
        ListNode curr = mid.next ;
        mid.next = null;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode righthead = prev;
        
        while(righthead != null){
            //alternate merge
           ListNode nextleft = head.next;
           head.next = righthead;
           ListNode nextright = righthead.next;
           righthead.next = nextleft;
           // update
           head = nextleft;
           righthead = nextright;
        }

    }
}