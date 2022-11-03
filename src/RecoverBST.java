//Assignment 4 - Question 4 Recover Binary Search Tree

public class RecoverBST {
	
	TreeNode prev = null ;
	TreeNode first = null ;
	TreeNode second = null;
	
	
	public void recoverTree(TreeNode root) {
		checkSwappedNodes(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}
	
	private void checkSwappedNodes(TreeNode temp) {
		if (temp == null)
			return;
		checkSwappedNodes(temp.left);
		if (prev != null && prev.val > temp.val) {
			if (first == null)
				first = prev;
			second = temp;
		}
		prev = temp;
		checkSwappedNodes(temp.right);
	}
	
}
