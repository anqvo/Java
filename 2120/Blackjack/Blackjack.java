/**
* Blackjack class models and manages the flow of the game
* Players, user and Dealer, will take turns to hitOrStand
* until either wins/busts/draw.
**/
public class Blackjack {

	/**
	* Instance variables of Blackjack class.
	* A Blackjack object will consist of a Deck and two
	* Players: user and Dealer. 
	**/
	private Deck theDeck;
	private Player player;
	private Player dealer;

	/**
	* @requires two arguments of type Player
	* @ensures instance variables of Player take value of arguments Players
	*			  and instance variables are instantiated correctly
	**/
	public Blackjack(Player player, Player dealer) {
		this.player = player;
		this.dealer = dealer;
		this.theDeck = new Deck(); // create new Deck
	} // end Blackjack class constructor method

	/**
	* @requires 
	* @ensures both
	**/
	public void playRound() {
		boolean endRound = false; // declaring a boolean variable holder to control end of Round
		System.out.println();
		/**
		* initialDeal() and viewHands() of both Players as starting point of Round.
		* Output to user that first two cards are dealt to both Players.
		**/
		System.out.println("Here are your first two cards!");
		initialDeal();
		viewPlayerHand();
		viewDealerHand();
		initialDeal();
		viewPlayerHand();
		viewDealerHand();
		System.out.println();
		
		if(winRound() == true) { // depending on Strategy of Players and sumHand(), check to see if Round is won; if won, end of Round
			endRound = true;
		}
		/**
		* if Round not ended after initial deal, both Players take turn hitOrStand() until either wins/busts/draw
		**/
		while(endRound == false) {
			if(this.player.getStrat().hitOrStand(this.player.sumHand()) == true) { // hit depending on user Strategy and sumHand(), user hitOrStand()
				System.out.println("You hit."); // notify user hit
				this.player.addCardToHand(this.theDeck); // user hit
				viewPlayerHand(); // viewUserHand() and sumHand()
				if(bust() == true) { // if user busts after hit, check who wins, and end of Round
					winRound();
					endRound = true;
				}
			}
			else if(endRound != true) { // condition to encapsulate and separate portion of userTurn and dealerTurn
				System.out.println("You stand."); // stand depending on user Strategy and sumHand(), output of user endTurn
				System.out.println();
				if(this.dealer.getStrat().hitOrStand(this.dealer.sumHand()) == true) { // hit once user ends turn, depending on dealer Strategy and sumHand(), dealer hitOrStand()
					System.out.println("The Dealer hits."); // notify Dealer hit
					this.dealer.addCardToHand(this.theDeck); // Dealer hit
					viewDealerHand(); // viewDealerHand() and sumHand()
					if(bust() == true) { // if dealer busts after hit, check who wins, and end of Round
						winRound();
						endRound = true;
					}
				}
			}
			else
				System.out.println("The Dealer stands."); // stand depending on dealer Strategy and sumHand(), output of dealer endTurn
				System.out.println();
			if(endRound != true) { // condition to encapsulate and separate portion of dealerTurn and end of Round
				if(winRound() == true) { // if user or Dealer wins, end of Round
					endRound = true;
				}
				if(bust() == true) { // if user or Dealer busts, end of Round
					winRound();
					endRound = true;
				}
			}
		} // end while
	} // end playRound method

	/**
	* @requires theDeck as argument for both Players
	* @ensures user always dealt first; both user and dealer receive new card from theDeck
	**/
	public void initialDeal() {
		player.addCardToHand(this.theDeck);
		dealer.addCardToHand(this.theDeck);
	} // end initialDeal method

	/**
	* @requires displayHand() !display previous Card in hand
	* @ensures displayHand() display next Card in hand and sumHand() total sum of Cards' values in hand
	**/
	public void viewPlayerHand() {
		System.out.println("You drew " + this.player.displayHand() + "and your total is " + this.player.sumHand() + ".");
	} // end viewPlayerHand method

	/**
	* @requires displayHand() !display previous Card in hand
	* @ensures displayHand() display next Card in hand and sumHand() total sum of Cards' values in hand
	**/
	public void viewDealerHand() {
		System.out.println("Dealer drew " + this.dealer.displayHand() + "and Dealer's total is " + this.dealer.sumHand() + ".");
	} // end viewDealerHand method

	/**
	* @requires both Players' getStrat()'s hitOrStand() with sumHand() argument to return correct booleans
	* @ensures return boolean as true according to if-conditions, otherwise return false to continue Round
	**/
	public boolean winRound() {
		// if both user and Dealer stand, continue to sub-if-statements
		if(this.player.getStrat().hitOrStand(this.player.sumHand()) == false && this.dealer.getStrat().hitOrStand(this.dealer.sumHand()) == false) {
			// if user sumHand() < 22 and user sumHand() > dealer sumHand(), user win, end of Round
			if(this.player.sumHand() < 22 && this.player.sumHand() > this.dealer.sumHand()) {
				System.out.println("You won with " + this.player.sumHand()+ "!");
				return true;
			}
			// if dealer sumHand() < 22 and dealer sumHand() > user sumHand(), dealer win, end of Round
			else if(this.dealer.sumHand() < 22 && this.dealer.sumHand() > this.player.sumHand()) {
				System.out.println("The Dealer won with " + this.dealer.sumHand() + "!");
				return true;
			}
		}
		if(this.player.sumHand() == 21) { // if user sumHand() is 21, user win, end of Round
			System.out.println("You won with " + this.player.sumHand() + "!");
			return true;
		}
		if(this.dealer.sumHand() == 21) { // if dealer sumHand() is 21, dealer win, end of Round
			System.out.println("The Dealer won with " + this.dealer.sumHand() + "!");
			return true;
		}
		return false; // otherwise return false to continue Round
	} // end winRound method

	/**
	* @requires both Players' getStrat()'s hitOrStands() with sumHand() argument to return correct booleans
	* @ensures return boolean as true according to if-conditions, otherwise return false to continue Round
	**/
	public boolean bust() {
		if(this.player.sumHand() > 21) { // if player sumHand() > 21, user busts, dealer win, end of Round
			System.out.println("You busted with " + this.player.sumHand() + "! " + "The Dealer won with " + this.dealer.sumHand() + ".");
			return true;
		}
		if(this.dealer.sumHand() > 21) { // if dealer sumHand() > 21, dealer busts, user win, end of Round
			System.out.println("The Dealer busted with " + this.dealer.sumHand() + "! " + "You won with " + this.player.sumHand() +".");
			return true;
		}
		// if both user and Dealer stand, ocntinue to sub-if-statements
		if(this.player.getStrat().hitOrStand(this.player.sumHand()) == false && this.dealer.getStrat().hitOrStand(this.dealer.sumHand()) == false) {
			if(this.player.sumHand() == this.dealer.sumHand()) { // if user sumHand() is equal to dealer sumHand(), draw, end of Round
				System.out.println("It's a draw! No one wins.");
				return true;
			}
			if(this.player.sumHand() > 21 && this.dealer.sumHand() > 21) { // if both user sumHand() and Dealer sumHand() are greater than 21, both busts, end of Round
				System.out.println("Both players busted! No one wins.");
				return true;
			}
		}
		return false; // otherwise return false to continue Round
	} // end bust method
	
} // end Blackjack class
