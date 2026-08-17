class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        if(head == null)
        {
            return null;
        }
        ListNode preNode = null;
        ListNode currNode = head;

        while(currNode != null)
        {
            ListNode next = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = next;
        }
        return preNode;
    }
}