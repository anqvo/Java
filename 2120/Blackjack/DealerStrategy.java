/**
* DealerStrategy class inherits superclass
* AbstractStrategy's methods and implementations
**/
public class DealerStrategy extends AbstractStrategy {

	/**
	* DealerStrategy constructor inherits superclass constructor.
	**/
	public DealerStrategy() {
		super();
	} // end DealerStrategy class constructor method

	/**
	* @requires integer argument sum
	* @ensures return correct boolean according to condition
	**/
	public boolean hitOrStand(int sum) {
		boolean answer = false; // boolean holder to control whether to hitOrStand
		if(sum < 17) {
			answer = true;
		}
		return answer;
	} // end overridden hitOrStand method
	
} // end DealerStrategy class
