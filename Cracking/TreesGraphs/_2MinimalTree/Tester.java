package _2MinimalTree;

import common.TreeNode;
import common.TreeOperations;

public class Tester {
	
	public static void main(String[] args) {
	//give input array thats all
	TreeNode n = test(new int[]{1,5,9,16,55});
	System.out.println("Thre root node is " + n.data);
	//lets also try printing the nodes inorder , will be a BST( coz sorted array input), we will add function in common.treeoperations
	//TreeOperations.inOrder(n);
	TreeOperations.preOrder(n);
	//TreeOperations.postOrder(n);
	}
	
	public static TreeNode test(int[] array) {
		
		return MinimalTree.createMinimalBST(array);
	}
}
