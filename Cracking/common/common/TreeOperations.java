package common;
 

public class TreeOperations{
	//createTree
	
//	*          	5
//	 *        /   \
//	 *       0    -3
//	 *      /     / \
//	 *     4     7   6

	public static TreeNode createTree() {
		TreeNode root = new TreeNode(5);
		root.addLeft(0);
		root.addRight(-3);
		root.left.addLeft(4);
		root.right.addRight(6);
		root.right.addLeft(7);
		
		
		return root;
	}
	//createBST
	
	//print preorder
	public static void preOrder(TreeNode root) {
		if(root!=null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	//print inorder
	public static void inOrder(TreeNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	//print postorder
	public static void postOrder(TreeNode root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
			
		}
	}
	
}