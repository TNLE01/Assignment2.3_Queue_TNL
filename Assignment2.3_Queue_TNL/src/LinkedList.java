/**
 * @author Truong Le
 *
 */
public class LinkedList<T> {
	
	Node<T> head, tail;
	int length;
	
	/**
	 * Create Empty LinkedList
	 */
	public LinkedList() {
		head = tail = null;
		length = 0;
	}
	
	/**
	 * Return true or false based on if the LinkedList is Empty or not
	 * @return true if LinkedList is Empty and false if otherwise
	 */
	public boolean isEmpty() {
		if (head == null) { return true;}
		else return false;
	}
	
	/**
	 * Return the head of the LinkedList
	 * @return the head of the LinkedList
	 */
	public Node<T> getList() {
		return head;
	}
	
	/**
	 * Add a new Node to the end and return void
	 * @param aNode next Node to be added
	 * @return void
	 */
	public void addNode(Node<T> aNode) {
		if (isEmpty()) {
			head = tail = aNode;
			return;
		}
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;
		
	}
	
	/**
	 * Remove the head of the Linkedlist
	 * @return data of head that was removed
	 */
	public T removeFirst() {
		if (isEmpty())
			return null;
		Node<T> first = head;
		head = head.nextNode;
		length--;
		return first.data;
	}
	
}
