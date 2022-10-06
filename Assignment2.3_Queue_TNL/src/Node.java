/**
 * @author Truong Le
 *
 */
class Node<T> {
	
	T data;
	Node<T> nextNode;
	
	/**
	 * Create Null Node
	 */
	public Node() {
		nextNode = null;
		data = null;
	}
	
	/**
	 * Set value for data
	 * @param data new data value
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * Return current Node
	 * @return current Node
	 */
	public Node<T> getNode() {
		return this;
	}
	
	/**
	 * Set the next Node after current Node
	 * @param nextNode next Node after current Node
	 */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
}
