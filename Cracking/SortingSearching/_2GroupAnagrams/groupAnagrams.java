package _2GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class groupAnagrams{ 
	
	
	public static String sortChars(String s) {
	
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
		
	}
	
	
public static void sort(String[] arr) {
		
		
		HashMap<String, ArrayList<String>> m = new HashMap<>();
		
		for(String s: arr) {
			
			String key = sortChars(s);
			System.out.println(key);
			if(!m.containsKey(key)) {
				m.put(key, new ArrayList<String>());	
			}		
			m.get(key).add(s);			
		}
		
		//copy hashmap to array
		int index = 0;
		for(String key: m.keySet()) 
		{
				ArrayList<String> list = m.get(key);
				for(String t : list) {
					System.out.println("t " + t);
					arr[index++] = t;
				
				}
				
		}
		
		
	}
	
	
	
}