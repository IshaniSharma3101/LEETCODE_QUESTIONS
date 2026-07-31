import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //size of 1
      int size1=0;
      ListNode temp1 =headA;
      while(temp1!=null){
        size1++;
        temp1= temp1.next;
      }
        //size of 2
       int size2=0;
       ListNode temp2 = headB;
       while(temp2!=null){
        size2++;
        temp2=temp2.next;
       }
        // shift temp of longer node to equalize length then saath mcompare loop chalega 
        //if 1 is longer 
        temp1 = headA;
        temp2 = headB;

        if(size1>size2){
            int diff = size1-size2;
           
           while(diff > 0){
              temp1 = temp1.next;
               diff--;
                 }
        }

        // if 2 is longer 
         if(size2>size1){
            int diff = size2-size1;
            // int i =1;
           while(diff > 0){
    temp2 = temp2.next;
    diff--;
}
        }
        //now rule which will execute for all which is compare wala step 
    
        while(temp1!=null && temp2!=null){
            if(temp1==temp2) return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}