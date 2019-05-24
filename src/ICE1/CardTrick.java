
package ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author sheetal
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13)+1);
            //c.setSuit(Card.SUITS[insert call to random])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        Scanner a=new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("enter card value and suit");
        int value=a.nextInt();
        String suit=a.next();
       
        Card cardobject=new Card();
        cardobject.setValue(value);
        cardobject.setSuit(suit);
        
       boolean got=false;
       for(int i=0;i<magicHand.length;i++)
       {
           if(magicHand[i].getSuit().equalsIgnoreCase(cardobject.getSuit()) && magicHand[i].getValue() == cardobject.getValue()){
               got = true;
               break;
           }
       }
       
       if(got){
           System.out.println("You won");
       }
       else{
           System.out.println("You lose");
       }
        
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit("Diamond");
        
        System.out.println("Lucky card is: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        // and search magicHand here
        //Then report the result here
    }
    
}
