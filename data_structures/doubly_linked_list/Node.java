package dataStructure.doubly_linked_list;

public class Node {
	public Integer data;
	public Node next;
	public Node prev;

	Node(Integer data) {
		this.data = data;
		next = null;
		prev = null;
	}

}
