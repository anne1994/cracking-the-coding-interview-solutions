package _3ListOfDepths;

import java.util.ArrayList;
import java.util.LinkedList;

import common.TreeNode;
import common.TreeOperations;

public class Tester{
	
	public static void main(String[] args) {
		TreeNode root = TreeOperations.createTree();
	    System.out.println("Inorder iteration of the tree");
		TreeOperations.inOrder(root);	
		
		ArrayList<LinkedList<TreeNode>> lists = ListDepths.createLevelLinkedList(root);
		System.out.println("List of Depths");
		for(int i = 0 ; i < lists.size(); i++) {
			LinkedList<TreeNode> list = lists.get(i);
			System.out.format("\nLevel %d: ", i);
			for(TreeNode node: list) {
				System.out.print(node.data + "-->");
			}
		}	
	}
}