import java.util.*;

public class Deck
 {
 
 
   ArrayList deck = new ArrayList();
   
   
   
 
    public Deck()
      {   
      
       //Create an ArrayList named deck1
       
        
         //Fill deck1 with 52 cards consisting of 4 suits with 13 cards each
         for (int i = 0; i<=3; i++)
           {
            for (int x = 1; x <=13; x++) 
               {
                deck.add(new Card(x,i));
               }
            
            }
            
            
            
            //System.out.println(deck1.size());
            //System.out.println("Marker");
       
            
      }//end Deck()
        
     
  public void shuffle()
  {
      Collections.shuffle(deck);
  }           
                  
       
   public void dealCard()
   {
      
         System.out.println("Returning" + deck.get(0));
         //return deck.get(0);
         deck.remove(0);
      
   }


   public void testText()
   {
     System.out.println("Test Text");
   
   }        
  
}    
