package dataStructure.doubly_linked_list;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList dl = new DoublyLinkedList();
		dl.prepend(1);
		dl.prepend(2);
		dl.prepend(3);
		dl.prepend(4);

		dl.append(2);

		dl.insertAt(1, 10);
		dl.insertAt(4, 10);

		System.out.println(dl);

		dl.removeFirst();
		dl.removeLast();
		dl.removeAt(2);

		System.out.println(dl);

		System.out.println(dl.printReverse());

	}

}
