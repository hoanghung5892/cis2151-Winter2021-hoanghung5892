
package project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Card implements Comparable<Card>{

    enum Suit { Spades, Clubs, Hearts, Diamonds}
    enum Face { Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace }
    enum Rank { HighCard, OnePair, TwoPair, ThreeOfAKind, Straight, Flush, FullHouse, FourOfAKind, StraightFlush}
    private Suit suit;
    private Face face;
    private Rank rank;
    public ArrayList Card;
    
    public Card()
    {
        this.suit = suit;
        this.face = face;
    }
    public void printCard()
    {
        List<String> Card = new ArrayList<>();
        for(Face face: Face.values())
        {
            for (Suit suit: Suit.values())
            {
                Card.add(face.name()+" of "+suit.name());
                //System.out.println(face.name()+" of "+suit.name());
                System.out.println(Card);
            }
        }
    }
    public void DeckofCard(){
        List<String> Card = new ArrayList<>();
        for(Face face: Face.values())
        {
            for (Suit suit: Suit.values())
            {
                Card.add(face.name()+" of "+suit.name());
            }
        }
        
    }
    public int getSize(){
        int a;
        Card card = new Card();
        a = card.Card.size();
        return a;
    }
    public String getRandomCard(int a){
        List<String> Card_1 = new ArrayList<>();
        String randomElement = Card_1.get(a);
        return randomElement;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public int compareTo(Card other) {
        return face.ordinal() - other.face.ordinal();
        
    }
    }

    
