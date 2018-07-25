package _2GroupAnagrams;

import java.util.Arrays;

class Tester { 
	

	public static void main(String[] args) {
	
		//String[] arrayA = {"code" , "ocde" , "cod", " od" , "mom", "ecdo"};
		String[] arrayB= {"dad"," call", "llac", "lazy", "add","ouch","lacl", "dda"};
	
		test(arrayB);
			}	
	
	private static void test(String[] b) {
		//System.out.println("original array a " + Arrays.toString(a));
		//groupAnagrams.sort(a);	
	//	System.out.println(Arrays.toString(a));
		System.out.println("original array b " +Arrays.toString( b));
		groupAnagrams.sort(b);
		System.out.println(Arrays.toString(b));
		
		
	}
}