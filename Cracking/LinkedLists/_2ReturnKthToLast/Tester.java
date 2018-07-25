package _2ReturnKthToLast;


import common.ListNode;

public class Tester{ 
	
	public static void main(String[] args) {
		//give inputs
		test(new ListNode(new int[]{9,8,7,6}), 5);
		test(new ListNode(new int[]{5,7,7,3,7,6,7,5}), 3);
		
	}
	
	private static void test(ListNode head, int k) {
		
		ListNode m = (KthToLast.KthLast(head, k));
		if(m!=null)
			System.out.println(m.data);
		else
			System.out.println("outside range");
		
	}
}
	