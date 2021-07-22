package learn.com;

public class MyLinkedList {
	
	Node head;
	//this inner class made static so that main() method can easily access this class
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public void show() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.head = new Node(12);
		Node second =  new Node(13);
		Node third =  new Node(14);
		
		ll.head.next = second;
		second.next = third;
		
		ll.show();
	}
}
