public class LinkedList<T> { //T used to label an object as generic
	private Node head;
	private int count;
	
	public LinkedList() {
		this.head = new Node(null);
		this.count = 0;
	}
	
	public void add(T data) {
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		current.setNext(temp);
		count++;
	}
	
	public int size() {
		return this.count;
	}
	
	public boolean remove(int index) {
		if(index < 1 || index > this.size()) {
			return false;
		}
		Node current = head;
		for(int i = 1; i < index; i++) {
			if(current.getNext() == null) {
				return false;
			}
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		count--;
		return true;
	}
	
					private class Node<T> { //private inner class
						private T data;
						private Node nextNode;
						
						public Node(T data) {
							this.data = data;
							this.nextNode = null;
						}

						public void setNext(Node<T> node) {
							this.nextNode = node;
						}
						
						public void setData(T data) {
							this.data = data;
						}
						
						public T getData() {
							return this.data;
						}
						
						public Node getNext() {
							return this.nextNode;
						}
					} //end class Node
	
} //end class LinkedList
