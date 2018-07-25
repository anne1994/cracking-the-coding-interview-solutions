package common;


/*implement a single linked list */

public class ListNode{

		public ListNode next =  null;
		public int data;
		
		//constructor
		
		public ListNode(int d)
		{
		data = d;
		}
	

/*get input array and store it in a linkedlist  constructor */

		public ListNode(int[] array)
		{
		data = array[0];
		//ListNode head = new ListNode(data);
		ListNode current = this; 
		for(int i = 1; i < array.length; i++) 
		{
			current.next = new ListNode(array[i]);
			current = current.next;
		}
		
		}
		
	
//append to tail of the linkedlist
		public void appendToTail(int d) {
			ListNode n = this;
			while(n.next!=null)
			{
				n = n.next;
			}
			ListNode end = new ListNode(d);
			n.next = end;
		}
		
		
//if node is to be inserted at end
		public void appendToTail(ListNode node) {
			ListNode n = this;
			
			while(n.next!=null) {
				n=n.next;
			}
			n.next = node;
		}




}