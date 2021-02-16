
package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
enum Suit { Spades, Clubs, Hearts, Diamonds}
enum Face { Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace } 
List Deck;

    public DeckOfCards()
    {
        List<String> Deck = new ArrayList<>();
        for(Face face: Face.values())
        {
            for (Suit suit: Suit.values())
            {
                 Deck.add(face.name()+" of "+suit.name());
            }
        }
        this.Deck = Deck;
    }

    public Object getRandomCard()
    {
        DeckOfCards deck = new DeckOfCards();
        Random random = new Random();
        int randomIndex = random.nextInt(deck.Deck.size());
        Object randomElement = deck.Deck.get(randomIndex);
        deck.Deck.remove(randomElement);
        return randomElement;
    }
}
