package _1removeDups; 

import java.util.HashSet;
import common.ListNode;

public class removeDups 
{
	static void deleteDups(ListNode head) 
		{
	  HashSet<Integer> s = new HashSet<>();
	  ListNode previous = null;
	  while(head!=null) {
		  if(s.contains(head.data)) 
		  {
			  	previous.next = head.next;
		  
		  }
		  else 
		  {
			  s.add(head.data);
			  previous = head;
		  }
		  
		  head = head.next;

	}
		}
}
