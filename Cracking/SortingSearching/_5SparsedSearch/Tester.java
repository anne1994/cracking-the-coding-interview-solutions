package _5SparsedSearch;

import java.util.Arrays;

public class Tester{
	
	public static void main(String[] args) {
		
		
		String[] words = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		System.out.println("Array: " + Arrays.toString(words));
		test(words, "at");
		test(words, "ball");
		test(words, "car");
		test(words, "dad");
		test(words, "food");
	}
	
	private static void test(String[] words, String str) {
		System.out.format("\n%4s is at index: %d", str, SparsedSearch.search(words, str));
	}
	
}