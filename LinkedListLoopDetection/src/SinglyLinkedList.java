
public class SinglyLinkedList {
	private ListNode head;
	
	
	public class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean detectLoop() {
		ListNode fastNode = head;
		ListNode slowNode = head;
		
		
		if(fastNode!=null && fastNode.next!=null) {
			fastNode = fastNode.next.next;;
			slowNode = slowNode.next;
			
			if(fastNode == slowNode) {
				return true;
			}
		}
		
		return false;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
