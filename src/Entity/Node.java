package Entity;

public class Node<E> implements Comparable<E> {
	private E info;
	private Node<E> next;

	public Node() {
	}

	public Node(E info, Node<E> next) {
		this.info = info;
		this.next = next;
	}

	public Node(E info) {
		this.info = info;
		this.next = null;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return 0;
	}
}