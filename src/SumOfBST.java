//Assignment 4 - Question 8 ; Sum of BST

public class SumOfBST {
	int result = 0;
	boolean isInorder = false;
	public int rangeSumBST(TreeNode root, int low, int high) {
		inorder(root,low,high);
		return result;
	}
	public void inorder(TreeNode root, int low, int high){
		if(root == null){
			return ;
		}
		inorder(root.left,low,high);
		if(root.val == low){
			isInorder = true;
		}
		if(isInorder == true){
			result += root.val;
		}
		if(root.val == high){
			isInorder = false;
		}
		inorder(root.right,low,high);
	}
}
