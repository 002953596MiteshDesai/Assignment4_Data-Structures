//Assignment 4 - Question 2 Convert  BST to Doubly Linked List

public class ConvertBSTtoDoubleLinkedList {
	Node head;
	Node tail;
	
	public Node treeToDoublyList(Node root) {
		if (root == null)
			return null;
		inorder(root);
		tail.right = head;
		head.left = tail;
		return head;
	}
	// Using inorder to traverse through the Tree
	private void inorder(Node node) {
		if (node == null)
			return;
		
		inorder(node.left);
		
		if (head == null)
			head = node;
		
		if (tail != null) {
			tail.right = node;
			node.left = tail;
		}
		tail = node;
		
		inorder(node.right);
	}
}
