/**
* abstract class AbstractStrategy hold the implemenations of
* interface Strategy's hitOrStand() method.
**/
public abstract class AbstractStrategy implements Strategy{

	/**
	* AbstractStrategy class constructor empty for it allows
	* for a Player to choose from its three sub-concrete Strategies.
	**/
	public AbstractStrategy() {
	} // end AbstractStrategy class constructor method

	/**
	* Three sub-concrete classes will override hitOrStand()
	* @requires integer argument, boolean return
	* @ensures return false
	**/
	public boolean hitOrStand(int sum) {
		return false;
	} // end hitOrStand method
	
} // end AbstractStrategy class
