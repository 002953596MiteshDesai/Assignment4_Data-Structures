//Assignment 4 - Question 3 Validate Binary Search Tree

public class ValidBST {
	private Integer temp;
	public boolean isValidBST(TreeNode root) {
				
				temp = null;
				return inorder(root);
			}
			
			private boolean inorder(TreeNode root) {
				if (root == null) {
					return true;
				}
				if (!inorder(root.left)) {
					return false;
				}
				if (temp != null && root.val <= temp) {
					return false;
				}
				temp = root.val;
				return inorder(root.right);
			}
		}
	



