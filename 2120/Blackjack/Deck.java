import java.security.SecureRandom;

/**
* Deck class; Exact example taken from JAVA: How to Program 10th Edition (Late Objects)
* Deck of Cards (an array of 52 Cards) is created from Deck class.
* 
**/
public class Deck {

	/**
	* Instance variables of Deck class.
	* A Deck object will have an array of Cards totalling 52
	* each Card divided into 4 different suits and 13 different faces and ranks(values).
	**/
	private Card[] deck;
	private int currentCard;
	private static final int numberOfCards = 52;
	private static final SecureRandom random = new SecureRandom();

	/**
	* @requires numberOfCards = 52, deck[] isEmpty()
	* @ensures each Card combination is used only once, Deck shuffled immediately after creation
	**/
	public Deck() {
		String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		deck = new Card[numberOfCards];
		currentCard = 0;
		for(int count = 0; count < deck.length; count++) { // go through each empty Card and assign to each Card a combination of face and rank only once to each suit
			deck[count] = new Card(faces[count % 13], suits[count / 13], ranks[count % 13]);
		}
		
		this.shuffle(); // immediately shuffle deck after creation
	} // end Deck class constructor method

	/**
	* @requires two variable holder for randomizing order of Cards: one integer and one Card
	* @ensures Deck is shuffled by randomizing order of Cards in Deck
	**/
	public void shuffle() {
		currentCard = 0;
		for(int first = 0; first < deck.length; first++) { // starting at first Card in deck
			int second = random.nextInt(numberOfCards); // randomize 52 Cards and assign first int to variable second
			Card temp = deck[first]; // assign first Card in deck to temporary Card
			deck[first] = deck[second]; // swap first Card with randomized Card from variable second
			deck[second] = temp; // swap temporary Card to randomized Card from variable second
		}
	} // end shuffle method

	/**
	* @requires currentCard = 0
	* @ensures currentCard++ having Deck deal next Card in Deck
	**/
	public Card dealOne() {
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}
		else
			return null; // return null if Deck is out of Cards
	} // end dealOne method
} // end Deck class
