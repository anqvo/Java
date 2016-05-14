/**
* AggressiveStrategy class inherits superclass
* AbstractStrategy's methods and implementations
**/
public class AggressiveStrategy extends AbstractStrategy {

	/**
	* AggressiveStrategy constructor inherits superclass constructor.
	**/
	public AggressiveStrategy() {
		super();
	} // end AggressiveStrategy class constructor method

	/**
	* @requires integer argument sum
	* @ensures return correct boolean according to condition
	**/
	public boolean hitOrStand(int sum) {
		boolean answer = false; // boolean holder to control whether to hitOrStand
		if(sum < 20) {
			answer = true;
		}
		return answer;
	} // end overridden hitOrStand method
	
} // end AggressiveStrategy class
