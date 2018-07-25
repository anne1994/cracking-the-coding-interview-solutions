package _1removeDups;


import common.ListFunctions;
import common.ListNode;


public class Tester{ 
	
	public static void main(String[] args) {
		//give inputs
		test(new ListNode(new int[]{9,9,9,9}));
		test(new ListNode(new int[]{5,7,7,3,7,6,7,5}));
		
	}
	
	private static void test(ListNode head) {
		//ListFunctions.printList(head);
		removeDups.deleteDups(head);
		ListFunctions.printList(head);
		System.out.println();
		
	}
}
	
	

