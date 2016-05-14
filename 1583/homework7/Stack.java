/**
* This class Stack will operate like a stack of dishes.
* Everything added to the stack will be "pushed" onto the top of
* the stack, and everything removed from the stack will be
* "popped" from the top of the stack.
**/
public class Stack extends AbstractCollection { // 
	/**
	* This is Stack's constructor method.
	**/
	public Stack() {					// super calls the superclass AbstractCollection's constructor since Stack
		super();							// also inherits the instantiated instance variables of AbstractCollection
	} // end Stack constructor
	
	/**
	* This method will accept as a parameter a String value and
	* will add that value to the top of the stack.
	**/
	public void push(String top) {
		if(this.size() == this.getStringArray().length) {	// the condition for when the size of the stack
																			//is equal to the length of the stack
			this.expandArray();	// expandArray will only be executed when the stack
		}								// (the String array) is full
		
		this.getStringArray()[this.size()] = top;	// assigning to the stack the parameter top to the top of the stack
		super.size++; //incrementing size after a push
	} // end method push
	
	/**
	* This method will remove and return the value of the current
	* data item at the top of the stack.
	**/
	public String pop() {
		if(this.size() == 0) {	// pop returns null if size of the stack is empty (equal to zero)
			return null;			// to avoid ArrayOutOfBoundsException error
		}
		String holder = this.getStringArray()[this.size()-1];	// holds the value of the data item that will be popped
		super.size--; //decrementing size after a pop
		return holder;
	} // end method pop
} // end class Stack
