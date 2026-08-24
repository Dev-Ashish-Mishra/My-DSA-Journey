
class Solution
{
    public boolean isPalindrome(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        // find middle
        while( fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;

        //Reverse 2nd half
        while( slow != null )
        {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare first half with reversed second half.
        ListNode left = head;
        ListNode right = prev;
        while ( right != null )
        {
            if( left.val != right.val )
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}