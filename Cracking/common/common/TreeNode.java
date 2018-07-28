package common;

//binary tree (only left and right child)

public class TreeNode{
		public TreeNode left = null;
		public TreeNode right = null;
	//	public TreeNode parent = null;
		public int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
		
		public void addLeft(int data) {
			TreeNode leftChild = new TreeNode(data);
			this.left = leftChild;
			
		}
		
		public void addRight(int data) {
			TreeNode rightChild = new TreeNode(data);
			this.right = rightChild;
		}
		
		
	
	
}