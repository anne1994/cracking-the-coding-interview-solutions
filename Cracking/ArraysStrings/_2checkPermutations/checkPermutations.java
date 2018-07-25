package _2checkPermutations;

public class checkPermutations { 
	
public static boolean permutations(String s, String t) {
	
	if(s.length() != t.length()) return false;
	
	int[] letters = new int[128];
	
	char[] s_array = s.toCharArray();
	
	for(char c : s_array) 
	{
		letters[c]++;
	}
	
	for(char c : t.toCharArray())
	{
		letters[c]--;
		
		if(letters[c] < 0) {
			return false;
		}
	}
 	
	
	return true;
	
}

}