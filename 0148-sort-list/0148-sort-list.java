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
    public ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next ;
        while(fast !=null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;
        while(head1 !=null && head2!= null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1= head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while(head1!=null){
            temp.next = head1;
            head1= head1.next;
            temp= temp.next;

        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;

    }
   
       


    
    public ListNode sortList(ListNode head) {
        // get mid (isme phle wala mid chaiye hoga)
        // merge sort kro dono halfs prr jaake mid nikalke nikalke merge sort kro mtlb tod do sbko
        // ab merge krte jayege merge apply krege 
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getmid(head);
        ListNode righthead = mid.next;
        ListNode lefthead = head;
        mid.next = null;
        ListNode newleft = sortList(lefthead);
        ListNode newright = sortList(righthead);
        return merge(newleft, newright);
        
    }
}