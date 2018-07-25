package _2ReturnKthToLast;

import common.ListFunctions;
import common.ListNode;

public class KthToLast{
	
	
	public static ListNode KthLast(ListNode n, int k) 
	{
		
		int size = ListFunctions.calculateSize(n);
		if(k==0 || k > size) {
			return null;
		}
		
		for(int i = 0 ; i < size - k ; i++) {
			n = n.next;
		}
		
		return n;
	}

	
}