// Given head which is a reference node to a singly-linked list.
// The value of each node in the linked list is either 0 or 1.
// The linked list holds the binary representation of a number.
// Return the decimal value of the number in the linked list.

class Solution {
    public int getDecimalValue(ListNode head) {
        
        int result = 0;
        int index = 0;
        ListNode temp = head;
        
        if(head.next == null){
            return head.val;
        }
        
        while(temp.next != null){
            index++;
            temp = temp.next;
        }
        
        do{
            if(head.val == 1){
                result += Math.pow(2, index);
            }
            index--;
            head = head.next;
        }while(head != null);
        
        return result;
    }
}
