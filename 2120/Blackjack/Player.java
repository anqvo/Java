/**
* Player player and Player dealer are created
* using this Player class.
**/
public class Player {

	/**
	* Instance variables of Player class.
	* A Player object will have an AbstractStrategy,
	* a hand, and a cardCount.
	**/
	private AbstractStrategy strategy;
	private Card[] hand;
	private int cardCount;

	/**
	* @requires argument of type/subtype of AbstractStrategy
	* @ensures instance variable strategy take value of argument strategy
	*			  and all instance variables are correctly instantiated
	**/
	public Player(AbstractStrategy strategy) {
		this.strategy = strategy;
		this.hand = new Card[12]; // Card[12] because 12 is total # of cards possible before Player will bust
		this.cardCount = 0;
	} // end Player class constructor method

	/**
	* @requires an object of type/subtype of AbstractStrategy is passed into Player constructor correctly
	* @ensures return TimidStrategy, DealerStrategy, or AggressiveStrategy
	**/
	public AbstractStrategy getStrat() {
		return this.strategy;
	} // end getStrat method

	/**
	* @requires argument of Deck !isEmpty()
	* @ensures card++ new card dealt after each method call
	**/
	public void addCardToHand(Deck deck) {
		Card card = deck.dealOne();
		hand[cardCount] = card; // when method is called, new card is placed into next index of hand[]
		cardCount++;
	} // end addCardToHand method

	/**
	* @requires class Card's toString()
	* @ensures return "face" and "suit" of next Card in hand[] from class Card's toString()
	**/
	public String displayHand() {
		String display = "";
		for(int i = 0; i < cardCount; i++) {
			display = hand[i].toString(); // go to most recent Card added to hand[] and print from toString() the face + suit of Card
		}
		return display; // will only return most recent Card added to Hand
	} // end displayHand method

	/**
	* @requires class Card's getValue()
	* @ensures return integer sum of all Cards in hand[]
	**/
	public int sumHand() {
		int sum = 0;

		/**
		* go to most recent Card added to hand[] and to sum Player's hand[]
		**/
		for(int i = 0; i < cardCount; i++) {
			if(hand[i].getValue() > 10) {
				sum = hand[i].setFaceValue(10) + sum; // if Card is a faceCard (Jack, Queen, or King), change their value to 10 and add to sum of hand
			}
			else
				sum = hand[i].getValue() + sum; // take Card values from hand[] and add to sum
		}
		return sum;
	} // end sumHand method
	
} // end Player class
