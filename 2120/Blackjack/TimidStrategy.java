/**
* TimidStrategy class inherits superclass
* AbstractStrategy's methods and implementations
**/
public class TimidStrategy extends AbstractStrategy {

	/**
	* TimidStrategy constructor inherits superclass constructor.
	**/
	public TimidStrategy() {
		super();
	} // end TimidStrategy class constructor method
	
	/**
	* @requires integer argument sum
	* @ensures return correct boolean according to condition
	**/
	public boolean hitOrStand(int sum) {
		boolean answer = false; // boolean holder to control whether to hitOrStand
		if(sum < 14) {
			answer = true;
		}
		return answer;
	} // end overridden hitOrStand method
	
} // end TimidStrategy class
