package dataStructure.doubly_linked_list;

public class DoublyLinkedList {
	private Node header;
	private Node lastNode;
	private int size;

	DoublyLinkedList() {
		header = new Node(null);
		lastNode = header;
	}

	public void prepend(Integer data) {
		Node n = new Node(data);
		if (size == 0) {
			header.next = n;
			lastNode = n;
			n.prev = header;
			size++;
		} else {
			n.next = header.next;
			n.prev = header;
			header.next = n;
			n.next.prev = n;
			size++;
		}
	}

	public void append(Integer data) {
		Node n = new Node(data);
		if (size == 0) {
			header.next = n;
			lastNode = n;
			n.prev = header;
			size++;
		} else {
			lastNode.next = n;
			n.prev = lastNode;
			lastNode = n;
			size++;
		}
	}

	public void removeFirst() {
		if (size != 0) {
			header.next = header.next.next;
			header.next.next.prev = header;
			size--;
		}
	}

	public void removeLast() {
		if (size == 1) {
			header.next = null;
			lastNode = header;
			size--;
		}
		if (size != 0) {
			lastNode.prev = lastNode;
			lastNode.next = null;
			size--;
		}
	}

	public void insertAt(int index, Integer data) {
		if (index <= 0 || index > size) {
			return;
		} else if (index == 1) {
			prepend(data);
		} else if (index == size) {
			append(size);
		} else {
			Node n = new Node(data);
			Node x = header.next;
			int count = 1;
			while (count != index) {
				x = x.next;
				count++;
			}
			n.next = x;
			n.prev = x.prev;
			x.prev.next = n;
			x.prev = n;
			size++;
		}
	}

	public void removeAt(int index) {
		if (index <= 0 || index > size) {
			return;
		} else if (index == 1) {
			removeFirst();
		} else if (index == size) {
			removeLast();
		} else {
			Node n = header.next;
			int count = 1;
			while (count != index) {
				n = n.next;
				count++;
			}
			n.prev.next = n.next;
			n.next.prev = n.prev;
			size--;
		}
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		Node n = header.next;
		String temp = "";
		while (n != null) {
			temp = temp + n.data + " ";
			n = n.next;
		}
		return temp;
	}

	public String printReverse() {
		Node n = lastNode;
		String temp = "";
		int x = size;
		while (x > 0) {
			temp = temp + n.data + " ";
			n = n.prev;
			x--;
		}
		return temp;
	}
}
