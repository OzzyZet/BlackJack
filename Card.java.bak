package blackjack;

import java.util.Random;

class Card {
	
	
	//Welcome message
	static {
		
    	System.out.println("*****Welcome to BlackJack with Ozzy!*****");
    	System.out.println();
	}
	
	
	//variables
	private final String name;
	private final int value;
	
	
	//constructors
	public Card() {
		this.name = "";
		this.value = 0;
	}
	
	
	public Card(String name, int value) {

		this.name = name;
		this.value = value;
	}
	
	
	//random object creation and variables assign
	Random random= new Random();
	
	
	//methods
	public String getName() {
		return name;
	}
	
	
	public int getValue() {
		return value;
	}
	
	
	public  Card[] createCards() {
    	//ArrayList of card objects
    	Card[] cards = new Card[52];
    	//2's
    	cards[0] = new Card("2 Heart", 2);
    	cards[1] = new Card("2 Diamond", 2);
    	cards[2] = new Card("2 Spade", 2);
    	cards[3] = new Card("2 Club", 2);
    	//3's
    	cards[4] = new Card("3 Heart", 3);
    	cards[5] = new Card("3 Diamond", 3);
    	cards[6] = new Card("3 Spade", 3);
    	cards[7] = new Card("3 Club", 3);
    	//4's
    	cards[8] = new Card("4 Heart", 4);
    	cards[9] = new Card("4 Diamond", 4);
    	cards[10] = new Card("4 Spade", 4);
    	cards[11] = new Card("4 Club", 4);
    	//5's
    	cards[12] = new Card("5 Heart", 5);
    	cards[13] = new Card("5 Diamond", 5);
    	cards[14] = new Card("5 Spade", 5);
    	cards[15] = new Card("5 Club", 5);
    	//6's
    	cards[16] = new Card("6 Heart", 6);
    	cards[17] = new Card("6 Diamond", 6);
    	cards[18] = new Card("6 Spade", 6);
    	cards[19] = new Card("6 Club", 6);
    	//7's
    	cards[20] = new Card("7 Heart", 7);
    	cards[21] = new Card("7 Diamond", 7);
    	cards[22] = new Card("7 Spade", 7);
    	cards[23] = new Card("7 Club", 7);
    	//8's
    	cards[24] = new Card("8 Heart", 8);
    	cards[25] = new Card("8 Diamond", 8);
    	cards[26] = new Card("8 Spade", 8);
    	cards[27] = new Card("8 Club", 8);
    	//9's
    	cards[28] = new Card("9 Heart", 9);
    	cards[29] = new Card("9 Diamond", 9);
    	cards[30] = new Card("9 Spade", 9);
    	cards[31] = new Card("9 Club", 9);
    	//10's
    	cards[32] = new Card("10 Heart", 10);
    	cards[33] = new Card("10 Diamond", 10);
    	cards[34] = new Card("10 Spade", 10);
    	cards[35] = new Card("10 Club", 10);
    	//Jack's
    	cards[36] = new Card("Jack Heart", 10);
    	cards[37] = new Card("Jack Diamond", 10);
    	cards[38] = new Card("Jack Spade", 10);
    	cards[39] = new Card("Jack Club", 10);
    	//Queen's
    	cards[40] = new Card("Queen Heart", 10);
    	cards[41] = new Card("Queen Diamond", 10);
    	cards[42] = new Card("Queen Spade", 10);
    	cards[43] = new Card("Queen Club", 10);
    	//King's
    	cards[44] = new Card("King Heart", 10);
    	cards[45] = new Card("King Diamond", 10);
    	cards[46] = new Card("King Spade", 10);
    	cards[47] = new Card("King Club", 10);
    	//Ace's
    	cards[48] = new Card("Ace Heart", 11);
    	cards[49] = new Card("Ace Diamond", 11);
    	cards[50] = new Card("Ace Spade", 11);
    	cards[51] = new Card("Ace Club", 11);
		return cards;
    }

	
	public int drawCard() {
		int drawnCard = random.nextInt(51);
		return drawnCard;
	}
}
