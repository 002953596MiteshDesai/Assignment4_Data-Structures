//Assignment 4 - Question 6 Serialize and deserialize Binary Search Tree

import java.util.LinkedList;
import java.util.Queue;

public class Codec {
	
	
	// Encodes a tree to a single string.
	public String serialize (TreeNode root) {
		if (root == null)
			return "";
		return String.valueOf (root.val) + "," + serialize (root.left) + "," + serialize (root.right);
		
	}
	
	// Decodes your encoded data to tree.
	public TreeNode deserialize (String data) {
		String Dstring [] = data.split (",");
		Queue <String> queue = new LinkedList();
		for (String s: Dstring)
			queue.add (s);
		return deserializeFunction (queue);
	}
	
	public TreeNode deserializeFunction (Queue<String> queue) {
		while (!queue.isEmpty ()) {
			String s = queue.poll ();
			if (s.equals (""))
				return null;
			TreeNode node = new TreeNode (Integer.valueOf (s));
			node.left = deserializeFunction (queue);
			node.right = deserializeFunction (queue);
			return node;
		}
		return null;
	}
}
