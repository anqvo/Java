import java.util.Scanner;
/**
* An Vo
* CSCI 2120-001
* Blackjack HW
* 27 Jan 2014
**/

/**
* Runner class loops a Blackjack game by asking for user input
* to decide which Strategy is played against the Dealer of Blackjack
* after each round until user input decides to quit.
**/
public class Runner {

	// main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = 0; // declaring integer variable holder for user input
		int choice = 0; // declaring integer variable holder for user input

		//do-while loop to ensure contents of loop are executed at least once
		do {
			System.out.print("\n" + "1. Yes" + "\n" + "2. No" + "\n" + "Play a game of Blackjack? ");
			answer = scan.nextInt(); // user must decide to play by entering 1 or 2
			if(answer == 1) {
				System.out.print("\n" + "1. Timid" + "\n" + "2. Aggressive" + "\n" + "Choose your strategy: ");
				choice = scan.nextInt(); // user must decide Strategy by entering 1 or 2
				/**
				* create new TimidStrategy object
				* create new Player object, the user, pass in TimidStrategy
				* create new Dealer object, each Blackjack game must have Dealer with DealerStrategy, pass in DealerStrategy
				* create new Blackjack object, pass in two players: user and Dealer
				**/
				if(choice == 1) {
				   TimidStrategy timid = new TimidStrategy();
				   Player player = new Player(timid);
				   DealerStrategy dealerStrat = new DealerStrategy();
				   Player dealer = new Player(dealerStrat);
				   Blackjack blackjack = new Blackjack(player, dealer);
					blackjack.playRound(); // 
					
				}
				/**
				* create new AggressiveStrategy object
				* create new Player object, the user, pass in AggresiveStrategy
				* create new Dealer object, each Blackjack game must have Dealer with DealerStrategy, pass in DealerStrategy
				* create new Blackjack object, pass in two players: user and Dealer
				**/
				if(choice == 2) {
					AggressiveStrategy aggressive = new AggressiveStrategy();
					Player player = new Player(aggressive);
					DealerStrategy dealerStrat = new DealerStrategy();
					Player dealer = new Player(dealerStrat);
					Blackjack blackjack = new Blackjack(player, dealer);
					blackjack.playRound();
				}
			}
		} // end do of do-while
		while (answer != 2); // condition to repeat do-while loop or end loop
		if(answer == 2) {
			System.out.println("\n" + "Thanks. Come again!"); // output to user and end of program
		} // end do-while
	} // end main method

} // end Runner class
