/**
* This abstract class AbstractCollection implements the
* the abstract methods from interface Collection, but also
* includes its own methods for its subclasses, Stack and Queue,
* to inherit.
**/
public abstract class AbstractCollection implements Collection {
	/**
	* Declaring the instance variables.
	**/
	private String[] stringArray;
	protected int size;
	
	/**
	* This is AbstractCollection's constructor which
	* instantiates each instance variable.
	**/
	public AbstractCollection() {
		this.stringArray = new String[4]; // assigning stringArray an initial length of 4
		this.size = 0; // assigning size to 0, although the constructor would do so by default
	} // end AbstractCollection constructor
	
	/**
	* This method returns the entire String array meaning
	* all the items inside the array.
	**/
	public String[] getStringArray() {
		return this.stringArray;
	} // end method getStringArray
	
	/**
	* This method returns the value of the current data item waiting
	* to "come off" of a data structure without actually modifying it.
	**/
	public String peek() {
		if(this.size() == 0) {	// peek returns null if size of array is empty (equal to zero)
			return null;			// to avoid an ArrayOutOfBoundsException error
		}
		return stringArray[this.size()-1];
	} // end method peek
	
	/**
	* This method returns an integer value the amount of data
	* items inside the array or on the data structure.
	**/
	public int size() {
		return this.size;
	} // end method size
	
	/**
	* This method returns a boolean value whether or not the array/data structure
	* is empty.
	**/
	public boolean isEmpty() {
		if(this.size == 0) // if the array is empty, isEmpty returns true
			return true;
		return false;	// otherwise, false meaning there is currently one or more data items inside the array
	} // end method isEmpty
	
	/**
	* This method is intended to expand the Array (duplicate its length).
	**/
	public void expandArray() {
		String[] newArray = new String[(this.stringArray.length + 1) * 2];	// building a new String array with the
																									// original String array's length + 1
																									// and doubling it (length + 1 to match
																									// the array when its size is full
		for(int i = 0; i < this.stringArray.length; i++) {	// looping over each data item in the array
			newArray[i] = this.stringArray[i];					// to copy into the same place in the new array
		}
		this.stringArray = newArray; // assigning to the original String array the new String array
	} // end expandArray
} // end class AbstractCollection
