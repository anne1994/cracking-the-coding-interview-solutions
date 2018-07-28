package _3ListOfDepths; 

import java.util.ArrayList;
import java.util.LinkedList;

import common.TreeNode;


public class ListDepths{
	
	private static void createLevelLinkedList(TreeNode root, 
			ArrayList<LinkedList<TreeNode>> lists, int level) {
		
		if(root == null) return;
		
		LinkedList<TreeNode> levelList = null;
		if(lists.size() == level) {
			levelList = new LinkedList<TreeNode>();
			lists.add(levelList);
		}
		else {
			levelList = lists.get(level);
		}
		
		levelList.add(new TreeNode(root.data));
		
		//recurse
		
		createLevelLinkedList(root.left,lists,level+1);
		createLevelLinkedList(root.right, lists, level+1);
		
 	}
	
	
	
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root, lists, 0); //start with level 0
		return lists;
	}
	
}

