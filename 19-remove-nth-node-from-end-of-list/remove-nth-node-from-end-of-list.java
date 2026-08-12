
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         int cn=0;
         ListNode temp= head;
         
         while(temp!=null){
            cn++;
            temp=temp.next;
         }
         
if(cn==n)return head.next;
         temp=head;
          for (int i = 0; i < cn - n-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
   


        return head;
    }
}