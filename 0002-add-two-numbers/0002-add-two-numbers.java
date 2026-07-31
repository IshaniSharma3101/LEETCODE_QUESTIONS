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
//     public long func(ListNode head){
//         long num =0;
//         ListNode temp = head;
//         while(temp!=null){
//            long digit = temp.val;
//             num = num * 10 + digit;
//             temp = temp.next;
//         }
//        long rev = 0;

//         while(num > 0){
//          long dig = num % 10;
//          rev = rev * 10 + dig;
//           num = num / 10;
// }
// return rev;
//     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     long num1 = func(l1);
//     long num2 = func(l2);
//     long sum = num1 + num2;

//      long sumrev = 0;

//         while(sum > 0){
//          long digits = sum % 10;
//          sumrev = sumrev * 10 + digits;
//          sum  = sum / 10;
// }
// //       ListNode ans = new ListNode(-1);
// //       ListNode temp3 = ans;
     

// String s = String.valueOf(sumrev);

// // for(int i = 0; i < s.length(); i++){
// //     temp3.val = (int)(s.charAt(i));
// //     temp3 = temp3.next;
// // }
// //        return ans;  
// //     }
// // }

// ListNode ans = new ListNode(-1);
// ListNode temp3 = ans;

// for (int i = 0; i < s.length(); i++) {
//     temp3.next = new ListNode(s.charAt(i) - '0');
//     temp3 = temp3.next;
// }

// return ans.next;
ListNode ans = new ListNode(0);
ListNode temp = ans;
int i = 0;
int carry = 0;
ListNode temp1 = l1;
ListNode temp2 = l2;
while(temp1!=null && temp2!=null){
  temp.next = new ListNode((temp1.val + temp2.val+carry)%10);
  carry = (temp1.val +temp2.val +carry )/10;
  temp1 = temp1.next;
  temp2 = temp2.next;
  temp = temp.next;
}
while(temp1!=null){
  temp.next = new ListNode((temp1.val +carry)%10);
  carry = (temp1.val +carry )/10;
  temp1 = temp1.next;
//   temp2 = temp2.next;
  temp = temp.next;
}
while(temp2!=null){
  temp.next = new ListNode(( temp2.val+carry)%10);
  carry = (temp2.val +carry )/10;
//   temp1 = temp1.next;
  temp2 = temp2.next;
  temp = temp.next;
}
if(carry>0){
     temp.next = new ListNode(carry%10);
     carry = carry/10;
     temp = temp.next;
}
return ans.next;
    }
}