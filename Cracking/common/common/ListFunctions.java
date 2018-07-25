package common;


public class ListFunctions{
	
	public static void printList(ListNode head) {
		if(head == null)
			return;
		
		ListNode n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
			System.out.println();
		}
	}
	
	public static int calculateSize(ListNode n) {
		int count = 0;
		while(n!=null) {
			count++;
			n = n.next;
		}
		return count;
	}
	
	
}