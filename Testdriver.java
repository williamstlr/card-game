import java.util.*;
 

public class Testdriver extends Hand{
	
		Player player1 = new Player("Austin", 0, 1);
		
		
		
		
		
		//System.out.println(player1);
	
   //private static final String Hand = null;

public static void main(String[] args)
      {
      
	  /*public void Card fillHand();
	   {
	    player1.hand.addcard();
	   };
	   */
         
             
      List arrlist = new ArrayList();
      arrlist.add("Hello");
      arrlist.add(5);    
      arrlist.add(6);
      Collections.shuffle(arrlist);


      System.out.println(arrlist);
      
      
     
      Deck deck1; 
      deck1 = new Deck();   //Create a new deck object called deck1
     
   /*
      Deck deck2 = new Deck();
      for (int i = 0; i < deck1.size(); i++)
      {
   	   shuffle(deck1);
   	   System.out.println(deck1.get(i).toString());
      }
    */
      
      //deck1.printDeck();
      //System.out.println(deck1);

     // Deck Steven = new Deck();
      
      //deck1.testText();
      
      //Hand hand1 = new Hand (); //These will be called 52-times in the Deck class to fill the deck 
      Card card1 = new Card( 1, 2); // Makes a new Card object named card1 that is somehow connected to Card
                                    // It has a Value = 1 and Suit = 2
      Card card2 = new Card( 1, 2);
      //card1.suit = 2;
      //System.out.println(card1.suit);
      
      System.out.println("The next card is the top cad"+ deck1.returnTopCard());
      
      //System.out.println("Your card is a " + card1.getValue() + " of " + card1.getSuitAsString());
      //System.out.println("Your card is a " + card2);

      //System.out.println(card1.getSuitAsString());
      
      
      
   //Card card2 
      }

private static void fillHand() {
	// TODO Auto-generated method stub
	
}//end main
   } //end class 