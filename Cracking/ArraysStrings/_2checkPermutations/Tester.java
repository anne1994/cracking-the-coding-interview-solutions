package _2checkPermutations;

import _2checkPermutations.checkPermutations;

public class Tester { 
	public static void main(String[] args) {
		System.out.println("test results");
		test("hello", "ohell");
		test("daddy", "dad");
	}
	
	private static void test(String s, String t) {
		System.out.format("%s, %s: %s\n", s, t, checkPermutations.permutations(s, t));
	}
}





