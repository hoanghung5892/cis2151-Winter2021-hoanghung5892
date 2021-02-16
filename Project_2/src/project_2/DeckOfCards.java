
package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    ArrayList<Card>  deck;
    public DeckOfCards()
    {
      deck = new ArrayList<Card>(52);
        for(Card.Face face: Card.Face.values())
        {
            for (Card.Suit suit: Card.Suit.values())
            {
               deck.add(new Card(face,suit));
            }
        }
    }
    

    public Object getRandomCard()
    {
        Random random = new Random();     
        int randomIndex = random.nextInt(deck.size());
        String randomElement = deck.get(randomIndex).toString();
        deck.remove(randomElement);
        return randomElement;
        
    }
}
