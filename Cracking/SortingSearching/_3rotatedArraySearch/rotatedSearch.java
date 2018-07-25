package _3rotatedArraySearch;



public class rotatedSearch{
	
		public static int search(int a[], int left, int right, int x) 
		{
		int mid = (left+right)/2;
		
		if(x == a[mid]) {
			//System.out.println("a[mid]" + a[mid]);
			return mid;
		}
		if(right < left) {
			return -1;
		}
		
		if(a[left] < a[mid]) //left is ordered
		{
			if(x >= a[left] && x <a[mid]) 
			{
				return search(a, left,  mid-1,  x); //search left
			}
			else {
				return search( a,  mid+1,right,  x); //search right
			}
		}
		else if(a[mid] < a[left]) //right is ordered
		{
			if(x > a[mid] && x <= a[right]) {
				return search(a,  mid+1, right, x); //search right
			}
			else {
				return search(a,  left, mid-1, x); //search left
			}
		}
		else if(a[mid] == a[left]) 
		{
			if(a[mid] != a[right]) // if right is diff search it first
			{
				return search(a,mid+1, right, x);
			}
			else // search both halves
			{
				int result =  search(a,left, mid-1, x); //search left
				if(result == -1) {
					return search(a,mid+1,right,x);
				}
				else {
					return result;
				}
			}
		}

	
	return -1;
	
}
}