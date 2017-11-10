/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        
        ListNode p=result;
        int carray=0;
        
        while(l1!=null||l2!=null){
            
            if(l1!=null){
                carray+=l1.val;   
                l1=l1.next;
            }
            if(l2!=null){
                carray+=l2.val;
                l2=l2.next;
            }
            
            p.next=new ListNode(carray%10);
            carray/=10;
            p=p.next;
        }
        
        if(carray!=0){
            
            p.next=new ListNode(carray);
        }
        
        return result.next;
    }
}
