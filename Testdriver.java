import java.util.*;
 

public class Testdriver {
	
		
public static void main(String[] args)
      {
      
        
      
      
         TestClass testPlayer = new TestClass("Tyler",0,1);
         //System.out.println(testPlayer.hand);
         
      
         //Create new Deck object named deck1
         Deck deck1 = new Deck();
         
         
         
         //Create new Hand object named hand1
         Hand hand1 = new Hand();
         
         //This is a method I wrote in the Deck class to shuffle the cards
         deck1.shuffle();
         
         
         //For loop, gives 4 cards to the hand
         for (int i = 0; i <=3; i++)
         {
            //add one card from our deck to the hand ArrayList in our hand1 object
            hand1.hand.add(deck1.deck.get(0));
            
            //Remove the top card from the deck ArrayList of our deck1 object
            deck1.deck.remove(0);
         }
         
         deck1.deck.get(0);
         //print out the contents of hand1
         System.out.println("In your hand, you currently have " + hand1.hand.size() + " cards:");
         for (int i = 0; i < hand1.hand.size(); i++)
         {
           System.out.println(hand1.hand.get(i));

         }
         
         //Shuffle the deck and then take the first card
         /*
         Collections.shuffle(deck1.deck);
         System.out.println(deck1.deck.get(0));
         */
    
          }//End main
}//end class