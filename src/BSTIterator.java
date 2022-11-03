//Assignment 4 - Question 5 Iterate through Binary Search Tree

import java.util.ArrayList;

public class BSTIterator {
	ArrayList<Integer> traverseList;
	int ind = 0;
	public BSTIterator(TreeNode root) {
		traverseList = new ArrayList<>();
		inorder(root);
	}
	
	public int next() {
		return traverseList.get(ind++);
	}
	
	public boolean hasNext() {
		return ind < traverseList.size();
	}
	
	// Populating array with the nodes of the tree
	private void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			traverseList.add(root.val);
			inorder(root.right);
		}
	}
}

