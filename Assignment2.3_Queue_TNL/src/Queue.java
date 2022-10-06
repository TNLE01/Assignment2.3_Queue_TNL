/**
 * @author Truong Le
 *
 */
public class Queue<T> implements QueueInterface<T> {
	
	LinkedList<Node> queue = new LinkedList<Node>();
	
	/**
	 * Adds a new entry to the back of this queue.
	 * @param newEntry  An object to be added.
	 */
	public void enqueue(T newEntry) {
		Node aNode = new Node<>();
		aNode.setData(newEntry);
		queue.addNode(aNode);
	}
	
	/**
	 * Removes and returns the entry at the front of this queue.
	 * @return  The object at the front of the queue. 
	 * @throws  EmptyQueueException if the queue is empty before the operation.
	 */
	public T dequeue() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("queue");
		return (T) queue.removeFirst();
	}
	
	/**
	 * Retrieves the entry at the front of this queue.
	 * @return  The object at the front of the queue.
	 * @throws  EmptyQueueException if the queue is empty.
	 */
	public T getFront() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("queue");
		return (T) queue.head.data;
	}
	
	/**
	 * Detects whether this queue is empty.
	 * @return  True if the queue is empty, or false otherwise.
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	/**
	 * Removes all entries from this queue. 
	 */
	public void clear() {
		while (queue.isEmpty() != true)
			dequeue();
	}
	
	/**
	 * Return the Queue
	 * @return the Queue
	 * @throws  EmptyQueueException if the queue is empty. 
	 */
	public String toString() throws EmptyCollectionException {
		String str = "";
		if (isEmpty())
			throw new EmptyCollectionException("queue");
		Node tempNode = queue.getList();
		do 
		{
			str += tempNode.data;
			tempNode = tempNode.nextNode;
			if (tempNode != null)
				str += ", ";
		} while (tempNode != null);
		return str;
	}

}
