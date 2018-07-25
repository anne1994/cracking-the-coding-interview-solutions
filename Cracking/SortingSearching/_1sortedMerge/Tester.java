//pass array a , b  and their lengths

package _1sortedMerge;

import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		System.out.println("*** 10.1: Sorted Merge");
		test(new int[]{3, 6, 8, 9, 0, 0, 0, 0}, new int[]{1, 2, 4, 7}, 4, 4);
	}
	
	
	public static void test(int[] a, int[] b, int lastA, int lastB) {
		
		System.out.println("Original arrays: " + Arrays.toString(a) + " " + Arrays.toString(b));
		sortedMerge.merge(a,b,lastA,lastB);
		System.out.println("merged"  + Arrays.toString(a));
		
	}
}