package _2MinimalTree;

import common.TreeNode;

public class MinimalTree{
	
	public static TreeNode createMinimalBST(int[] array) {
		return createMinimalBST(array,0,array.length-1);
	}
	
	private static TreeNode createMinimalBST(int[] array, int start, int end) {
		
		if(end < start) {
			return null;
		}
		
		int middle = (start+end)/2;
		TreeNode middleNode = new TreeNode(array[middle]);
		middleNode.left = createMinimalBST(array,start,middle-1);
		middleNode.right = createMinimalBST(array, middle+1, end);
		
		return middleNode;
	}
	
	
	
}



