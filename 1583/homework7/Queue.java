/**
* This class Queue will operate like a line in a cafeteria.
* Everything added to the queue will be "added" to the back of
* the queue, and everything removed from the queue will be "removed"
* from the front of the queue.
**/
public class Queue extends AbstractCollection {
	/**
	* This is Queue's constructor method.
	**/
	public Queue() {						// super calls the superclass AbstractCollection's constructor since Queue
		super();								// also inherits the instantiated instance variables of AbstractCollection
	} // end Queue's constructor

	/**
	* This method will accept as a parameter a String value and
	* will add that value to the back of the queue.
	**/
	public void add(String back) {
		if(this.size() == this.getStringArray().length) {	// the condition for when the size of the queue
																	// is equal to the length of the queue
			this.expandArray();	// expandArray will only be executed when the queue
		}								// (the String array) is full
		
		for(int i = this.size() - 1; i != -1; i--) {						// loop for when shifting data items down
			this.getStringArray()[i+1] = this.getStringArray()[i];	// an index in the queue and to avoid an
		}																				// an ArrayOutOfBoundsException error
		this.getStringArray()[0] = back; // assigning to the queue the parameter back to the back of the queue
		super.size++; // incrementing size after every addition
	} // end method add
	
	/**
	* This method will remove and return the value of the current
	* data item in the front of the queue.
	**/
	public String remove() {
		if(this.size() == 0) {	// remove returns null if the size of the queue is empty (equal to zero)
			return null;			// to avoid an ArrayOutOfBoundsException error
		}
		String holder = this.getStringArray()[this.size()-1];	// holds the value of the data item that will be removed
		super.size--; // decrementing size after every removal
		return holder;
	} // end method remove
} // end class Queue
