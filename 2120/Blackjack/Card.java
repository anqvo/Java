/**
* Card class; Exact example taken from JAVA: How to Program 10th Edition (Late Objects)
* with my own addition of setFaceValue method.
* 
**/
public class Card {

	/**
	* Instance variables of Card class.
	* A Card object will contain a face, suit, and value.
	**/
	private String face;
	private String suit;
	private int value;

	/**
	* @requires two String arguments, one integer argument
	* @ensures instance variables take value of of arguments passed into constructor
	**/
	public Card(String face, String suit, int value) {
		this.face = face;
		this.suit = suit;
		this.value = value;
	} // end Card class constructor method

	/**
	* @requires face of Card is String
	* @ensures return String face
	**/
	public String getCard() {
		return this.face;
	} // end getCard method

	/**
	* @requires suit of Card is String
	* @ensures return String suit
	**/
	public String getSuit() {
		return this.suit;
	} // end getSuit method

	/**
	* @requires value of Card is integer
	* @ensures return int value
	**/
	public int getValue() {
		return this.value;
	} // end getValue method

	/**
	* @requires integer argument passed in
	* @ensures this.value is updated to value of faceCard
	**/
	public int setFaceValue(int faceCard) {
		this.value = faceCard;
		return this.value;
	} // end setFaceValue method

	/**
	* @requires String face and String suit
	* @ensures return "face of suit"; e.g. Two of Diamonds
	**/
	public String toString() {
		return this.face + " of " + this.suit + " ";
	} // end toString method
	
} // end Card class
