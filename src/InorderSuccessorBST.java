//Assignment 4 - Question 7 ; Inorder Successor for BST


public class InorderSuccessorBST {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		if (root == null) {
			return null;
		}
		
		TreeNode ans = null;
		if (root.val > p.val) {
			ans = inorderSuccessor(root.left, p);
			if (ans == null) {
				ans = root;
			}
		} else {
			ans = inorderSuccessor(root.right, p);
		}
		
		return ans;
		
	}
}

