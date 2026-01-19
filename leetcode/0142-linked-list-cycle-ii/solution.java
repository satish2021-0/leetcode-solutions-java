/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {  
        //step1:- checking cylce is exit or not. for this take 2 pointer slow, fast on head and increase slow bye 1 and fast bye 2 if fast==slow then follow step2.

        // step2:-if cycle is exit then find node that strt from the cycle and return it.. for this use 2 pointer 1 in head and 2nd pointer is on where slow== fast tha.

        // step3:- Agr list mai cycle nahi hain null return kr do

    if(head==null || head.next==null)
        return null;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                ListNode p1= slow; // also take fast kyuki fast==slow
                ListNode p2= head;
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
               return p1; // also return p2 because at this point p1=p2
            }
        }
        return null;
    }
}
