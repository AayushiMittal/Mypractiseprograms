package PractisePrograms;

//A simple Java program for traversal of a linked list
class LinkedList {
	Node head; // node as the head

	static class Node { // class node
		int data;
		Node next;

		// constructor of the class node
		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* This function prints contents of linked list starting from head */
	public void printlist()
	{
		Node n = head;
		while (n != null)
		{
			System.out.println(n.data+ " ");
			n= n.next;
		}
	}

	public static void main(String[] args)

	{
		LinkedList linkedlist = new LinkedList();

		linkedlist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		linkedlist.head.next = second;

		second.next = third;
		linkedlist.printlist();
	}
}
