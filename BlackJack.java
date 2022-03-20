package blackjack;

import java.util.Scanner;


public class BlackJack {
	
		
	
	
    public static void main(String args[]) {
    	
    	
    	//variables
    	int totalNumber = 0;
    	String letterYesOrNo;
    	String player1Name = null;
    	String player2Name = null;
    	boolean gameContinuation = true;
//    	boolean player2Turn = false;
    	
    	
    	//scanner object creation
    	Scanner input = new Scanner(System.in);
    	
    	
    	Card gameMaster = new Card();
    	
    	
    	//Array of card objects
    	Card[] cards = gameMaster.createCards();
    	
    	
    	
    	//Setting name for player 1
    	while(player1Name == null) {
    		System.out.print("Enter player 1 name: ");
    		player1Name = input.next();
    	}
    	
    	
    	//Setting name for player 1
    	while(player2Name == null) {
    		System.out.print("Enter player 2 name: ");
    		player2Name = input.next();
    	}
    
    	
    	//Player one
    	do{
    		
			System.out.print("Hello " + player1Name +  "! Do you want to draw your card? (y/n)" + "\n");
    		
			letterYesOrNo = input.next();
			
			int drawnCard = gameMaster.drawCard();
			
			if(cards[drawnCard] == null){
				continue;
			}
    		
    		if(letterYesOrNo.equalsIgnoreCase("y")) {
    			
    			System.out.println("Your card is: " + cards[drawnCard].getName());
    			totalNumber = totalNumber + cards[drawnCard].getValue();
    			System.out.println("Your total number is " + totalNumber);
    			cards[drawnCard] = null;
    				
    				if(totalNumber == 2001) {
	    				System.out.println("BlackJack! " + player1Name + " won!");
	    				gameContinuation = false;
	    			} else if(totalNumber > 2001) {
	    				System.out.println("You lose " + player1Name + "! Your score is " + totalNumber);
	    				gameContinuation = false;
	    			}
    				
    		} else if(letterYesOrNo.equalsIgnoreCase("n")) {
    			
    			System.out.println("Well done! Your score is: " + totalNumber + " " + player1Name + "! " + player2Name + "'s turn now!");
    			gameContinuation = false;
  //  			player2Turn = true;
    			break;
    			
    		} else {
    			System.out.println("Wrong letter! Pick Y(for yes) or N(for no)!");
    			System.out.println("Your total number is " + totalNumber);
    			System.out.println();
    		}//if else
    		
   		}while(gameContinuation);
    	input.close();    
   	
    	
    	
    }//main method



  
}//main class


//To do:
//- player 2 function after player one is finished with the draws and then compare results
//- option what happen next after choosing "N"
//- more comments
//- change the draw card block loop to a do/while loop for more clean code
//- change some of the print to print instead of println to make it easier and clearer
//- switch statement instead of if else to test 'y' and 'n'
//- create removeCard methods