package blackjack;

import java.util.Scanner;


public class BlackJack {
	
		
	
	
    public static void main(String args[]) {
    	
    	
    	//variables
    	String letterYesOrNo;
    	String player1Name = "";
    	String player2Name = "";
    	int player1Total = 0;
    	int player2Total = 0;
    	boolean gameContinuation = true;
    	boolean player2Turn = false;
    	boolean comparison = false;
    	
    	
    	//scanner object creation
    	Scanner input = new Scanner(System.in);
    	
    	
    	Card gameMaster = new Card();
    	
    	
    	//Array of card objects
    	Card[] cards = gameMaster.createCards();
    	
    	
    	
    	//Setting name for player 1
    	while(player1Name.isEmpty()) {
    		System.out.print("Enter player 1 name: ");
    		player1Name = input.nextLine();
    	}
    	
    	//Setting name for player 2
    	while(player2Name.isEmpty()) {
    		System.out.print("Enter player 2 name: ");
    		player2Name = input.nextLine();
    	}
    	
    	
    	
    	
    	
    
    	
    	//Player one
    	System.out.println("*****************************");
    	System.out.println();
    	System.out.println();
    	System.out.println("Hello " + player1Name +  "! ");
    	
    	do{
    		
			System.out.print("Do you want to draw a card? (y/n)" + "\n");
    		
			letterYesOrNo = input.nextLine();
			
			int drawnCard = gameMaster.drawCard();
			
			if(cards[drawnCard] == null){ //Card check. If card was already drawn then it will draw a new card
				continue;
			}
    		
    		if(letterYesOrNo.equalsIgnoreCase("y")) {
    			
    			System.out.println("Your card is: " + cards[drawnCard].getName());
    			player1Total = player1Total + cards[drawnCard].getValue();
    			System.out.println("Your total number is " + player1Total);
    			cards[drawnCard] = null; //removes card from the deck
    				
    				if(player1Total == 21) {
	    				System.out.println("Black Jack!");
	    				System.out.println("***********");
	    				System.out.println(player1Name + " won!");
	    				gameContinuation = false;
	    			} else if(player1Total > 21) {
	    				System.out.println("Over limit " + player1Name + "!");
	    				System.out.println("********************");
	    				System.out.println(player2Name + " won!");
	    				gameContinuation = false;
	    				player2Turn = false;
	    			}
    				
    		} else if(letterYesOrNo.equalsIgnoreCase("n")) {
    			
    			System.out.println("Well done! " + player1Name + ", your score is: " + player1Total + ". " + player2Name + "'s turn now!");
    			System.out.println("*******************************************************");
    			gameContinuation = false;
    			player2Turn = true;
    			break;
    			
    		} else {
    			System.out.println("Wrong letter! Pick Y(for yes) or N(for no)!");
    			System.out.println("Your total number is " + player1Total);
    			System.out.println();
    		}//if else
    		
   		}while(gameContinuation);
    	
    	
    	
    	
    	
    	
    	//Player two
    	if(player2Turn) {
    	System.out.println();
    	System.out.println();
    	System.out.println("Hello " + player2Name +  "! ");
    	}
    	
    	while(player2Turn){
    		
			System.out.print("Do you want to draw a card? (y/n)" + "\n");
    		
			letterYesOrNo = input.next();
			
			int drawnCard = gameMaster.drawCard();
			
				if(cards[drawnCard] == null){
				continue;
				}
    		
    		if(letterYesOrNo.equalsIgnoreCase("y")) {
    			
    			System.out.println("Your card is: " + cards[drawnCard].getName());
    			player2Total = player2Total + cards[drawnCard].getValue();
    			System.out.println("Your total number is " + player2Total);
    			cards[drawnCard] = null;
    				
    				if(player2Total == 21) {
    					System.out.println("Black Jack!");
	    				System.out.println("***********");
	    				System.out.println(player2Name + " won!");
	    				player2Turn = false;
	    			} else if(player2Total > 21) {
	    				System.out.println("Over limit " + player2Name + "!");
	    				System.out.println("********************");
	    				System.out.println(player1Name + " won!");
	    				player2Turn = false;
	    			}
    				
    		} else if(letterYesOrNo.equalsIgnoreCase("n")) {
    			System.out.println("Well done! " + player2Name + ", your score is: " + player2Total);
    			System.out.println("***********************************");
    			comparison = true;
    			break;
    		} else {
    			System.out.println("Wrong letter! Pick Y(for yes) or N(for no)!");
    			System.out.println("Your total number is " + player2Total);
    			System.out.println();
    		}//if else
    		
   		}
    	input.close();    
    	
    	
    	//information about final score for both players
    	while(comparison) {
    		System.out.println("\nSummary:\n--------------------");
	    	System.out.println(player1Name + "'s score is: " + player1Total + "\n" + player2Name + "'s score is: " + player2Total);
	    	System.out.println();
	    	break;
    	}
    	
    	//score comparison and winner announcement
    	while(comparison) {
	    	if(player1Total > player2Total) {
	    		System.out.println(player1Name + " won!");
	    		break;
	    	} else if(player1Total < player2Total){
	    		System.out.println(player2Name + " won!");
	    		break;
	    	} else {
	    		System.out.println("It's a draw!");
	    		break;
	    	}
    	}
	    	
    }//main method


   
}//main class


//To do:
// more comments
// create player class where player objects can be created instead of variables in a main method