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
    int size=0;
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        while(temp!= null){
            temp= temp.next;
            size++;
        }
        if(size==1){
            return null;
        }
        // temp mein vps head daalna bhulo mt 
        temp = head;
        int i =0;
        int n = size/2;
        // while cnditions dhyan se smjhna h 
        while( i<=n-2){
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}