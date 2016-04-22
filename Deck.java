import java.util.*;

public class Deck extends Testdriver
 {
 
 
   public static ArrayList<Card> deck1;
 
    public Deck()
      {   
      
       ArrayList<Card> deck1 = new ArrayList<Card>();
        
         for (int i = 0; i<=3; i++)
           {
            for (int x = 1; x <=13; x++) 
               {
            	System.out.println(x + " " + i);
                deck1.add(new Card(x,i));
               }
            
            }
        // deck.add({5,4});
         /*for (theValue = 0, theValue <= 3, theValue++)
            {
               for (int theSuit = 0, theSuit <=12, theSuit++)
                  {
                  deck.add( new Card (x,i));
                  }
            }*/
           for (int i = 0; i < deck1.size(); i++)
           {
        	   shuffle(deck1);
        	   System.out.println(deck1.get(i));
           }
           
                  
       }
   //Card card2 = new Card( 5, 1);
  /*/*
    public void dealCard() 
    {
     return add.hand(deck(0));
    }
   */
   /*
   for (suit = 0; suit <= 3; suit++)
   {
      for (value = 0; value <= 12; value++)
      {
         Card this = new Card( value, suit); //figure this part out
      }
   }
   */
  /*
    public Card returnTopCard()
    {
    	
    	return deck1.get(5);
    }
  */
  

 //*********************************************************/
 
 
  // private Card[] deck;
  // private int cardsDealt;
   
   /*public Deck ()
      {
      this.deck = new Card [52];
      }
   */   
 /******************************/   

    public void shuffle(ArrayList<Card> d)
    {
    	Collections.shuffle(d);
    }
      
	
/***********************************      
   public Deck(boolean isShuffled)
      {
        if (isShuffled == false)
         this.deck = new Card[52];
        else
         {
            this.deck = new Card [52];
            shuffle();
         }      
       }
***********************************/ 

   public void testText()
   {
           System.out.println("Test Text");

   }        
  
   }    
