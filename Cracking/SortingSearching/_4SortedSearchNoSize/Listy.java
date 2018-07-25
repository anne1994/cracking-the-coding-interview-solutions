package _4SortedSearchNoSize;

public class Listy{
	
	int[] array;
	
	public Listy(int[] arr) {
		this.array = arr;
	}
	
	public int elementAt(int position) {
		
		if(position >= array.length){
		return -1;
		}
		return  array[position];
		}
		
	}
	
