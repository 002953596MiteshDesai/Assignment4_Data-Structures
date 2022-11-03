public class ListNode {
	int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	public int length(ListNode head) {
		if (head == null) {
			return 0;
		}
		//traverse lis
		ListNode temp = head;
		int i =0;
		while (temp != null) {
			i++;
			//need the following line to avoid infinite loop
			temp = temp.next;
		}
		return i;
	}
}
