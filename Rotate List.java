61. Rotate List

Given the head of a linked list, rotate the list to the right by k places.

 Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

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
    public static ListNode findk(ListNode head,int n){
        ListNode temp=head;
        int cnt=1;
       
        while(temp!=null){
            if(cnt==n){
                return temp;
            }
          
            temp=temp.next;
            cnt++;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(k%len==0){
            return head;
        }
        k=k%len;
        tail.next=head;
        ListNode knode=findk(head,len-k);
        
        head=knode.next;
        knode.next=null;
        return head;
   
    }
    
}