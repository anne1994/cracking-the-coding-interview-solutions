package _4SortedSearchNoSize;

//import _4SortedSearchNoSize.Listy;

public class Sortedsearch{
	
	
	public static int search(Listy list, int value) {
		int index = 1;
		//System.out.println("index " + index + " element " + list.elementAt(index));
		while(list.elementAt(index) != -1 && list.elementAt(index) < value) {
			index *= 2;
			System.out.println("index " + index);
		}
		
		return binarySearch(list,value,index/2, index);
	}
	
	
	public static int binarySearch(Listy list, int value, int low, int high) {
		
		int mid;
		
		while(low <= high) {
			//System.out.println("low " + low + " high " + high);
			mid = (low+high)/2;
			int middle = list.elementAt(mid);
			//System.out.println("element " + middle + "has index " + mid);
			if(middle > value || middle == -1) {
				high = mid-1;
			}else if (middle < value) {
				low = mid+1;
			}else {
				return mid;
			}
		}
		
		
		return -1;
	}
	
	
}