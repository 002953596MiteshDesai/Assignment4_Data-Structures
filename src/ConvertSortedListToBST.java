//Assignment 4 - Question 1 Convert Sorted List to BST

public class ConvertSortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		
			int length = length(head);
			int[] arr = copy_list(head);
			if(head == null || length == 0){
				return null;
			}
			if(length == 1){
				return new TreeNode(head.val);
			}
			
			return createBSTFromSortedArray(0, length -1, arr);
		}
		
		
		private TreeNode createBSTFromSortedArray(int start, int end, int[] arr)    {
			if(start > end){
				return null;
			}
			
			int mid = (start + end)/2;
			TreeNode node = new TreeNode(arr[mid]);
			node.left = createBSTFromSortedArray(start, mid -1, arr);
			node.right = createBSTFromSortedArray(mid +1, end, arr);
			return node;
			
		}
		
		public int length(ListNode head) {
			if (head == null) {
				return 0;
			}
			//traverse list
			ListNode temp = head;
			int i =0;
			while (temp != null) {
				i++;
				//need the following line to avoid infinite loop
				temp = temp.next;
			}
			return i;
		}
		
		public int[] copy_list(ListNode head) {
			int length = length(head);
			int[] arr_copy = new int[length];
			
			//traverse list
			ListNode temp = head;
			int i = 0;
			while (temp != null) {
				arr_copy[i] = temp.val;
				i ++;
				//need the following line to avoid infinite loop
				temp = temp.next;
			}
			return arr_copy;
		}
	}

